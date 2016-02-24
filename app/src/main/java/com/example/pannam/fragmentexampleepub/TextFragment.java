package com.example.pannam.fragmentexampleepub;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by pannam on 2/22/2016.
 */
public class TextFragment extends Fragment{

    private static TextView textview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.text_fragment,container,false);

        textview = (TextView)view.findViewById(R.id.textView1);
        return view;




    }

    public void changeTextProperties(int fontsize, String text){

        textview.setTextSize(fontsize);
        textview.setText(text);
    }


}
