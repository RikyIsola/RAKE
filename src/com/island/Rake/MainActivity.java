package com.island.Rake;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		SharedPreferences settings = getSharedPreferences("Rake",MODE_WORLD_WRITEABLE);
		SharedPreferences.Editor editor =settings.edit();
		editor.clear();
		editor.commit();
    }
	public void start(View v){
		SharedPreferences settings = getSharedPreferences("Rake",MODE_WORLD_WRITEABLE);
		SharedPreferences.Editor editor =settings.edit();
		editor.clear();
		editor.commit();
		editor.putString("zona", "2c");
		editor.putString("cam1", "NIENTE");
		editor.putString("cam2", "NIENTE");
		editor.putString("cam3", "NIENTE");
		editor.putString("cam4", "NIENTE");
		editor.putString("cam5", "NIENTE");
		editor.putString("centro", "monitor");
		editor.putString("immagine", "NIENTE");
		editor.putBoolean("notte", false);
		editor.putBoolean("rakescappa", false);
		editor.putInt("giorno", 1);
		editor.putInt("giornopassato", 5000);
		editor.putString("rake", "niente");
		editor.putInt("rakevita", 100);
		editor.putInt("vita", 100);
		editor.putInt("ora", 8);
		editor.commit();
		Intent in = new Intent(this, newgame.class);
		startActivity(in);
		finish();
	}
	public void load(View v){
		Intent a = new Intent(this, newgame.class);
		startActivity(a);
		finish();
	}
	public void regole(View v){
		Intent a = new Intent(this, regole.class);
		startActivity(a);
	}
}
