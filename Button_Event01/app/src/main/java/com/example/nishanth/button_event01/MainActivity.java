package com.example.nishanth.button_event01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons 4 Toast
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        //Change Text
        Button button = (Button)findViewById(R.id.ChangeText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView)findViewById(R.id.textView2);
                textView.setText("Mission Done");
            }

            //Press and Hold
            /*button.setOnLongClickListener(new View.OnLongClickListener(){
                @Override
                public boolean onLongClick (View v){
                TextView textView = (TextView) findViewById(R.id.textView2);
                textView.setText("Mission Done");
                return false;
            }
            }*/
        });

    }

    //Button Event (Toast and new Activity)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                openKabali();
                Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Toast.makeText(this,"Im Back",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:
                Toast.makeText(this,"Its Just A Beginning",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    //New Activity
    private void openKabali() {
        Intent intent = new Intent(this,nerupuda.class);
        startActivity(intent);
    }

}
