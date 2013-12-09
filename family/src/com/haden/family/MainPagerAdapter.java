package com.haden.family;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.haden.family.fragment.DummySectionFragment;
import com.haden.family.fragment.home.HomeFragment;

class MainPagerAdapter extends FragmentPagerAdapter {
	Context context;

	public MainPagerAdapter(FragmentManager fm, Context context) {
		super(fm);

		this.context = context;
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
		case 0:
			return new HomeFragment();

		default:
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
			fragment.setArguments(args);
			return fragment;
		}
	}

	@Override
	public int getCount() {
		return MainActivity.NUM;
	}

}