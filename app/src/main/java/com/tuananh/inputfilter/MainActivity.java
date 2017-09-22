package com.tuananh.inputfilter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditTextCustom editNormal = (EditTextCustom) findViewById(R.id.edit_normal);
        editNormal.setFilters(new InputFilter[]{CommonUtils.getInputFilter()});
    }
}
