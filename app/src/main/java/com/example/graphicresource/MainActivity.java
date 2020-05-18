package com.example.graphicresource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mLinearLayout; //선형레이아웃을 선언한다.


    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreat 메소드의 매개변수는 앱의 이전 상태를 전달한다.
        super.onCreate(savedInstanceState); //상위클래스의 onCreate를 호출한다.
        //리니어 레이아웃을 생성한다.
        mLinearLayout = new LinearLayout(this);
        //ImageView 객체를 생성한다.
        ImageView i = new ImageView(this);
        i.setImageDrawable(getResources().getDrawable(R.drawable.oval));
        //ImageView에 드로워블 객체를 설정한다.
        i.setMinimumHeight(500); //최소사이즈를 정의한다.
        i.setMinimumWidth(500);
        //ImageView를 레이아웃에 추가한다.
        mLinearLayout.addView(i);
        setContentView(mLinearLayout); //선형레이아웃을 띄운다.
    }
}
