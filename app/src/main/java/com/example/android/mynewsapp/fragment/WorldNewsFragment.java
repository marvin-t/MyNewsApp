/**
 * Inspired by the Udacity Android Basics by Google Nanodegree Program Course
 * Material as well as Soojeong Shin. This code is mostly copied and modified for the
 * 6th and final project.
 * ~ Marvin Tittleton
 */

package com.example.android.mynewsapp.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import android.util.Log;

import com.example.android.mynewsapp.News;
import com.example.android.mynewsapp.NewsLoader;
import com.example.android.mynewsapp.NewsPreferences;
import com.example.android.mynewsapp.R;

import java.util.List;

/**
 * The WorldNewsFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class WorldNewsFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = WorldNewsFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String worldUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.worldnews));
        Log.e(LOG_TAG, worldUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), worldUrl);
    }
}
