package com.example.edittextbuttom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        et_id = findViewByld(R.id.et_id);
        btn_test = findViewByld(R.id.btn_test);
        btn_test.setOnC
    }
}