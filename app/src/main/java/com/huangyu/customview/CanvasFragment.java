package com.huangyu.customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huangyu.customviewlibrary.canvas_view.CanvasView;

/**
 * Created by huangyu on 2017-3-31.
 */
public class CanvasFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_canvas, container, false);
        CanvasView canvasView = (CanvasView) view.findViewById(R.id.canvas);
        canvasView.setParentView(((MainActivity) getActivity()).viewPager);
        return view;
    }

}
