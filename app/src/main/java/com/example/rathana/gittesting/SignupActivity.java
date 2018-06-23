package com.example.rathana.gittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        switch (1) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }

        for(int i=0;i<20;i++){
            Log.e("Sihnup"," "+i);
        }
    }
}
