package com.sanpedro.lab2sanpedroamiel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etCol1 , etCol2 , etCol3 , etCol4 , etCol5 , etCol6 , etCol7 , etCol8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCol1 = findViewById(R.id.editText);
        etCol2 = findViewById(R.id.editText2);
        etCol3 = findViewById(R.id.editText3);
        etCol4 = findViewById(R.id.editText4);
        etCol5 = findViewById(R.id.editText5);
        etCol6 = findViewById(R.id.editText6);
        etCol7 = findViewById(R.id.editText7);
        etCol8 = findViewById(R.id.editText8);
    }

    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("myData" , MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String col1 = etCol1.getText().toString();
        String col2 = etCol2.getText().toString();
        String col3 = etCol3.getText().toString();
        String col4 = etCol4.getText().toString();
        String col5 = etCol5.getText().toString();
        String col6 = etCol6.getText().toString();
        String col7 = etCol7.getText().toString();
        String col8 = etCol8.getText().toString();
        editor.putString("college1" , col1);
        editor.putString("college2" , col2);
        editor.putString("college3" , col3);
        editor.putString("college4" , col4);
        editor.putString("college5" , col5);
        editor.putString("college6" , col6);
        editor.putString("college7" , col7);
        editor.putString("college8" , col8);
        editor.commit();
        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
    }

    public void nextPage (View v){
        Intent i = new Intent(this , Main2Activity.class);
        startActivity(i);
    }


}
