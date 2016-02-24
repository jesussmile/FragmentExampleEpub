package com.example.pannam.fragmentexampleepub;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class FragmentActivityExample extends FragmentActivity implements ToolBarFragment.ToolbarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity_example);
    }

    @Override
    public void onButtonClick(int fontSize, String text) {

        TextFragment textFragment = (TextFragment)getSupportFragmentManager().findFragmentById(
                R.id.text_fragment);
        textFragment.changeTextProperties(fontSize, text);


    }
}
