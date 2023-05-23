package com.lovely.shareredpreference

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lovely.shareredpreference.SimpleViewModel



class SimpleViewModelFactory(private val context: Context) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SimpleViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return SimpleViewModel(context) as T

          }
  throw IllegalArgumentException("unknown model view")
}
}