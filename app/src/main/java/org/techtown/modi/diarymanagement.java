package org.techtown.modi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class diarymanagement extends FragmentPagerAdapter{

    private int PAGE_NUMBER = 3;

    public diarymanagement(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                ListdiaryActivity listdiary = new ListdiaryActivity();
                return listdiary;
            case 1:
                writediaryActivity writediary = new writediaryActivity();
                return writediary;
            case 2:
                AboutActivity about = new AboutActivity();
                return about;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }
}

