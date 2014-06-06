package com.romanmitch.test;

import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;




public class Settings extends ActionBarActivity {

    EditText text1, text2, text3, text4, text5, text6, text7, text8, username;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        text1 = (EditText) findViewById(R.id.btntxt1);
        text2 = (EditText) findViewById(R.id.btntxt2);
        text3 = (EditText) findViewById(R.id.btntxt3);
        text4 = (EditText) findViewById(R.id.btntxt4);
        text5 = (EditText) findViewById(R.id.btntxt5);
        text6 = (EditText) findViewById(R.id.btntxt6);
        text7 = (EditText) findViewById(R.id.btntxt7);
        text8 = (EditText) findViewById(R.id.btntxt8);
        username = (EditText) findViewById(R.id.username);
        final Button submit = (Button)findViewById(R.id.sbmt_settings);

        class Buttons {
            public boolean buttons()
            {
                boolean username_status = false;
                boolean button_fields_status = false;
                username.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        submit.setEnabled(!username.getText().toString().trim().isEmpty());
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });

                text1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3){
                    }
                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        submit.setEnabled(!text1.getText().toString().trim().isEmpty());
                    }
                    @Override
                    public void afterTextChanged(Editable editable) {
                    }
                });
                text2.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3){
                    }
                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        submit.setEnabled(!text2.getText().toString().trim().isEmpty());
                    }
                    @Override
                    public void afterTextChanged(Editable editable) {
                    }
                });
                return true;
            }

        }
       Buttons btn = new Buttons();
       btn.buttons();

    submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent output = new Intent();
            output.putExtra(MainActivity.button1, text1.getText().toString());
            //output.putExtra(MainActivity.button2, text2.getText().toString());
            setResult(RESULT_OK, output);
            finish();
        }
    });
}
}

