package com.vivo.wechatanimation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vivo.wechatanimation.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TabFragment extends Fragment {

    private TextView mTitleView;

    private String mTitle;

    private static final String BUNDLE_KEY="bundle";

    public static TabFragment newInstance(String title){
        Bundle bundle=new Bundle();
        bundle.putString(BUNDLE_KEY,title);
        TabFragment tabFragment=new TabFragment();
        tabFragment.setArguments(bundle);
        return tabFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        mTitleView=view.findViewById(R.id.title);
        mTitleView.setText(mTitle);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments=getArguments();
        if (arguments!=null){
            mTitle=arguments.getString(BUNDLE_KEY);
        }
    }
}
