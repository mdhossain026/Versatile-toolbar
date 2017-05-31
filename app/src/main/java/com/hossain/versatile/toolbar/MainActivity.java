package com.hossain.versatile.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);

        final Button btnNoActionBar = (Button) findViewById(R.id.btnNoActionBar);
        btnNoActionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NoActionbarActivity.class));

            }
        });

        final Button btnToolbar = (Button) findViewById(R.id.btnToolbar);
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ToolbarActivity.class));

            }
        });

        final Button btnCollapsingToolbar = (Button) findViewById(R.id.btnCollapsingToolbar);
        btnCollapsingToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CollapsingToolbarActivity.class));

            }
        });

        final Button btnFloatingToolbar = (Button) findViewById(R.id.btnFloatingToolbar);
        btnFloatingToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FloatingToolbarActivity.class));

            }
        });

        final Button btnCustomTitleToolbar = (Button) findViewById(R.id.btnToolbarCustom);
        btnCustomTitleToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CustomTitleToolbarActivity.class));

            }
        });


    }

    private void setupToolbar(Toolbar tb) {
        setSupportActionBar(tb);

        final ActionBar ab = getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowCustomEnabled(true);
        ab.setDisplayShowTitleEnabled(false);

    }

}


