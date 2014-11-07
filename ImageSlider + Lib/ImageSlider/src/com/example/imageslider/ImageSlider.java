package com.example.imageslider;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.image.slider.utils.BaseSampleActivity;
import com.image.slider.utils.TestFragmentAdapter;
import com.viewpagerindicator.CirclePageIndicator;


public class ImageSlider extends BaseSampleActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image_slider);
		
		addImage();

		mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

		mPager = (ViewPager)findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);

		mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
		mIndicator.setViewPager(mPager);
	}

	private void addImage() 
	{
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//NOTE: We need to change the method in TestFragment line no. 45
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		int noOfImages = 4;
		TestFragmentAdapter.CONTENT =  new String[4];
		
		for(int i=0; i<noOfImages; i++)
		{
			TestFragmentAdapter.CONTENT[i] = (i+1)+".jpg";
		}
		mAdapter = new TestFragmentAdapter(getSupportFragmentManager());
	}
}
