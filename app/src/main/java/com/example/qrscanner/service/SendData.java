package com.example.qrscanner.service;

import retrofit2.http.POST;

public interface SendData {

    @POST
    String decodeQRCode(String byteCode);
}
