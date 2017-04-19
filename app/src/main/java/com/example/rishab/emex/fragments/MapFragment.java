package com.example.rishab.emex.fragments;

import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishab.emex.R;
import  com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by Rishab on 19-04-2017.
 */

public class MapFragment extends android.support.v4.app.Fragment implements OnMapReadyCallback {

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentmap, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.idmap);
        supportMapFragment.getMapAsync(this);
        Log.d("MapFragment", "onCreateView: ");
        return view;
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

    }
}

