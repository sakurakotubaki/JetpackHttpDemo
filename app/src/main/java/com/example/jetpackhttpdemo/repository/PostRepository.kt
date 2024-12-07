package com.example.jetpackhttpdemo.repository

import com.example.jetpackhttpdemo.api.JsonPlaceholderApi
import com.example.jetpackhttpdemo.data.Post
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostRepository {
    private val api: JsonPlaceholderApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JsonPlaceholderApi::class.java)
    }

    suspend fun getPosts(): List<Post> = api.getPosts()
}