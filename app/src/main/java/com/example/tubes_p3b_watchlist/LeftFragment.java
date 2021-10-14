package com.example.tubes_p3b_watchlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tubes_p3b_watchlist.databinding.FragmentLeftBinding;


public class LeftFragment extends Fragment implements View.OnClickListener {
    protected FragmentLeftBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentLeftBinding.inflate(inflater,container,false);
        this.binding.home.setOnClickListener(this);
        this.binding.page2.setOnClickListener(this);
        this.binding.exit.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        Bundle result = new Bundle();
        if(v == this.binding.home){
            result.putInt("page", 1);
            getParentFragmentManager().setFragmentResult("changePage", result);
        }else if(v == this.binding.home){
            result.putInt("page", 2);
            getParentFragmentManager().setFragmentResult("changePage", result);
        }else{
            getParentFragmentManager().setFragmentResult("closeApplication", result);
        }
    }
}
