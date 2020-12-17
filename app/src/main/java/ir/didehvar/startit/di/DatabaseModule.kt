package ir.didehvar.startit.di

import android.content.Context
import ir.didehvar.startit.data.local.Database
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object DatabaseModule {

    @Singleton
    @Provides
    fun getDatabase(@ApplicationContext context: Context): Database = Room.databaseBuilder(context, Database::class.java, "database.db").build()
}