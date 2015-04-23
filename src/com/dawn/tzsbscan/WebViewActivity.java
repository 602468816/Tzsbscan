package com.dawn.tzsbscan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class WebViewActivity extends Activity {

	private WebView webView;
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		webView=(WebView)findViewById(R.id.webview);
		WebSettings  webSettings = webView.getSettings();
		webView.setWebChromeClient(new WebChromeClient());
		webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
		webSettings.setJavaScriptEnabled(true);
		webView.loadUrl("file:///android_asset/jqueryMobile/demos/index.html");
		//webView.loadUrl("file:///android_asset/company/baseinfo.html");
	}


}
