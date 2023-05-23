package com.lovely.shareredpreference

import android.content.Context
import android.view.View
import androidx.lifecycle.ViewModel


class SimpleViewModel(private val context : Context): ViewModel() {
    private val SPRepository:SPRepository = SPRepository(context)
      fun setFirstName(fname:String){
          SPRepository.setFirstName(fname)
      }
  fun setLastName(lname:String){
      SPRepository.setLastName(lname)
  }
}