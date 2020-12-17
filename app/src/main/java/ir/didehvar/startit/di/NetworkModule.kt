package ir.didehvar.startit.di

import android.os.Environment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object NetworkModule {
//    @Singleton
//    @Provides
//    @Named("cached")
//    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder()
//        .readTimeout(1, TimeUnit.MINUTES)
//        .writeTimeout(1, TimeUnit.MINUTES)
//        .cache(Cache(Environment.getDownloadCacheDirectory(), 10 * 1024 * 1024))
//        .build()
//
//    @Singleton
//    @Provides
//    @Named("non_cached")
//    fun provideNonCachedOkHttpClient(): OkHttpClient = OkHttpClient.Builder()
//        .readTimeout(1, TimeUnit.MINUTES)
//        .writeTimeout(1, TimeUnit.MINUTES)
//        .build()
//
//    @Provides
//    @Singleton
//    fun provideGson(): Gson =
//        GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()
//
//
//    @Singleton
//    @Provides
//    fun provideRetrofit(gson: Gson, @Named("cached") client: OkHttpClient): Retrofit.Builder =
//        Retrofit.Builder()
//            .client(client)
//            .addConverterFactory(GsonConverterFactory.create(gson))
//
//    @Singleton
//    @Provides
//    fun provideApi(builder: Retrofit.Builder): NewsAPI =
//        builder.baseUrl("http://newsapi.org/")
//            .build()
//            .create(NewsAPI::class.java)

}