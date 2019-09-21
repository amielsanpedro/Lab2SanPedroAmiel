package com.sanpedro.lab2sanpedroamiel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText checkCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        checkCourse = findViewById(R.id.editText9);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData" , MODE_PRIVATE);
        String c1 = sp.getString("college1" , null);
        String c2 = sp.getString("college2" , null);
        String c3 = sp.getString("college3" , null);
        String c4 = sp.getString("college4" , null);
        String c5 = sp.getString("college5" , null);
        String c6 = sp.getString("college6" , null);
        String c7 = sp.getString("college7" , null);
        String c8 = sp.getString("college8" , null);
        String course = checkCourse.getText().toString();

        if(course.equals(c1) || course.equals(c2) || course.equals(c3) || course.equals(c4) || course.equals(c5) ||
                course.equals(c6) || course.equals(c7) || course.equals(c8)){
            Toast.makeText(this, "Course is offered in UST" , Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this , "Course is not offered in UST" , Toast.LENGTH_LONG).show();
        }
    }

    public void backPage(View v){
        Intent a = new Intent(this , MainActivity.class);
        startActivity(a);
    }


}
