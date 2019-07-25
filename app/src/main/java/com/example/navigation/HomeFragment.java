package com.example.navigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;

public class HomeFragment extends Fragment {

    Button accountButton, settingsButton;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        container = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);
        accountButton = container.findViewById(R.id.goToAccountFragment);
        settingsButton = container.findViewById(R.id.goToSettingsFragment);

        return container;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        accountButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.accountFragment));
        settingsButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.seetingsFragment));

    }
}
