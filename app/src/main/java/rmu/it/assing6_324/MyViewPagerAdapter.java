package rmu.it.assing6_324;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ASUS on 2/8/2560.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OneFragment();
        } else if (position == 1) {
            return new TwoFragment();
        } else {
            return new ThreeFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
