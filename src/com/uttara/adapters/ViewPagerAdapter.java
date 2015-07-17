package com.uttara.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.uttara.activities.R;

public class ViewPagerAdapter extends PagerAdapter {
	
	
	Context context;
	LayoutInflater inflater;
	int[] screens;
	
	
	public ViewPagerAdapter(int[] screens,Context context) {
		this.context = context;
		this.screens = screens;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return screens.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object obj) {
		// TODO Auto-generated method stub
		return view ==(LinearLayout)obj;
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// TODO Auto-generated method stub
		ImageView imageScreens;
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View itemView = inflater.inflate(R.layout.view_page_item, container,false);
		
		imageScreens = (ImageView) itemView.findViewById(R.id.mainScreenImages);
		imageScreens.setImageResource(screens[position]);
		container.addView(itemView);
		
		return itemView;
		
		
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// Remove viewpager_item.xml from ViewPager
		((ViewPager) container).removeView((LinearLayout) object);

	}
}
