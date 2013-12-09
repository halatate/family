package com.haden.family;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
	public static final int NUM = 4;

	AppSectionsPagerAdapter mAppSectionsPagerAdapter;
	ViewPager mViewPager;
	RadioGroup group;
	int[] radioButtonId = new int[] { R.id.radio_home, R.id.radio_talk,
			R.id.radio_note, R.id.radio_more };

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mAppSectionsPagerAdapter = new AppSectionsPagerAdapter(
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

	public static class AppSectionsPagerAdapter extends FragmentPagerAdapter {
		Context context;

		public AppSectionsPagerAdapter(FragmentManager fm, Context context) {
			super(fm);

			this.context = context;
		}

		@Override
		public Fragment getItem(int i) {
			switch (i) {
			case 0:
				return new DummySectionFragment();

			default:
				// The other sections of the app are dummy placeholders.
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

	public static class DummySectionFragment extends Fragment {

		public static final String ARG_SECTION_NUMBER = "section_number";

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_section_dummy,
					container, false);

			Bundle args = getArguments();
			int number = 1;
			if (args != null) {
				number = args.getInt(ARG_SECTION_NUMBER);
			}
			((TextView) rootView.findViewById(android.R.id.text1))
					.setText(getString(R.string.dummy_section_text, number));
			return rootView;
		}
	}
}