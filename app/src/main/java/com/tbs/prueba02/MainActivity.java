package com.tbs.prueba02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private WebView miWebView;
    private Button backButton;
    private String url1 = "http://192.168.21.248:7002/broker/#/login";
    private String url2 = "https://www.google.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backButton = findViewById(R.id.backButton);
        miWebView = findViewById(R.id.wv_main);
        miWebView.getSettings().setJavaScriptEnabled(true);
        miWebView.setWebViewClient(new WebViewClient());
        miWebView.loadUrl(url2);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (miWebView.canGoBack()){
                    miWebView.goBack();
                }else {
                    finish();
                }
            }
        });

    }



    @Override
    public void onBackPressed(){
        if (miWebView.canGoBack()){
            miWebView.goBack();
        }else {
            finish();
        }
    }
}
