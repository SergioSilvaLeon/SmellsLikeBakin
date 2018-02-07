package com.ssilva.smellslikebakin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by sergiosilva on 2/7/18.
 */

public class ViewPagerFragment extends Fragment {

    public static final String KEY_RECIPE_INDEX = "KEY_RECIPE_INDEX";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        int index = getArguments().getInt(KEY_RECIPE_INDEX);
        View view = inflater.inflate(R.layout.fragment_viewpager, container, false);
        getActivity().setTitle(Recipes.names[index]);
        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        getActivity().setTitle(getResources().getString(R.string.app_name));
    }
}
