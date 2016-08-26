package com.lxy.pager.state;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;


public class BaseFragment extends Fragment {

    private static final String TYPE = "type";
    private RecyclerView mRecyclerView;
    private Context mContext;
    private ArrayList<String> mList;

    public BaseFragment() {

    }

    public static BaseFragment getInstance(String param1) {
        BaseFragment fragment = new BaseFragment();
        Bundle args = new Bundle();
        args.putString(TYPE, param1);
        fragment.setArguments(args);
        return fragment;
    }

    public void initData() {

        if (mList == null) {
            mList = new ArrayList<>();
        }
        for (int i = 0; i < 30; i++) {
            mList.add(i + "");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mContext = getContext();
        initData();
        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        Bundle bundle = getArguments();
        String type = (String) bundle.get(TYPE);

        if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        } else if (type.equals("")) {

        }


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(new CommonAdapter<String>(mContext, R.layout.list_item_base, mList) {
            @Override
            protected void convert(ViewHolder holder, String s, int position) {
                holder.setText(R.id.tv, mList.get(position));
            }
        });

    }

}
