package com.example.clase1309;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ActivityWeb extends AppCompatActivity {
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv1= (WebView) findViewById(R.id.wv1);
        String url=getIntent().getStringExtra("url");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://"+url);


    }

    public void back(View view){
        finish();
    }
}