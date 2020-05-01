package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.Fragment.CallsFragment;
import com.example.myapplication.Fragment.CameraFragment;
import com.example.myapplication.Fragment.ChatsFragment;
import com.example.myapplication.Fragment.StatusFragment;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                CameraFragment cameraFragment = new CameraFragment();
                return cameraFragment;
            case 1:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;
            case 2:
                StatusFragment statusFragment = new StatusFragment();
                return statusFragment;
            case 3:
                CallsFragment callsFragment = new CallsFragment();
                return callsFragment;

            default : return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "";
            case 1:
                return "CHATS";
            case 2:
                return "STATUS";
            case 3:
                return "CALLS";

            default : return null;
        }
    }
}
