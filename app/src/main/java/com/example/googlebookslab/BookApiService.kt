package com.example.googlebookslab

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://www.googleapis.com/books/v1/" //change URL
private val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
    .addConverterFactory(ScalarsConverterFactory.create()).build()
private const val QUERY_STRING =
    "volumes?q=android&maxResults=5"
interface BookApiService {
    @GET(QUERY_STRING)
    fun getBooksRequest(): Call<String>
}
object BookApi {
    val bookApi : BookApiService by lazy {
        retrofit.create(BookApiService::class.java)
    }
}