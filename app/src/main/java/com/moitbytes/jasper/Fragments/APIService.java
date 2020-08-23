package com.moitbytes.jasper.Fragments;

import com.moitbytes.jasper.Notifications.MyResponse;
import com.moitbytes.jasper.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
            "Authorization:key=AAAADgal5BE:APA91bFapFiRdql-KmPB0uqj7PJUvDLGhVxobgROi7Vb-nA1H1puTzP-Vhzo3XJztrNvtMVo9VvqmO7VX1MWBGrAWIdwtOYi_CksK6oJ6iqeD2x-KDwrAIkUerd2b053inVFbCkj5Eyi"
                    }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
