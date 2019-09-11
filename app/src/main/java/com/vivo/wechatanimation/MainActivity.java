package com.vivo.wechatanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;

import com.vivo.wechatanimation.fragment.TabFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPagerMain;
    private Button mBtnWechat;
    private Button mBtnFriend;
    private Button mBtnFind;
    private Button mBtnMine;
    private List<String> mTitleList= Arrays.asList("微信","通信录","发现","我的");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mViewPagerMain.setOffscreenPageLimit(mTitleList.size());
        mViewPagerMain.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return TabFragment.newInstance(mTitleList.get(position));
            }

            @Override
            public int getCount() {
                return mTitleList.size();
            }
        });
    }

    private void initView(){
        mViewPagerMain=findViewById(R.id.vp_main);
        mBtnWechat=findViewById(R.id.btn_wechat);
        mBtnFriend=findViewById(R.id.btn_friend);
        mBtnFind=findViewById(R.id.btn_find);
        mBtnMine=findViewById(R.id.btn_mine);
    }
}
