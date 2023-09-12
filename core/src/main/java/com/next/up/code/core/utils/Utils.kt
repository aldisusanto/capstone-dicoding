package com.next.up.code.core.utils

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.NumberFormat
import java.util.Locale
import java.util.regex.Matcher
import java.util.regex.Pattern

object Utils {
    fun navigateToAnotherActivityWithData(
        context: Context,
        targetActivity: Class<*>,
        data: String? = null
    ) {
        val intent = Intent(context, targetActivity)
        data?.let {
            intent.putExtra("data", data)
        }

        context.startActivity(intent)
    }

    fun String.withCurrencyFormat(): String {
        val rupiahExchangeRate = 15597.50000
        val euroExchangeRate = 1.05850

        var priceOnDollar = this.toDouble() / rupiahExchangeRate

        var mCurrencyFormat = NumberFormat.getCurrencyInstance()
        val deviceLocale = Locale.getDefault().country
        when {
            deviceLocale.equals("ES") -> {
                priceOnDollar *= euroExchangeRate
            }

            deviceLocale.equals("ID") -> {
                priceOnDollar *= rupiahExchangeRate
            }

            else -> {
                mCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US)
            }
        }
        return mCurrencyFormat.format(priceOnDollar)
    }

    fun setupRecycleView(
        adapter: RecyclerView.Adapter<*>,
        recycleView: RecyclerView?,
        context: Context
    ) {
        with(recycleView) {
            this?.adapter = adapter
            this?.layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )
            this?.setHasFixedSize(true)
        }
    }

    fun getVideoIdFromYoutubeUrl(url: String?): String {
        var videoId = ""
        val regex =
            "http(?:s)?:\\/\\/(?:m.)?(?:www\\.)?youtu(?:\\.be\\/|be\\.com\\/(?:watch\\?(?:feature=youtu.be\\&)?v=|v\\/|embed\\/|user\\/(?:[\\w#]+\\/)+))([^&#?\\n]+)"
        val pattern: Pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE)
        val matcher: Matcher = pattern.matcher(url)
        if (matcher.find()) {
            videoId = matcher.group(1)
        }
        return videoId
    }

}