package com.romanmitch.test;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    static String button1;
    static String button2;
    static String button3;
    static String button4;
    static String button5;
    static String button6;
    static String button7;
    static String button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = (Button)findViewById(R.id.button1);
        final Button btn2 = (Button)findViewById(R.id.button2);
        final Button btn3 = (Button)findViewById(R.id.button3);
        final Button btn4 = (Button)findViewById(R.id.button4);
        final Button btn5 = (Button)findViewById(R.id.button5);
        final Button btn6 = (Button)findViewById(R.id.button6);
        final Button btn7 = (Button)findViewById(R.id.button7);
        final Button btn8 = (Button)findViewById(R.id.button8);

        //Code to respond to button clicks

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click 1!",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click 2!",Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click 3!",Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click 4!",Toast.LENGTH_SHORT).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click 5!",Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click 6!",Toast.LENGTH_SHORT).show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click 7!",Toast.LENGTH_SHORT).show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getApplicationContext(), "Click 8!",Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Intents for items in options menu
        Intent settings = new Intent(getApplicationContext(), Settings.class);

        switch (item.getItemId()) {
            case R.id.action_settings:
                //Toast.makeText(getApplicationContext(), "Settings",Toast.LENGTH_SHORT).show();
                startActivityForResult(settings, 0);
                return true;
            case R.id.stored_events:
                Toast.makeText(getApplicationContext(), "Stored Events",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.preset_locations:
                Toast.makeText(getApplicationContext(), "Preset Locations",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (requestCode == 0 && resultCode == RESULT_OK && data != null) {
            button1 = data.getStringExtra(button1);

            final Button btn1 = (Button)findViewById(R.id.button1);
           // final Button btn2 = (Button)findViewById(R.id.button2);
            if (button1.trim().length() != 0) {
                btn1.setVisibility(View.VISIBLE);
                btn1.setText(button1);
            }
           /* if (button2.trim().length() != 0) {
                btn2.setVisibility(View.VISIBLE);
                btn2.setText(button2);
            }*/
        }


    }
}
