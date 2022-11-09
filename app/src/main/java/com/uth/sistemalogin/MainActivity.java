package com.uth.sistemalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    protected EditText input1,input2;
    protected Button btn;
    protected final static String correo = "3521111334@uth.edu.mx";
    protected final static String pass="123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();

        input1 = (EditText) findViewById(R.id.EmailAddress);
        input2 = (EditText) findViewById(R.id.TextPassword);
        btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar(input1.getText().toString(),input2.getText().toString());
            }
        });
    }
    protected void validar(String correoCmp,String passCmp){
        if(correoCmp.equals(correo) && passCmp.equals(pass)){
            Intent newView = new Intent(MainActivity.this,Success.class);
            startActivity(newView);
        }else {
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}