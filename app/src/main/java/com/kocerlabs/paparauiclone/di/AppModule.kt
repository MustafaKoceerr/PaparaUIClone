package com.kocerlabs.simplifiedcodingmvvm.di

import com.kocerlabs.paparauiclone.data.network.HomeApi
import com.kocerlabs.paparauiclone.data.network.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideHomeApi(remoteDataSource: RemoteDataSource): HomeApi {
        return remoteDataSource.buildApi(HomeApi::class.java, RemoteDataSource.BASE_URL_GIT)
    }

    /*
    @Provides metodları asenkron yapılamaz, bu nedenle çözüm için bazı alternatif yaklaşımlar kullanabiliriz.
     */
    /*
        @Provides
        fun provideUserApi(
            remoteDataSource: RemoteDataSource, userPreferences: UserPreferences
        ): UserApi {
            val token = runBlocking {
                userPreferences.authToken.first() // Token'i senkronize alıyoruz.
            }
            return remoteDataSource.buildApi(UserApi::class.java, token)
        }
     */

}
/**
 * Notlar
 * Performans Konusu: runBlocking, engelleyici bir çağrı olduğu için yalnızca gerektiğinde kullanılır. Bu senaryoda, AppModule'deki @Provides yöntemi bir kez çağrılır ve bu, performansı olumsuz etkilemez.
 * Alternatif Yaklaşım (Daha Dinamik Header): Token her zaman değişebiliyorsa, header'ı dinamik olarak ekleyen bir interceptor kullanmayı düşünebilirsiniz. Bu yöntem, Retrofit'i oluştururken token'i kullanmak yerine, interceptor aracılığıyla her çağrıda token'i otomatik olarak ekler.
 */

/**
 * Hangi Yöntemi Seçmelisiniz?
 * Eğer token her zaman aynı ise ve genellikle yalnızca oturum açma sırasında değişiyorsa, birinci yöntem (runBlocking) yeterlidir.
 * Eğer token sık sık değişiyorsa (örneğin, token refresh mekanizmasıyla), ikinci yöntem (dinamik interceptor) daha uygun olacaktır.
 */