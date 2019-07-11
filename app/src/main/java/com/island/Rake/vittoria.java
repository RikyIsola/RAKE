package com.island.Rake;

import android.app.*;
import android.media.*;
import android.os.*;

public class vittoria extends Activity
{
	MediaPlayer a = null;
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
		a = MediaPlayer.create(this, R.raw.vittoria);
		a.start();
    }
}
