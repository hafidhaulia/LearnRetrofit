package com.hafidhaulia.learnretrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }
}
