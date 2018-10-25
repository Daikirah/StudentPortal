package com.daikirah.joshua.studentportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PortalActivity extends AppCompatActivity {


    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);
        String url = getIntent().getStringExtra("url");
        myWebView = findViewById(R.id.webview);
        myWebView.loadUrl(url);
    }



}
