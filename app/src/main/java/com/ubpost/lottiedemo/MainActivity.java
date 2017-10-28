package com.ubpost.lottiedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

/**
 * lottie-android 动画的使用
 * 1-引入依赖；注意，引入最新版（2.2.5），会造成 Failed to resolve: com.android.support:appcompat-v7:26.0.0
 * 这里使用2.2.0版本
 * 2-UI 设计师使用Adobe 的 After Effects 制作动画，生成 json 文件
 * 3-通过 LottieAnimationView 控件，使用上述 json 文件绘制动画
 */
public class MainActivity extends AppCompatActivity {

    private MainActivity activity;
    private LottieAnimationView animationView;//Java 代码实现动画
    private LottieAnimationView animationView2;//XML 布局中实现动画

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        setJavaAnimation();
        setXmlAnimation();
    }

    /**
     * XML 布局中实现动画
     */
    private void setXmlAnimation() {
        animationView2 = (LottieAnimationView) findViewById(R.id.lav_main_show2);
    }

    /**
     * Java 代码实现动画
     */
    private void setJavaAnimation() {
        animationView = (LottieAnimationView) findViewById(R.id.lav_main_show);
        animationView.setAnimation("LottieLogo1.json");//在assets目录下的动画json文件名
        animationView.loop(true);//设置动画循环播放
//        animationView.setImageAssetsFolder("images/");//assets目录下的子目录，存放动画所需的图片
        animationView.playAnimation();//播放动画
    }
}
