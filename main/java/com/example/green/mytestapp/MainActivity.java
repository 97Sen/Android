package com.example.green.mytestapp;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.ArrayList;
import java.util.List;




public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout messagelayout;
    private LinearLayout contaslayout;
    private LinearLayout collegelayout;
    private LinearLayout settinglayout;
    private TextView contants,chat,clud,setting,notice;
    private TextView title;
    private ViewPager viewPager;
    private List<Fragment> mFragmentList = new ArrayList<Fragment>();
    private MyFragmentPagerAdapter mfragmentAdapter;
    private MessageFragment messageFragment;
    private CludFragment cludFragment;
    private NoticeFragment noticeFragment;
    private SettingFragment settingFragment;
    private ConstantsFragment constantsFragment;
    String[] titles = new String[]{"信息", "通讯录", "公告", "社团","我"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        initViews();

        viewPager.setOffscreenPageLimit(5);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), mFragmentList));
        viewPager.setCurrentItem(3);
        notice.setTextColor(Color.parseColor("#66CDAA"));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                title.setText(titles[position]);
                changeTextColor(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initViews() {


        contants = (TextView)findViewById(R.id.contas);
        chat = (TextView)findViewById(R.id.message);
        clud = (TextView)findViewById(R.id.college);
        setting = (TextView)findViewById(R.id.setting);
        notice = (TextView)findViewById(R.id.notice);
        title = (TextView)findViewById(R.id.title);

        messagelayout = (LinearLayout)findViewById(R.id.messageLayout);
        contaslayout = (LinearLayout)findViewById(R.id.contasLayout);
        collegelayout = (LinearLayout)findViewById(R.id.collegeLayout);
        settinglayout = (LinearLayout)findViewById(R.id.settingLayout);

        messagelayout.setOnClickListener(this);
        contaslayout.setOnClickListener(this);
        collegelayout.setOnClickListener(this);
        settinglayout.setOnClickListener(this);
        notice.setOnClickListener(this);

        viewPager = (ViewPager)findViewById(R.id.viwPager);

        messageFragment = new MessageFragment();
        cludFragment = new CludFragment();
        constantsFragment = new ConstantsFragment();
        noticeFragment = new NoticeFragment();
        settingFragment = new SettingFragment();

        mFragmentList.add(messageFragment);
        mFragmentList.add(cludFragment);
        mFragmentList.add(constantsFragment);
        mFragmentList.add(noticeFragment);
        mFragmentList.add(settingFragment);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.messageLayout:
                viewPager.setCurrentItem(0,true);
                break;
            case R.id.contasLayout:
                viewPager.setCurrentItem(1,true);
                break;
            case R.id.notice:
                viewPager.setCurrentItem(2,true);
                break;
            case R.id.collegeLayout:
                viewPager.setCurrentItem(3,true);
                break;
            case R.id.settingLayout:
                viewPager.setCurrentItem(4,true);
                break;

        }
    }

    private void changeTextColor(int position){
        if (position == 0){
            chat.setTextColor(Color.parseColor("#66CDAA"));
            contants.setTextColor(Color.parseColor("#000000"));
            clud.setTextColor(Color.parseColor("#000000"));
            notice.setTextColor(Color.parseColor("#000000"));
            setting.setTextColor(Color.parseColor("#000000"));
        }else if (position==1){
            contants.setTextColor(Color.parseColor("#66CDAA"));
            chat.setTextColor(Color.parseColor("#000000"));
            clud.setTextColor(Color.parseColor("#000000"));
            notice.setTextColor(Color.parseColor("#000000"));
            setting.setTextColor(Color.parseColor("#000000"));
        }else if (position==2){
            notice.setTextColor(Color.parseColor("#66CDAA"));
            contants.setTextColor(Color.parseColor("#000000"));
            clud.setTextColor(Color.parseColor("#000000"));
            chat.setTextColor(Color.parseColor("#000000"));
            setting.setTextColor(Color.parseColor("#000000"));
        }else if (position==3){
            clud.setTextColor(Color.parseColor("#66CDAA"));
            contants.setTextColor(Color.parseColor("#000000"));
            chat.setTextColor(Color.parseColor("#000000"));
            notice.setTextColor(Color.parseColor("#000000"));
            setting.setTextColor(Color.parseColor("#000000"));
        }else if (position==4){
            setting.setTextColor(Color.parseColor("#66CDAA"));
            contants.setTextColor(Color.parseColor("#000000"));
            clud.setTextColor(Color.parseColor("#000000"));
            notice.setTextColor(Color.parseColor("#000000"));
            chat.setTextColor(Color.parseColor("#000000"));
        }
    }
}
