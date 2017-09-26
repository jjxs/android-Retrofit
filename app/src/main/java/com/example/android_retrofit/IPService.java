package com.example.android_retrofit;

import com.example.android_retrofit.model.IpModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by Fangzheng on 2017/9/26.
 */

public interface IPService {
    @Headers({
            "Accept-Encoding: application/json",
            "User-Agent: MoonRetrofit"
    })
    @GET("getIpInfo.php?ip=59.108.54.37")
    Call<IpModel> getIpMsg();


}
