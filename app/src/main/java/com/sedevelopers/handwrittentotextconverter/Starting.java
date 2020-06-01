package com.sedevelopers.handwrittentotextconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Starting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        Thread welcome = new Thread(){

            @Override
            public void run(){
                try{
                    super.run();
                    sleep(5000);
                }catch(Exception e){

                }finally{
                    Intent intent = new Intent(Starting.this, Menu.class);
                    startActivity(intent);

                    finish();
                }
            }

        };
        welcome.start();
    }

}
