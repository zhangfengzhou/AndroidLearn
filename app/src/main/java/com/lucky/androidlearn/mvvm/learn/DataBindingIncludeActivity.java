package com.lucky.androidlearn.mvvm.learn;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import com.lucky.androidlearn.R;
import com.lucky.androidlearn.databinding.ActivityDatabingInclueBinding;

/**
 *
 *
 * Created by zfz on 2018/2/5.
 */

public class DataBindingIncludeActivity extends AppCompatActivity {
    ActivityDatabingInclueBinding activityDatabingInclueBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        activityDatabingInclueBinding = ActivityDatabingInclueBinding.inflate(getLayoutInflater());
//        activityDatabingInclueBinding = DataBindingUtil.setContentView(this, R.layout.activity_databing_inclue);
        Content content = new Content("我是呵呵呵呵","SubTitle");
        activityDatabingInclueBinding.setContent(content);
        //这个测试没有效果，不会显示toolbar的title/subTitle
        activityDatabingInclueBinding.toolbar.setContent(content);
        activityDatabingInclueBinding.toolbar.toolbar.setTitle("Title");
        activityDatabingInclueBinding.toolbar.toolbar.setSubtitle("SubTitle");
        //下面的代码也可以通过DataBinding绑定数据
        activityDatabingInclueBinding.toolbar.toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        setSupportActionBar(activityDatabingInclueBinding.toolbar.toolbar);
        activityDatabingInclueBinding.toolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        activityDatabingInclueBinding.btnUpdateBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.setTitle("我是呵呵呵呵");
            }
        });
        activityDatabingInclueBinding.getContent();

    }
}
