package com.azo.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultText;
    EditText editText3;
    EditText editText4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        resultText = findViewById(R.id.textView3);

        
    }

    public void toplama (View view){

        if (editText3.getText().toString().matches("")|| editText4.getText().toString().matches("")){

            resultText.setText("Numara yok!!");

        }else {

            int a = Integer.parseInt(editText3.getText().toString());
            int b = Integer.parseInt(editText4.getText().toString());

            int resultInteger = a + b;

            resultText.setText("Result: " + resultInteger);
        }
    }
    public void cıkarma (View view){

        if (editText3.getText().toString().matches("")|| editText4.getText().toString().matches("")){
            resultText.setText("Numara yok!!");
        }else{


        int a = Integer.parseInt(editText3.getText().toString());
        int b = Integer.parseInt(editText4.getText().toString());

        int resultInteger = a - b;

        resultText.setText("Result: " + resultInteger);
        }
    }
    public void carpma (View view){

        if (editText3.getText().toString().matches("")|| editText4.getText().toString().matches("")){
            resultText.setText("Numara Yok!!");
        }else{


        int a = Integer.parseInt(editText3.getText().toString());
        int b = Integer.parseInt(editText4.getText().toString());

        int resultInteger = a * b;

        resultText.setText("Result:" + resultInteger );
        }
    }
    public void bolme (View view){
        if(editText3.getText().toString().matches("")|| editText4.getText().toString().matches("")){
            resultText.setText("Numara Yok!!");
        }else{



        int a = Integer.parseInt(editText3.getText().toString());
        int b = Integer.parseInt(editText4.getText().toString());

        int resultInteger = a / b;

        resultText.setText("Result:" +resultInteger);
        }
    }
}
