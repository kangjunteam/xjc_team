package name.kangjun.xjc.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import name.kangjun.xjc.R;
import name.kangjun.xjc.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuanziFragment extends BaseFragment {


    public QuanziFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_quanzi;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
