package com.example.navigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class SeetingsFragment extends Fragment {

    Button accountButton;
    EditText nameEditText;

    public SeetingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        container = (ViewGroup) inflater.inflate(R.layout.fragment_seetings, container, false);
        accountButton = container.findViewById(R.id.button);
        nameEditText = container.findViewById(R.id.editText);


        return container;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("nameArgs", nameEditText.getText().toString());

                Navigation.findNavController(v).navigate(R.id.accountFragment, bundle);

            }
        });


    }
}
