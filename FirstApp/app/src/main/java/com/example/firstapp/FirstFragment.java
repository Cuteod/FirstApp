package com.example.firstapp;


import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    TextView txtProfile;
    Button btnNext;
    OnDbOpListener dbOpListener;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        btnNext = view.findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
        txtProfile = view.findViewById(R.id.txtprofile);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (getView().getId()){
            case R.id.btnNext:
                dbOpListener.dBOpPerformed(0);
        }

    }

    public interface OnDbOpListener {
        void dBOpPerformed(int method);
    }
}
