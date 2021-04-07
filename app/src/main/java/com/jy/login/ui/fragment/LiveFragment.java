package com.jy.login.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.jy.login.R;

import java.util.ArrayList;
import java.util.List;


public class LiveFragment extends Fragment {

    private ViewPager mViewpager;
    private ConstraintLayout mMainCon;
    private TabLayout mTablayout;

    public LiveFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_live, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(@NonNull final View itemView) {
        mViewpager = (ViewPager) itemView.findViewById(R.id.viewpager);
        mMainCon = (ConstraintLayout) itemView.findViewById(R.id.con_Main);
        mTablayout = (TabLayout) itemView.findViewById(R.id.tablayout);

        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            LIveChildFragment liveChildFragment = new LIveChildFragment();
            fragments.add(liveChildFragment);
        }

        mViewpager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
        mTablayout.setupWithViewPager(mViewpager);
        mTablayout.getTabAt(0).setText("直播");
        mTablayout.getTabAt(1).setText("看回播");
        mTablayout.getTabAt(2).setText("官方文章");

    }
}