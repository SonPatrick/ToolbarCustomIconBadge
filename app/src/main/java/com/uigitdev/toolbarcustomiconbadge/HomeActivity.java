package com.uigitdev.toolbarcustomiconbadge;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.uigitdev.toolbarcustomiconbadge.uigitdev.design.ToolbarIconBadge;

public class HomeActivity extends AppCompatActivity {
    private ToolbarIconBadge toolbarIconBadge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setToolbar();
        setToolbarIconBadgeClick();
        setToolbarIconBadgeStyle();
    }

    @SuppressLint("ResourceType")
    public void setToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Toolbar Badge");
        toolbar.setTitleTextColor(Color.parseColor(getString(R.color.colorWhite)));
        toolbarIconBadge = new ToolbarIconBadge(findViewById(R.id.toolbar_badge));
    }

    private void setToolbarIconBadgeClick() {
        toolbarIconBadge.toolbar_body_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Badge Icon Click", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setToolbarIconBadgeStyle() {
        toolbarIconBadge.setIconColor("#FFFFFF");
        toolbarIconBadge.setBadgeColor("#ff4c4c");
        toolbarIconBadge.setIcon(R.drawable.ic_notification);
        toolbarIconBadge.setCount(38);
        toolbarIconBadge.setCountColor("#FFFFFF");
//        Toast.makeText(HomeActivity.this, "Count: " + toolbarIconBadge.getCount(), Toast.LENGTH_LONG).show();
//        toolbarIconBadge.hideCount();
//        toolbarIconBadge.hideBagde();

    }
}
