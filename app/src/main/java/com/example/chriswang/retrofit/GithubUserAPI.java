package com.example.chriswang.retrofit;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GithubUserAPI {
    String ENDPOINT = "https://api.github.com";
    @GET("users/{user}")
    Observable<GithubUser> getUser(@Path("user") String user);
}
