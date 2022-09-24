package com.gopal.AroundMe

import com.gopal.AroundMe.Model.Results
import com.gopal.AroundMe.Remote.IGoogleAPIService
import com.gopal.AroundMe.Remote.RetrofitClient


object Common {
    var currentResult: Results? = null

    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService:IGoogleAPIService
    get()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}