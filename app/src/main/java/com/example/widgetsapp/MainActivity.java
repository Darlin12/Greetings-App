package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Step 2 Declaring views
    TextView textView;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        button = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);

        //Step 3 Adding functionality
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();

                //Displaying the name
                Toast.makeText(MainActivity.this, "Hello " +  name, Toast.LENGTH_LONG).show();
            }
        });




    }
}