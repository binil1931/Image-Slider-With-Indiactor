package com.image.slider.utils;

import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import com.viewpagerindicator.IconPagerAdapter;

public class TestFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
//	public static int[] CONTENT = new int[] { R.drawable.brazil,R.drawable.india,R.drawable.indonesia };
	public static String CONTENT [];

	private int mCount = CONTENT.length;

	public TestFragmentAdapter( android.support.v4.app.FragmentManager fm) {
		super(fm);
	}

	@Override
	public  android.support.v4.app.Fragment getItem(int position) {
		
		Log.e("FragmentAdapte ", "FragmentAdapte "+ CONTENT[position]);
		return TestFragment.newInstance(CONTENT[position]);
	}

	@Override
	public int getCount() {
		return mCount;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return null;
	}

	public void setCount(int count) {
		if (count > 0 && count <= 10) {
			mCount = count;
			notifyDataSetChanged();
		}
	}

	@Override
	public int getIconResId(int index) {
		// TODO Auto-generated method stub
		return 0;
	}
}