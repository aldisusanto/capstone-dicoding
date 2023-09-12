package com.next.up.code.core.di


import androidx.room.Room
import com.next.up.code.core.data.CoreRepository
import com.next.up.code.core.data.api.ApiDataSource
import com.next.up.code.core.data.api.network.NetworkClient
import com.next.up.code.core.data.local.LocalDataSource
import com.next.up.code.core.data.local.room.CapstoneDatabase
import com.next.up.code.core.domain.repository.ICoreRepository
import com.next.up.code.core.domain.usecase.CoreInteract
import com.next.up.code.core.domain.usecase.CoreUseCase
import com.next.up.code.core.utils.AppExecutors
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val useCaseModule = module {
    factory<CoreUseCase> { CoreInteract(get()) }
}

val repositoryModule = module {
    single { LocalDataSource(get()) }
    single { NetworkClient.getApiService() }
    single { ApiDataSource(get()) }
    factory { AppExecutors() }
    single<ICoreRepository> { CoreRepository(get(), get(), get()) }
}
val databaseModule = module {
    factory { get<CapstoneDatabase>().touristAttractionDao() }
    single {
        val passphrase: ByteArray = SQLiteDatabase.getBytes("capstone".toCharArray())
        val factory = SupportFactory(passphrase)
        Room.databaseBuilder(
            androidContext(),
            CapstoneDatabase::class.java, "Capstone.db"
        ).fallbackToDestructiveMigration().openHelperFactory(factory).build()
    }
}