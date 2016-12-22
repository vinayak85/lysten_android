package com.example.vin.myapplication;

/**
 * Created by vin on 09-11-2016.
 */
import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
public interface ApiService {
    //Retrofit turns our institute WEB API into a Java interface.
    //So these are the list available in our WEB API and the methods look straight forward

    //i.e. http://localhost/api/institute/Students
    @GET("/statemaster/getallitemmaster")
    public void getState(Callback<List<State>> callback);

    //i.e. http://localhost/api/institute/Students/1
    //Get student record base on ID
/*    @GET("/institute/Students/{id}")
    public void getStudentById(@Path("id") Integer id,Callback<Student> callback);

    //i.e. http://localhost/api/institute/Students/1
    //Delete student record base on ID
    @DELETE("/institute/Students/{id}")
    public void deleteStudentById(@Path("id") Integer id,Callback<Student> callback);

    //i.e. http://localhost/api/institute/Students/1
    //PUT student record and post content in HTTP request BODY
    @PUT("/institute/Students/{id}")
    public void updateStudentById(@Path("id") Integer id,@Body Student student,Callback<Student> callback);

    //i.e. http://localhost/api/institute/Students
    //Add student record and post content in HTTP request BODY
    @POST("/institute/Students")
    public void addStudent(@Body Student student,Callback<Student> callback);*/



    //EMAIL ID IS CONFIRM CHECK
    @POST("/Account/CheckEmailConfirm")
    public void addStudent(@Body "",Callback<Student> callback);
 
}
