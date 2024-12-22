package org.yrjg;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.textView);
        // textView1.setText("你怎么这么自私，呸！");
        textView1.setText("a");
        TextView textView2 = findViewById(R.id.textView2);
        //textView2.setText("异常！你的电脑被破坏了，重启后将无法进入系统，如果你需要修复，请在下一个页面扫码");
        textView2.setText("b");
    }
}