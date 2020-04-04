package com.sunflower.pantaucovid19;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Pantau-Covid19
 * Copyright (C) 04/04/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.sunflower.pantaucovid19
 */
public class BaseFragment extends Fragment {

    protected BaseActivity mActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = new BaseActivity();
    }


    protected void showToastShort(String message) {
        mActivity.showToastShort(message);
    }

    protected void showToastLong(String message) {
        mActivity.showToastLong(message);
    }

    protected void setupFragment(Fragment fragment, int layout) {
        getChildFragmentManager()
                .beginTransaction()
                .replace(layout, fragment)
                .commit();
    }



}
