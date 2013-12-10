package com.haden.family.fragment.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.haden.family.R;
import com.haden.family.data.DataManager;
import com.haden.family.data.Family;
import com.haden.family.data.Person;
import com.haden.family.data.Role;
import com.haden.family.fragment.BaseFragment;

public class HomeFragment extends BaseFragment {
	List<Family> list;

	View rootView;
	AdapterViewFlipper flipper;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_home, container, false);

		list = new ArrayList<Family>();
		list.add(DataManager.family);

		flipper = (AdapterViewFlipper) rootView.findViewById(R.id.flipper);
		flipper.setAdapter(new MyAdapter());

		return rootView;
	}

	class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return list.size();
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			if (convertView == null) {
				LayoutInflater inflater = LayoutInflater.from(HomeFragment.this
						.getActivity());
				convertView = inflater.inflate(R.layout.item_home, parent,
						false);
				holder = new ViewHolder();
				holder.layout0 = (LinearLayout) convertView
						.findViewById(R.id.layout0);
				holder.layout1 = (LinearLayout) convertView
						.findViewById(R.id.layout1);
				holder.layout2 = (LinearLayout) convertView
						.findViewById(R.id.layout2);
				holder.layout3 = (LinearLayout) convertView
						.findViewById(R.id.layout3);
				holder.layout4 = (LinearLayout) convertView
						.findViewById(R.id.layout4);

				holder.btn0 = (ImageButton) convertView
						.findViewById(R.id.btn_0);
				holder.btn1 = (ImageButton) convertView
						.findViewById(R.id.btn_1);
				holder.btn2 = (ImageButton) convertView
						.findViewById(R.id.btn_2);
				holder.btn3 = (ImageButton) convertView
						.findViewById(R.id.btn_3);
				holder.btn4 = (ImageButton) convertView
						.findViewById(R.id.btn_4);

				holder.btn0f = (ImageButton) convertView
						.findViewById(R.id.btn_0f);
				holder.btn1f = (ImageButton) convertView
						.findViewById(R.id.btn_1f);
				holder.btn2f = (ImageButton) convertView
						.findViewById(R.id.btn_2f);
				holder.btn3f = (ImageButton) convertView
						.findViewById(R.id.btn_3f);
				holder.btn4f = (ImageButton) convertView
						.findViewById(R.id.btn_4f);

				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			setItemView(holder, position);

			return convertView;
		}

		private void setItemView(ViewHolder holder, int position) {
			Family family = list.get(position);
			Map<Role, Map<String, Person>> familyList = family.getFamilyList();

			if (familyList.get(Role.Grandson) == null) {
				holder.btn0.setVisibility(View.GONE);
			} else {
				holder.btn0.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Son) == null) {
				holder.btn1.setVisibility(View.GONE);
			} else {
				holder.btn1.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Husband) == null) {
				holder.btn2.setVisibility(View.GONE);
			} else {
				holder.btn2.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Father) == null) {
				holder.btn3.setVisibility(View.GONE);
			} else {
				holder.btn3.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Grandfather) == null) {
				holder.btn4.setVisibility(View.GONE);
			} else {
				holder.btn4.setVisibility(View.VISIBLE);
			}

			if (familyList.get(Role.Granddaught) == null) {
				holder.btn0f.setVisibility(View.GONE);
			} else {
				holder.btn0f.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Daught) == null) {
				holder.btn1f.setVisibility(View.GONE);
			} else {
				holder.btn1f.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Wife) == null) {
				holder.btn2f.setVisibility(View.GONE);
			} else {
				holder.btn2f.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Mother) == null) {
				holder.btn3f.setVisibility(View.GONE);
			} else {
				holder.btn3f.setVisibility(View.VISIBLE);
			}
			if (familyList.get(Role.Grandmother) == null) {
				holder.btn4f.setVisibility(View.GONE);
			} else {
				holder.btn4f.setVisibility(View.VISIBLE);
			}

			if (holder.btn0.getVisibility() == View.GONE
					&& holder.btn0f.getVisibility() == View.GONE) {
				holder.layout0.setVisibility(View.GONE);
			} else {
				holder.layout0.setVisibility(View.VISIBLE);
			}
			if (holder.btn1.getVisibility() == View.GONE
					&& holder.btn1f.getVisibility() == View.GONE) {
				holder.layout1.setVisibility(View.GONE);
			} else {
				holder.layout1.setVisibility(View.VISIBLE);
			}
			if (holder.btn2.getVisibility() == View.GONE
					&& holder.btn2f.getVisibility() == View.GONE) {
				holder.layout2.setVisibility(View.GONE);
			} else {
				holder.layout2.setVisibility(View.VISIBLE);
			}
			if (holder.btn3.getVisibility() == View.GONE
					&& holder.btn3f.getVisibility() == View.GONE) {
				holder.layout3.setVisibility(View.GONE);
			} else {
				holder.layout3.setVisibility(View.VISIBLE);
			}
			if (holder.btn4.getVisibility() == View.GONE
					&& holder.btn4f.getVisibility() == View.GONE) {
				holder.layout4.setVisibility(View.GONE);
			} else {
				holder.layout4.setVisibility(View.VISIBLE);
			}

		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}
	}

	class ViewHolder {
		LinearLayout layout0;
		LinearLayout layout1;
		LinearLayout layout2;
		LinearLayout layout3;
		LinearLayout layout4;

		ImageButton btn0;
		ImageButton btn1;
		ImageButton btn2;
		ImageButton btn3;
		ImageButton btn4;

		ImageButton btn0f;
		ImageButton btn1f;
		ImageButton btn2f;
		ImageButton btn3f;
		ImageButton btn4f;

	}
}