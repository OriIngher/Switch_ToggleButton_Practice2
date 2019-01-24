package com.example.oriin_bsqgiqy.switch_togglebutton_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    ToggleButton tb1;
    Button btn1;
    Switch sw1;
    LinearLayout la1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1 = (ToggleButton) findViewById(R.id.tb1);
        btn1 = (Button) findViewById(R.id.btn1);
        sw1 = (Switch) findViewById(R.id.sw1);
        la1 = (LinearLayout) findViewById(R.id.la1);

    }

    public void gooo(View view) {
    }

    public void goo(View view) {
    }

    public void go(View view) {
        if (tb1.isChecked())
        {
            if (sw1.isChecked())
            {
                la1.setBackgroundColor(Color.RED);
            }
            else
            {
                la1.setBackgroundColor(Color.BLUE);
            }
        }
        else
        {
            if (sw1.isChecked())
            {
                la1.setBackgroundColor(Color.YELLOW);
            }
            else
            {
                la1.setBackgroundColor(Color.GREEN);
            }
        }
    }

}

