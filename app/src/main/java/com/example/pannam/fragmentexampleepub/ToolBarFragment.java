package com.example.pannam.fragmentexampleepub;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

/**
 * Created by pannam on 2/22/2016.
 */
public class ToolbarFragment extends Fragment implements
        SeekBar.OnSeekBarChangeListener {

    private static int seekvalue= 10;
    private static EditText edittext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Inflate the layout

        View view = inflater.inflate(R.layout.toolbar_fragment,container,false);
        return view;

        edittext =(EditText)view.findViewById(R.id.editText1);
        final SeekBar seekBar= (SeekBar)view.findViewById(R.id.seekBar1);
        seekBar.setOnSeekBarChangeListener(this);

        final Button button= (Button)view.findViewById(R.id.button1);
       

    }
}
