package com.altyyev.shoplist.di

import android.content.Context
import androidx.room.Room
import com.altyyev.shoplist.data.ApplicationDatabase
import com.altyyev.shoplist.utils.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        ApplicationDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(applicationDatabase: ApplicationDatabase) = applicationDatabase.dao
}