package com.smart.tamanpintar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    //Arrays
    public int[] slide_images = {
            R.drawable.pintar_icon,
            R.drawable.info_icon,
            R.drawable.git_icon
    };

    public String[] slide_headings = {
            "WELCOME TO TAMAN PINTAR",
            "INFORMATION APPS",
            "HEY, IT'S ON GITHUB. YAY !"
    };

    public String[] slide_desc = {
            "Taman Pintar is a tourism object for kids and a place for " +
                    "expression, appreciation, creation in a pleasant situation",
            "The apps itself is just for information guide in Taman Pintar." +
                    "This app is usable in offline and online",
            "We also made some repo on Github. Please feel free to tell us " +
                    "if there are issue related to the apps." +
                    "Check it : github.com/xecteus/TamanPintar"
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slidelayout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.img_slider);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }

    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
