package com.example.yann.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Yann on 05/10/2015.
 */
public class ConfirmationActivity extends AppCompatActivity {

    static final String VALUE_KEY_EDITTXT = "truc";
    String valueTXT = "";
    TextView txtView;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.ctivity_confirmation);

        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            valueTXT = extras.getString(VALUE_KEY_EDITTXT);
        }

        txtView = (TextView)findViewById(R.id.textView);
        if(!valueTXT.isEmpty())
            txtView.setText("TXT : " + valueTXT);
        Log.i("Activity Confirmation","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity Confirmation", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity Confirmation", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity Confirmation", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity Confirmation", "onStop");
    }
}
