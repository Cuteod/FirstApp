package com.example.firstapp;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.view.menu.MenuView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.lang.annotation.Target;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


public class SecondFragment extends Fragment{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    EditText EtName, EtUsername, EtEmail, EtTrack;



    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        EtName = view.findViewById(R.id.EtName);
        EtUsername = view.findViewById(R.id.EtUsername);
        EtEmail = view.findViewById(R.id.EtEmail);
        EtTrack = view.findViewById(R.id.EtTrack);

        return view;

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
         EditText EtName = (EditText) view.findViewById(R.id.EtName);
        EditText EtUsername = (EditText) view.findViewById(R.id.EtUsername);
        EditText EtEmail = (EditText) view.findViewById(R.id.EtEmail);
        EditText EtTrack = (EditText) view.findViewById(R.id.EtTrack);
    }

}
