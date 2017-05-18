package com.hossain.versatile.toolbar;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class CollapsingToolbarActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "cheese_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsing_layout);
//        Toolbar tb = (Toolbar) findViewById(R.id.toolbar_actionbar);
////        TextView mTitle = (TextView) tb.findViewById(R.id.toolbar_title);
////        mTitle.setText("Hello");
//       // setupToolbar(tb);
        setTitle("sse");

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(EXTRA_NAME);

    }

    private void setupToolbar(Toolbar tb) {
        setSupportActionBar(tb);

        final ActionBar  ab = getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowCustomEnabled(true);
        ab.setDisplayShowTitleEnabled(false);

    }




}


