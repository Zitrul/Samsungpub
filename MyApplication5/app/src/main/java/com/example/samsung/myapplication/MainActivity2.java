package com.example.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Base base = new Base();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
    public void onClick(View view){
        EditText edit = (EditText)findViewById(R.id.name);
        TextView tview = (TextView)findViewById(R.id.text);
        String result = edit.getText().toString();
        int number = Base.findnumber(result);
        int cost = Base.findcost(result);
        String data = Base.finddata(result);
        String ans = number+"\n"+cost+"\n"+data;
        tview.setText(ans);
    }
}