package com.example.bhuwan.testapp.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by bhuwan on 7/30/16.
 */
public class FileDownloaderService extends IntentService{

    private static final String TAG = "fie.downloader.service";

    public FileDownloaderService() {
        super("FileDownloaderService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // service main function goes here..
        Log.i(TAG, "The file downloader service has now started....");
    }
}
