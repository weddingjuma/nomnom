package com.rishi.nomnom.network;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by rishi on 10/6/17.
 */

public interface WebService {
    @GET("/nearbysearch/json")
    Observable<ApiResponse> getRestaurants(@QueryMap Map<String, String> params);

    @GET("/details/json")
    Observable<ApiResponse> getRestaurantDetail(@QueryMap Map<String, String> params);
}
