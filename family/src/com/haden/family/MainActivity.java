package com.haden.family;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity {
	public static final int NUM = 4;

	MainPagerAdapter mAppSectionsPagerAdapter;
	ViewPager mViewPager;
	RadioGroup group;
	int[] radioButtonId = new int[] { R.id.radio_home, R.id.radio_talk,
			R.id.radio_note, R.id.radio_more };

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mAppSectionsPagerAdapter = new MainPagerAdapter(
				getSupportFragmentManager(), MainActivity.this);
		mViewPager = (ViewPager) findViewById(R.id.viewPager);
		mViewPager.setAdapter(mAppSectionsPagerAdapter);
		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						group.check(radioButtonId[position]);
					}
				});
		group = (RadioGroup) findViewById(R.id.bottom_group);
		group.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				for (int i = 0; i < NUM; i++) {
					if (radioButtonId[i] == checkedId) {
						mViewPager.setCurrentItem(i);
						break;
					}
				}
			}
		});
	}

}