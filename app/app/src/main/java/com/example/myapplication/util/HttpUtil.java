package com.example.myapplication.util;

import android.app.DownloadManager;
import android.view.textclassifier.TextLinks;

public class HttpUtil {
    public static void sendOkHttpRequest(String address.okthhp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
