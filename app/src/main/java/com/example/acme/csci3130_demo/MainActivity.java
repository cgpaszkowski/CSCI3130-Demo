package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView viewTextBox;
    EditText inputTextBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextBox = (EditText) findViewById(R.id.editText2);
        viewTextBox = (TextView) findViewById(R.id.textView2);
        Button submitButton = (Button) findViewById(R.id.Submit_Button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String randomText = inputTextBox.getText().toString();
                viewTextBox.append(randomText);
            }
        });
    }
}
