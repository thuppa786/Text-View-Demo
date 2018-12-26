package com.example.mrinalmriyo.edittextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText=(EditText)findViewById(R.id.editText);

    }

    public void listenMe(View view){

        int message=Integer.valueOf(myEditText.getText().toString());

        Toast.makeText(this, String.valueOf(message) , Toast.LENGTH_LONG).show();

    }

}
