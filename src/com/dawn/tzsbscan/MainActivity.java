package com.dawn.tzsbscan;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		UpdateManager mUpdateManger = new UpdateManager(MainActivity.this);// 注意此处不能传入getApplicationContext();会报错，因为只有是一个Activity才可以添加窗体
		mUpdateManger.checkUpdateInfo();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void scan(View view){
		Intent intent = new Intent();
		intent.setClass(MainActivity.this, MipcaActivityCapture.class);
		startActivity(intent);
		
	}
	public void jqueryMobile(View view){
		Intent intent = new Intent();
		intent.setClass(MainActivity.this, WebViewActivity.class);
		startActivity(intent);
		
	}
}
