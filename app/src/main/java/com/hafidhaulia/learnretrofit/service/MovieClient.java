package com.hafidhaulia.learnretrofit.service;

import com.hafidhaulia.learnretrofit.model.Result;


import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieClient {

    @GET("movie/now_playing?api_key=<<TMDB_API_KEY>>")
    Call<Result> nowPlaying();

}
