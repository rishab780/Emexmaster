package com.example.rishab.emex;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
//import android.view.Gravity;
//import android.view.View;

//import android.widget.TextView;

//import com.example.rishab.emex.fragments.JobHistory;
import com.example.rishab.emex.fragments.JobHistory;
import com.example.rishab.emex.fragments.MapFragment;

/**
 * homeactivity
 */
public class HomeActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private MapFragment map;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        map = new MapFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.content_frame, map);
        ft.commit();

        TextView tvJHistory = (TextView) findViewById(R.id.tv_JobHistory);
        tvJHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawerLayout.closeDrawer(Gravity.START);
                JobHistory jbHistory = new JobHistory();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.idmap, jbHistory);
                ft.commit();

            }
        }
        );
    }
}
