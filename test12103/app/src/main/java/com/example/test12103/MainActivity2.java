package com.example.test12103;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView5;
    EditText editText2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3=findViewById(R.id.button3);
        editText2=findViewById(R.id.editText2);
        textView5=findViewById(R.id.textView5);
        final Intent intent=getIntent();
        String editText1=intent.getStringExtra("key1");
        textView5.setText(editText1);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("key2",editText2.getText().toString());
                setResult(120,intent);
               finish();
            }
        });
    }
}