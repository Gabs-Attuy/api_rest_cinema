package com.api.cinema.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OTPService {
    private static final String num = "0123456789";
    private static final int length = 6;

    public static char[] OTP () {
        char[] otp = new char[length];
        Random r = new Random();
        for(int i = 0; i < length; i++){
            otp[i] = num.charAt(
                    r.nextInt(length)
            );
        }
        return otp;
    }
}
