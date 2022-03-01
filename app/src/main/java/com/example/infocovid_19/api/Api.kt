package com.example.infocovid_19.api

import com.example.infocovid_19.model.IndonesiaResponse
import com.example.infocovid_19.model.ProvinceResponse
import retrofit2.http.GET
import retrofit2.Call

interface Api {
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>


}