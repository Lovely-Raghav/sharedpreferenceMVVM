package com.lovely.shareredpreference

import android.content.Context
import android.content.SharedPreferences
private const val SP_FILE_NAME="ChetuT8"
private const val FNAME="fname"
private const val LNAME="lname"

class SPRepository(private var context:Context) {
    private var SharedPreferences:SharedPreferences = context.getSharedPreferences("ChetuT8",Context.MODE_PRIVATE)
    private var editor : SharedPreferences.Editor= SharedPreferences.edit()
    fun setFirstName(fname:String){
        editor.putString(FNAME,fname)
        editor.commit()
    }
    fun setLastName(lname:String){
        editor.putString(LNAME,lname)
        editor.commit()
    }

}