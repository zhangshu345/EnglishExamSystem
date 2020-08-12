package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adapter.MainPagerAdapter;
import com.example.base.BaseFragment;
import com.example.myapplication.R;

public class Fragment4 extends Fragment {

    private View view;
    private RecyclerView rvMain;
    private MainPagerAdapter mainPagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_4,null);

        rvMain = view.findViewById(R.id.rv_main);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvMain.setLayoutManager(linearLayoutManager);

        mainPagerAdapter = new MainPagerAdapter(getActivity());
        rvMain.setAdapter(mainPagerAdapter);

        return view;
    }
}
