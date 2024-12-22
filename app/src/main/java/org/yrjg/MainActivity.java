package org.yrjg;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private Button button1;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView);
        textView1.setText("a");
        textView2 = findViewById(R.id.textView2);
        textView2.setText("b");

        button1 = findViewById(R.id.button);
        switch1 = findViewById(R.id.switch1);
        button1.setOnClickListener(view -> Toast.makeText(
                MainActivity.this,
                switch1.isChecked() ? "你好" : "好你",
                Toast.LENGTH_SHORT).show()
        );
    }
}