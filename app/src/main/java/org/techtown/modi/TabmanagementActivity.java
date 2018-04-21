package org.techtown.modi;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;

public class TabmanagementActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager viewPager;
    private diarymanagement management;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabmanagement);

        tabs = findViewById(R.id.tab);
        tabs.addTab(tabs.newTab().setIcon(R.drawable.list));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.pencil));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.question));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);


        management = new diarymanagement(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.viewpage);
        viewPager.setAdapter(management);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void setSupportActionBar(Toolbar myToolbar) {
    }
}
