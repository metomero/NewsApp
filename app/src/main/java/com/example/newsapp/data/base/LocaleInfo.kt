package com.example.newsapp.data.base

import java.util.*

object LocaleInfo {
    var locale : Locale? = null
    var language : String = "en"
    var country : String = "us"

    fun setLanguage(){
        if(locale != null){
            language = locale!!.language.split('_')[0]
        }
    }

    fun setCountry(){
        country = locale!!.country.toString()
    }
}