/**
 * Inspired by the Udacity Android Basics by Google Nanodegree Program Course
 * Material as well as Soojeong Shin. This code is mostly copied and modified for the
 * 6th and final project.
 * ~ Marvin Tittleton
 */

package com.example.android.mynewsapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.mynewsapp.R;
import com.example.android.mynewsapp.fragment.BreakingNewsFragment;
import com.example.android.mynewsapp.fragment.WorldNewsFragment;
import com.example.android.mynewsapp.utils.Constants;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     * across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case Constants.BREAKINGNEWS:
                return new BreakingNewsFragment();
            case Constants.WORLDNEWS:
                return new WorldNewsFragment();
            default:
                return null;
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * Return page title of the tap
     */
    @Override
    public CharSequence getPageTitle(int position) {
        int titleResId;
        switch (position) {
            case Constants.BREAKINGNEWS:
                titleResId = R.string.breakingnews;
                break;
            default:
                titleResId = R.string.worldnews;
                break;
        }
        return mContext.getString(titleResId);
    }
}