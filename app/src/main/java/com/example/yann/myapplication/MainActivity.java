package com.example.yann.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final String STATE_CURRENT = "truc";
    static final String VALUE_KEY_EDITTXT = "truc";
    String truc = "";
    Intent intentConfirm;
    EditText editText;
    private String value="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentConfirm = new Intent(this, ConfirmationActivity.class);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d("onCreate", "message Appel onCreate");

        Button btnConfirmation = (Button)findViewById(R.id.appelActivity2);
        editText = (EditText)findViewById(R.id.editText);

        btnConfirmation.setOnClickListener(new ButtonConfirmClickListener(btnConfirmation));


        Toast.makeText(getApplicationContext(), "on Create", Toast.LENGTH_SHORT).show();
    }

    class ButtonConfirmClickListener implements View.OnClickListener{

        public ButtonConfirmClickListener(Button button){

        }
        @Override
        public void onClick(View v) {

            intentConfirm.putExtra(VALUE_KEY_EDITTXT,editText.getText().toString());
            startActivity(intentConfirm);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        Log.d("onPause", "message Appel onPause");
        super.onPause();
        Toast.makeText(getApplicationContext(), "on Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "on Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "on Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "on Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "on Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "on Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(STATE_CURRENT, truc);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        truc = savedInstanceState.getString(STATE_CURRENT);
    }

    public void setValueEditText(String txt){
        value=txt;
    }
    public String getValueEdittext(){
        return value;
    }
}
