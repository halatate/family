package com.haden.family.fragment.home;

import java.util.List;

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
import com.haden.family.fragment.BaseFragment;

public class HomeFragment extends BaseFragment {
	List<Family> list;

	View rootView;
	AdapterViewFlipper flipper;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_home, container, false);

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
				holder.layout1 = (LinearLayout) convertView
						.findViewById(R.id.layout1);
				holder.layout2 = (LinearLayout) convertView
						.findViewById(R.id.layout2);
				holder.layout3 = (LinearLayout) convertView
						.findViewById(R.id.layout3);
				holder.layout4 = (LinearLayout) convertView
						.findViewById(R.id.layout4);

				holder.btn1 = (ImageButton) convertView
						.findViewById(R.id.btn_1);
				holder.btn2 = (ImageButton) convertView
						.findViewById(R.id.btn_2);
				holder.btn3 = (ImageButton) convertView
						.findViewById(R.id.btn_3);
				holder.btn4 = (ImageButton) convertView
						.findViewById(R.id.btn_4);

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
		LinearLayout layout1;
		LinearLayout layout2;
		LinearLayout layout3;
		LinearLayout layout4;

		ImageButton btn1;
		ImageButton btn2;
		ImageButton btn3;
		ImageButton btn4;

		ImageButton btn1f;
		ImageButton btn2f;
		ImageButton btn3f;
		ImageButton btn4f;

	}
}