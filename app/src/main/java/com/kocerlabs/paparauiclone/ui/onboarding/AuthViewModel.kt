package com.kocerlabs.paparauiclone.ui.onboarding

import androidx.lifecycle.ViewModel
import com.kocerlabs.paparauiclone.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: HomeRepository
) : ViewModel() {

    // Bunu özellikle suspend yaptım, fragment'ta çağıracağım
    // Normalde asenkron işlemleri genelde viewModel'de yaparız ANCAK
    // token geldikten sonra kaydedip, başka bir fragment'a yönlendirmem gerekiyor.
    // İşlem asenkron olduğu için token kaydedilmeden başka fragment'a yönlendirme şansı da var.
    // bu nedenle bu fonksiyonu suspend yapıp View Katmanından çağıracağım.
    suspend fun saveAuthToken(token: String) = repository.saveAuthToken(token)



}