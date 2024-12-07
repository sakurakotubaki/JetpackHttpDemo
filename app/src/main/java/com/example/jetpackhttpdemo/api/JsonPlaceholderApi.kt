package com.example.jetpackhttpdemo.api

import com.example.jetpackhttpdemo.data.Post
import retrofit2.http.GET

interface JsonPlaceholderApi {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}