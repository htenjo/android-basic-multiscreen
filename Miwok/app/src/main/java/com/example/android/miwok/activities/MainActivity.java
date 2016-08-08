/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.miwok.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        TextView numberView = (TextView) findViewById(R.id.numbers);
        TextView familyView = (TextView) findViewById(R.id.family);
        TextView colorView = (TextView) findViewById(R.id.colors);
        TextView phraseView = (TextView) findViewById(R.id.phrases);

        numberView.setOnClickListener(this);
        familyView.setOnClickListener(this);
        colorView.setOnClickListener(this);
        phraseView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()){
            case R.id.numbers:
                intent = new Intent(this, NumberActivity.class);
                break;
            case R.id.family:
                intent = new Intent(this, FamilyActivity.class);
                break;
            case R.id.colors:
                intent = new Intent(this, ColorActivity.class);
                break;
            case R.id.phrases:
                intent = new Intent(this, PhraseActivity.class);
                break;
        }

        if(intent != null) {
            startActivity(intent);
        }
    }
}
