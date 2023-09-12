package com.next.up.code.capstone

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.next.up.code.capstone.databinding.ActivityMainBinding
import com.next.up.code.capstone.ui.home.HomeFragment
import com.next.up.code.core.utils.Utils

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding
    private var root: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        root = binding?.root
        setContentView(root)
        supportActionBar?.hide()
        showHomeFragment()
        binding?.fab?.setOnClickListener(this@MainActivity)
    }

    private fun showFavoriteActivity() {
        Utils.navigateToAnotherActivityWithData(
            this@MainActivity,
            Class.forName("com.next.up.code.favorite.FavoriteActivity")

        )
    }

    @SuppressLint("CommitTransaction")
    private fun showHomeFragment() {
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, homeFragment).commit()
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.fab -> {
                showFavoriteActivity()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}