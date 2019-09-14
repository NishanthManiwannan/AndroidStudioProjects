package com.example.nishanth.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static Button button;
    private EditText name;
    private EditText Password;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        OnClick();

        name = (EditText)findViewById(R.id.Text1);
        Password = (EditText)findViewById(R.id.Password1);

        btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),Password.getText().toString());
            }
        });
    }

    //Form Validation
    private void validate(String Name,String Pass){
        if((Name.equals("Nishanth")) && (Pass.equals("1234"))){
            Intent intent = new Intent(this,Gallery.class);
            startActivity(intent);
            Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Incorrect Login",Toast.LENGTH_SHORT).show();
        }
    }

    //Exit
    public void OnClick(){
        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                builder.setMessage("Do You Want To Exit !")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Conformation");
                alertDialog.show();

            }
        });
    }
}
