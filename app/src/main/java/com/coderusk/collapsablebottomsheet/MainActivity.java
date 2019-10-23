package com.coderusk.collapsablebottomsheet;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.animation.*;
import android.widget.*;

import com.coderusk.collapsablebottomsheet.R;

public class MainActivity extends Activity
{
    private boolean state=true;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        try
        {setContentView(R.layout.activity_main);}
        catch (Exception e)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick(View v)
    {
        View vi=findViewById(R.id.collapse);
        translate(vi);
    }

    public void translate(View view)
    {
        //TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 000.0f, 0.0f,800.0f);
        //translateAnimation.setDuration(100); // 1 second
        //view.startAnimation(translateAnimation);
        int anim;
        if(state)
        {
            anim= R.anim.anim_1;
            view.setVisibility(View.VISIBLE);
        }
        else
        {
            anim=R.anim.anim_0;
        }
        Animation animation = AnimationUtils.loadAnimation(this, anim);
        view.startAnimation(animation);
        state=!state;
    }
}
