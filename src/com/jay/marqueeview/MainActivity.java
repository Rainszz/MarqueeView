package com.jay.marqueeview;

import java.util.ArrayList;
import java.util.List;

import com.jay.marqueeview.widget.MarqueeView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private MarqueeView mv_list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findView();
		setEvent();
	}
	
	private void findView() {
		mv_list = (MarqueeView) findViewById(R.id.mv_list);
	}
	
	private void setEvent() {
		List<String> info = new ArrayList<String>();
        info.add("1. 淘宝头条");
        info.add("2. 京东快报");
        info.add("3. 博客地址：http://blog.csdn.net/jayliu1989/article/details/51713420");
        info.add("4. 项目地址：https://github.com/Winfred1989/MarqueeView");
        info.add("5. 参考：http://www.jianshu.com/p/d9442041743f");
        mv_list.startWithList(info);
        
        mv_list.setOnClickListener(listener);
	}
	
	private OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO 点击MarqueeView能直接定位到点击时的TextView
			Toast.makeText(MainActivity.this, ((TextView)v).getText(), Toast.LENGTH_SHORT).show();
		}
	};

}
