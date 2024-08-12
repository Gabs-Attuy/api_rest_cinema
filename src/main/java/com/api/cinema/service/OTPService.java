package com.api.cinema.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Random;

@Service
public class OTPService {
    private static final String num = "0123456789";
    private static final int length = 6;

    public OTPService() throws IOException {
    }

    public String generateOTP () {
        char[] otp = new char[length];
        Random r = new Random();
        for(int i = 0; i < length; i++){
            otp[i] = num.charAt(
                    r.nextInt(length)
            );
        }
        return new String(otp);
    }

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://api.themoviedb.org/3/genre/movie/list?language=en")
            .get()
            .addHeader("accept", "application/json")
            .build();

    Response response = client.newCall(request).execute();
}
