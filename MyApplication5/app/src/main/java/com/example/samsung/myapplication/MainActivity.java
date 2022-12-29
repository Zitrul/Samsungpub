package com.example.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Base base = new Base();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addproduct(View view) {
        EditText edit = (EditText)findViewById(R.id.number);
        EditText edit1 = (EditText)findViewById(R.id.name);
        EditText edit2 = (EditText)findViewById(R.id.data);
        EditText edit3 = (EditText)findViewById(R.id.cost);
        String number = edit.getText().toString();
        String name = edit1.getText().toString();
        String data = edit2.getText().toString();
        String cost = edit3.getText().toString();
        edit.setText(null);
        edit1.setText(null);
        edit2.setText(null);
        edit3.setText(null);
        Integer number_int = Integer.valueOf(number);
        Integer cost_int = Integer.valueOf(cost);
        Base.add1(number_int,cost_int,name,data);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Добавил!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}