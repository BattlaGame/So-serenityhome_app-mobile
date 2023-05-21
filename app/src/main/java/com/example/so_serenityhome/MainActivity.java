package com.example.so_serenityhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView)findViewById(R.id.webview);
        myWebView.loadUrl("https://app.superhote.com/#/get-available-rentals/QGxkGD8ET7vGr9ix8mglm7naI");

    }
}