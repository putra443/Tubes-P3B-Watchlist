package com.example.tubes_p3b_watchlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.tubes_p3b_watchlist.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.binding = ActivityMainBinding.inflate(getLayoutInflater());

        this.fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();



    }

    public void changePage(int page){
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if(page==1){
            if(this.binding..isAdded()){
                ft.show(this.mainFragment);
            }
            else{
                ft.add(R.id.fragment_container,this.mainFragment);
            }
            if(this.secondFragment.isAdded()){
                ft.hide(this.secondFragment);
            }
        }
        else if(page==2){
            if(this.secondFragment.isAdded()){
                ft.show(this.secondFragment);
            }
            else{
                ft.add(R.id.fragment_container,this.secondFragment);
            }
            if(this.mainFragment.isAdded()){
                ft.hide(this.mainFragment);
            }
        }
        ft.commit();

    }
}