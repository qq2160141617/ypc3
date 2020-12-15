package com.example.test12103;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    TextView textView3;
    Button button1,button2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText1);
        imageView=findViewById(R.id.imageView);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        textView3=findViewById(R.id.textView3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("key1",editText1.getText().toString());
                startActivityForResult(intent,110);
            }
        });
        
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button2:
                        imageView.setImageResource(R.drawable.pig2);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==110&&resultCode==120){
            String key2=data.getStringExtra("key2");
            textView3.setText(key2);
        }
    }
}