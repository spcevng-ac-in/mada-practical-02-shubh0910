package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showmsg(View view){
        TextView t=findViewById(R.id.txt1);
        cnt++;
      t.setText("cnt :- "+cnt);
    }
    public void resetButton(View view){
        TextView t=findViewById(R.id.txt1);
        cnt=0;
        t.setText("I am back!");
    }
}