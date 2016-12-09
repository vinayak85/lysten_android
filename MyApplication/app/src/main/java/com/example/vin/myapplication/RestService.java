package com.example.vin.myapplication;

/**
 * Created by vin on 09-11-2016.
 */
public class RestService {

    //You need to change the IP if you testing environment is not local machine
    //or you may have different URL than we have here
    private static final String URL = "http://api.lystenglobal.com/api/";
    private retrofit.RestAdapter restAdapter;
    private ApiService apiService;

    public RestService()
    {
        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        apiService = restAdapter.create(ApiService.class);
    }

    public ApiService getService()
    {
        return apiService;
    }
}
