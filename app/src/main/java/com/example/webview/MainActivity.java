package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        //Javascript enabled
        webView.getSettings().setJavaScriptEnabled(true);

        //by default, web will open up on the available browsers, i.e. Chrome.
        //the code below will tell the system that the webView will be launched within the app!
        webView.setWebViewClient(new WebViewClient());

        //Launch my website
        webView.loadUrl("https://www.vinuruban.com");

//        //Create a page in html and launch it
//        webView.loadData("<hmtl><body><h1>Hello world!</h1><p>This is my cool website!</p></body></html>","text/html","UTF-8");


    }
}