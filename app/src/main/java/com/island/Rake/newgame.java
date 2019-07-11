package com.island.Rake;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import android.media.*;

public class newgame extends Activity
{
	public String zona = "2c";
	public String cam1 = "NIENTE";
	public String cam2 = "NIENTE";
	public String cam3 = "NIENTE";
	public String cam4 = "NIENTE";
	public String cam5 = "NIENTE";
	public String centro= "monitor";
	public String immagine="NIENTE";
	public Boolean schermo = false;
	public Boolean notte = false;
	public Boolean morte = false;
	public Boolean rakescappa = false;
	public int ora = 8;
	public int giorno=1;
	public int giornopassato = 5000;
	public String rake="niente";
	private Handler sempre=new Handler();
	private Handler tempo = new Handler();
	private Handler Rake=new Handler();
	private Handler Rakemorte=new Handler();
	public int Rakevita = 100;
	public int vita = 100;
	public int RakeDif = Rakevita * 50;
	MediaPlayer a=null;
	MediaPlayer b = null;
	MediaPlayer c = null;
	MediaPlayer d = null;
	MediaPlayer e = null;
	MediaPlayer f = null;
	MediaPlayer g = null;
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }

	@Override
	protected void onStart()
	{
		// TODO: Implement this method
		super.onStart();
		sempre.postDelayed( ever , 10);
		tempo.postDelayed( clock, giornopassato);
		Rake.postDelayed(RakeAI, RakeDif);
		a = MediaPlayer.create(this,R.raw.a);
		b = MediaPlayer.create(this, R.raw.pistola);
		c = MediaPlayer.create(this, R.raw.assalto);
		d = MediaPlayer.create(this, R.raw.stampante);
		e = MediaPlayer.create(this, R.raw.computer);
		f = MediaPlayer.create(this, R.raw.tasto);
		g = MediaPlayer.create(this, R.raw.morte);
		a.start();

		SharedPreferences settings = getSharedPreferences("Rake",0);
		zona= settings.getString("zona", "2c");
		cam1= settings.getString("cam1", "NIENTE");
		cam2= settings.getString("cam2", "NIENTE");
		cam3= settings.getString("cam3", "NIENTE");
		cam4= settings.getString("cam4", "NIENTE");
		cam5= settings.getString("cam5", "NIENTE");
		centro= settings.getString("centro", "monitor");
		immagine= settings.getString("immagine", "NIENTE");
		rake= settings.getString("rake", "niente");
		notte= settings.getBoolean("notte", false);
		rakescappa= settings.getBoolean("rakescappa", false);
		ora = settings.getInt("ora", 8);
		giorno = settings.getInt("giorno", 1);
		giornopassato = settings.getInt("giornopassato", 5000);
		Rakevita = settings.getInt("rakevita", 100);
		vita = settings.getInt("vita", 100);
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		a.start();
	}

	@Override
	protected void onPause()
	{
		// TODO: Implement this method
		super.onPause();
		a.pause();
	}
	
	@Override
	protected void onStop()
	{
		super.onStop();
		SharedPreferences settings = getSharedPreferences("Rake",MODE_WORLD_WRITEABLE);
		a.stop();
		b.stop();
		c.stop();
		d.stop();
		e.stop();
		f.stop();
		g.stop();
		SharedPreferences.Editor editor =settings.edit();
		editor.clear();
		editor.commit();
		editor.putString("zona", zona);
		editor.putString("cam1", cam1);
		editor.putString("cam2", cam2);
		editor.putString("cam3", cam3);
		editor.putString("cam4", cam4);
		editor.putString("cam5", cam5);
		editor.putString("centro", centro);
		editor.putString("immagine", immagine);
		editor.putBoolean("notte", notte);
		editor.putBoolean("rakescappa", rakescappa);
		editor.putInt("ora", ora);
		editor.putInt("giorno", giorno);
		editor.putInt("giornopassato", giornopassato);
		editor.putString("rake", rake);
		editor.putInt("rakevita", Rakevita);
		editor.putInt("vita", vita);
		editor.commit();
	}
	public void sparasinistra(View v){
		if(morte != true){
		if(schermo != true){
			vita = vita - 5;
			b.start();
			if(zona == "1c")
				if(rake == "1b"){
					Rakevita = Rakevita - 20;
					rakescappa=true;}}
		if(schermo != true)
			if(zona == "2c")
				if(rake == "2b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3c")
				if(rake == "3b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4c")
				if(rake == "4b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "5c")
				if(rake == "5b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "1b")
				if(rake == "1a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "2b")
				if(rake == "2a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3b")
				if(rake == "3a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4b")
				if(rake == "4a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "5b")
				if(rake == "5a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(Rakevita == 0){
			Intent in = new Intent(this, vittoria.class);
			startActivity(in);
			finish();
		}
	}
	}
	public void sparadestra(View v){
		if(morte != true){
		if(schermo != true){
			vita = vita - 5;
			b.start();
			if(zona == "1a")
				if(rake == "1b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}}
		if(schermo != true)
			if(zona == "2a")
				if(rake == "2b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3a")
				if(rake == "3b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4a")
				if(rake == "4b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "5a")
				if(rake == "5b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "1b")
				if(rake == "1c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "2b")
				if(rake == "2c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3b")
				if(rake == "3c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4b")
				if(rake == "4c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "5b")
				if(rake == "5c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(Rakevita == 0){
			Intent in = new Intent(this, vittoria.class);
			startActivity(in);
			finish();
		}
	}
	}
	public void sparagiu(View v){
		if(morte != true){
		if(schermo != true){
			b.start();
			vita = vita - 5;
			if(zona == "5a")
				if(rake == "4a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}}
		if(schermo != true)
			if(zona == "2a")
				if(rake == "1a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3a")
				if(rake == "2a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4a")
				if(rake == "3a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "5b")
				if(rake == "4b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "2b")
				if(rake == "1b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3b")
				if(rake == "2b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4b")
				if(rake == "3b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "5c")
				if(rake == "4c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "2c")
				if(rake == "1c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3c")
				if(rake == "2c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4c")
				if(rake == "3c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(Rakevita == 0){
			Intent in = new Intent(this, vittoria.class);
			startActivity(in);
			finish();
		}
	}
	}
	public void sparasu(View v){
		if(morte != true){
		if(schermo != true){
			vita = vita - 5;
			b.start();
			if(zona == "1a")
				if(rake == "2a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}}
		if(schermo != true)
			if(zona == "2a")
				if(rake == "3a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3a")
				if(rake == "4a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4a")
				if(rake == "5a"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "1b")
				if(rake == "2b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "2b")
				if(rake == "3b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3b")
				if(rake == "4b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4b")
				if(rake == "5b"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "1c")
				if(rake == "2c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "2c")
				if(rake == "3c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "3c")
				if(rake == "4c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(schermo != true)
			if(zona == "4c")
				if(rake == "5c"){
					Rakevita = Rakevita - 20;
					rakescappa = true;}
		if(Rakevita == 0){
			Intent in = new Intent(this, vittoria.class);
			startActivity(in);
			finish();
		}
	}
	}
	public void camera1(View v){
		immagine = cam1;
		f.start();
	}
	public void camera2(View v){
		immagine = cam2;
		f.start();
	}
	public void camera3(View v){
		immagine = cam3;
		f.start();
	}
	public void camera4(View v){
		immagine = cam4;
		f.start();
	}
	public void camera5(View v){
		immagine = cam5;
		f.start();
	}
	public void azione(View v){
		if(morte != true){
		if(centro == "monitor"){
			e.start();
			LinearLayout monitor=(LinearLayout) findViewById(R.id.monitor);
			LinearLayout mappa =(LinearLayout) findViewById(R.id.mappa);
			if(schermo){
				mappa.setVisibility(View.VISIBLE);
				monitor.setVisibility(View.GONE);
				schermo = false;
			}
			else{
				d.start();
				e.start();
			mappa.setVisibility(View.GONE);
			monitor.setVisibility(View.VISIBLE);
			schermo = true;
			}
		}
		if(centro == "posiziona"){
			e.start();
			if(cam1 == "NIENTE")
				cam1 = zona;
			else if(cam2 == "NIENTE")
				cam2 = zona;
			else if(cam3 == "NIENTE")
				cam3 = zona;
			else if(cam4 == "NIENTE")
				cam4 = zona;
			else if(cam5 == "NIENTE")
				cam5 = zona;
		}
		if(centro == "prendi"){
			e.start();
			if(cam1 == zona)
				cam1 = "NIENTE";
			else if(cam2 == zona)
				cam2 = "NIENTE";
			else if(cam3 == zona)
				cam3 = "NIENTE";
			else if(cam4 == zona)
				cam4 = "NIENTE";
			else if(cam5 == zona)
				cam5 = "NIENTE";
		}
		}
	}
	public void sinistra(View v){
	if(schermo != true){
	if(morte != true){
		if(zona=="1b")
			zona = "1a";
		if(zona=="2b")
			zona = "2a";
		if(zona=="3b")
			zona = "3a";
		if(zona=="4b")
			zona = "4a";
		if(zona=="5b")
			zona = "5a";
		if(zona=="1c")
			zona = "1b";
		if(zona=="2c")
			zona = "2b";
		if(zona=="3c")
			zona = "3b";
		if(zona=="4c")
			zona = "4b";
		if(zona=="5c")
			zona = "5b";
		}
		}
	}
	public void destra(View v){
	if(schermo != true){
	if(morte != true){
		if(zona=="1b")
			zona = "1c";
		if(zona=="2b")
			zona = "2c";
		if(zona=="3b")
			zona = "3c";
		if(zona=="4b")
			zona = "4c";
		if(zona=="5b")
			zona = "5c";
		if(zona=="1a")
			zona = "1b";
		if(zona=="2a")
			zona = "2b";
		if(zona=="3a")
			zona = "3b";
		if(zona=="4a")
			zona = "4b";
		if(zona=="5a")
			zona = "5b";
		}
		}
	}
	public void giu(View v){
	if(schermo != true){
	if(morte != true){
		if(zona=="2a")
			zona = "1a";
		if(zona=="3a")
			zona = "2a";
		if(zona=="4a")
			zona = "3a";
		if(zona=="5a")
			zona = "4a";
		if(zona=="2b")
			zona = "1b";
		if(zona=="3b")
			zona = "2b";
		if(zona=="4b")
			zona = "3b";
		if(zona=="5b")
			zona = "4b";
		if(zona=="2c")
			zona = "1c";
		if(zona=="3c")
			zona = "2c";
		if(zona=="4c")
			zona = "3c";
		if(zona=="5c")
			zona = "4c";
		}
		}
	}
	public void su(View v){
	if(schermo != true){
	if(morte != true){
		if(zona=="4a")
			zona = "5a";
		if(zona=="3a")
			zona = "4a";
		if(zona=="2a")
			zona = "3a";
		if(zona=="1a")
			zona = "2a";
		if(zona=="4b")
			zona = "5b";
		if(zona=="3b")
			zona = "4b";
		if(zona=="2b")
			zona = "3b";
		if(zona=="1b")
			zona = "2b";
		if(zona=="4c")
			zona = "5c";
		if(zona=="3c")
			zona = "4c";
		if(zona=="2c")
			zona = "3c";
		if(zona=="1c")
			zona = "2c";
		}
		}
	}
	public Runnable RakeAI = new Runnable(){
		public void run(){
			Rake.postDelayed(RakeAI, RakeDif);
			int direzione = 4;
			Random random = new Random();
			direzione = random.nextInt(3);
			if(direzione == 0){
				direzione = 4;
				if(rake=="4a")
					rake = "5a";
				if(rake=="3a")
					rake = "4a";
				if(rake=="2a")
					rake = "3a";
				if(rake=="1a")
					rake = "2a";
				if(rake=="4b")
					rake = "5b";
				if(rake=="3b")
					rake = "4b";
				if(rake=="2b")
					rake = "3b";
				if(rake=="1b")
					rake = "2b";
				if(rake=="4c")
					rake = "5c";
				if(rake=="3c")
					rake = "4c";
			}
			if(direzione == 1){
				direzione = 4;
				if(rake=="2a")
					rake = "1a";
				if(rake=="3a")
					rake = "2a";
				if(rake=="4a")
					rake = "3a";
				if(rake=="5a")
					rake = "4a";
				if(rake=="2b")
					rake = "1b";
				if(rake=="3b")
					rake = "2b";
				if(rake=="4b")
					rake = "3b";
				if(rake=="5b")
					rake = "4b";
				if(rake=="4c")
					rake = "3c";
				if(rake=="5c")
					rake = "4c";
			}
			if(direzione == 2){
				direzione = 4;
				if(rake=="1b")
					rake = "1c";
				if(rake=="3b")
					rake = "3c";
				if(rake=="4b")
					rake = "4c";
				if(rake=="5b")
					rake = "5c";
				if(rake=="1a")
					rake = "1b";
				if(rake=="2a")
					rake = "2b";
				if(rake=="3a")
					rake= "3b";
				if(rake=="4a")
					rake = "4b";
				if(rake=="5a")
					rake = "5b";
			}
			if(direzione == 3){
				direzione = 4;
				if(rake=="1b")
					rake = "1a";
				if(rake=="2b")
					rake = "2a";
				if(rake=="3b")
					rake = "3a";
				if(rake=="4b")
					rake = "4a";
				if(rake=="5b")
					rake = "5a";
				if(rake=="1c")
					rake = "1b";
				if(rake=="3c")
					rake = "3b";
				if(rake=="4c")
					rake = "4b";
				if(rake=="5c")
					rake = "5b";
			}
		}
	};
	public Runnable clock=new Runnable(){
		public void run(){
			tempo.postDelayed(this, giornopassato);
			ora = ora + 1 ;
			if(ora == 8){
				create();
				rake = "niente";
				//giornopassato = giornopassato/2;
			}
			if(ora==20){
				a.stop();
				a.release();
				//giornopassato = giornopassato * 2;
				int direzione = 14;
				Random random = new Random();
				direzione = random.nextInt(13);
				if(direzione == 0){
					rake = "1a";
					direzione = 14;
				}
				else if(direzione == 1){
					rake = "2a";
					direzione = 14;
				}
				else if(direzione == 2){
					rake = "3a";
					direzione = 14;
				}
				else if(direzione == 3){
					rake = "4a";
					direzione = 14;
				}
				else if(direzione == 4){
					rake = "5a";
					direzione = 14;
				}
				else if(direzione == 5){
					rake = "1b";
					direzione = 14;
				}
				else if(direzione == 6){
					rake = "2b";
					direzione = 14;
				}
				else if(direzione == 7){
					rake = "3b";
					direzione = 14;
				}
				else if(direzione == 8){
					rake = "4b";
					direzione = 14;
				}
				else if(direzione == 9){
					rake = "5b";
					direzione = 14;
				}
				else if(direzione == 10){
					rake = "1c";
					direzione = 14;
				}
				else if(direzione == 11){
					rake = "3c";
					direzione = 14;
				}
				else if(direzione == 12){
					rake = "4c";
					direzione = 14;
				}
				else if(direzione == 13){
					rake = "5c";
					direzione = 14;
				}
			}
		}
	};
	public Runnable Rakeazione =new Runnable(){
		public void run(){
			if(vita > 1){
			RelativeLayout rakemorte =(RelativeLayout) findViewById(R.id.rakemorte);
			LinearLayout bosco = (LinearLayout)findViewById(R.id.mappa);
			rakemorte.setVisibility(View.GONE);
			bosco.setVisibility(View.VISIBLE);
			morte = false;}
			else{
				g.start();
			}
		}
	};
	public Runnable ever=new Runnable(){
		public void run(){
			TextView ubicazione= (TextView) findViewById(R.id.ubicazione);
			ubicazione.setText(zona);
			if(rakescappa){
				rakescappa = false;
				int direzione = 14;
				Random random = new Random();
				direzione = random.nextInt(13);
				if(direzione == 0){
					rake = "1a";
					direzione = 14;
				}
				else if(direzione == 1){
					rake = "2a";
					direzione = 14;
				}
				else if(direzione == 2){
					rake = "3a";
					direzione = 14;
				}
				else if(direzione == 3){
					rake = "4a";
					direzione = 14;
				}
				else if(direzione == 4){
					rake = "5a";
					direzione = 14;
				}
				else if(direzione == 5){
					rake = "1b";
					direzione = 14;
				}
				else if(direzione == 6){
					rake = "2b";
					direzione = 14;
				}
				else if(direzione == 7){
					rake = "3b";
					direzione = 14;
				}
				else if(direzione == 8){
					rake = "4b";
					direzione = 14;
				}
				else if(direzione == 9){
					rake = "5b";
					direzione = 14;
				}
				else if(direzione == 10){
					rake = "1c";
					direzione = 14;
				}
				else if(direzione == 11){
					rake = "3c";
					direzione = 14;
				}
				else if(direzione == 12){
					rake = "4c";
					direzione = 14;
				}
				else if(direzione == 13){
					rake = "5c";
					direzione = 14;
				}
			}
			RelativeLayout rakemorte =(RelativeLayout) findViewById(R.id.rakemorte);
			LinearLayout bosco = (LinearLayout)findViewById(R.id.mappa);
			if(zona == rake){
				c.start();
				rakemorte.setVisibility(View.VISIBLE);
				bosco.setVisibility(View.GONE);
				Rakemorte.postDelayed(Rakeazione, 4000);
				int direzione = 14;
				Random random = new Random();
				vita = vita-10;
				direzione = random.nextInt(13);
				if(direzione == 0){
					rake = "1a";
					direzione = 14;
				}
				else if(direzione == 1){
					rake = "2a";
					direzione = 14;
				}
				else if(direzione == 2){
					rake = "3a";
					direzione = 14;
				}
				else if(direzione == 3){
					rake = "4a";
					direzione = 14;
				}
				else if(direzione == 4){
					rake = "5a";
					direzione = 14;
				}
				else if(direzione == 5){
					rake = "1b";
					direzione = 14;
				}
				else if(direzione == 6){
					rake = "2b";
					direzione = 14;
				}
				else if(direzione == 7){
					rake = "3b";
					direzione = 14;
				}
				else if(direzione == 8){
					rake = "4b";
					direzione = 14;
				}
				else if(direzione == 9){
					rake = "5b";
					direzione = 14;
				}
				else if(direzione == 10){
					rake = "1c";
					direzione = 14;
				}
				else if(direzione == 11){
					rake = "3c";
					direzione = 14;
				}
				else if(direzione == 12){
					rake = "4c";
					direzione = 14;
				}
				else if(direzione == 13){
					rake = "5c";
					direzione = 14;
				}
				morte = true;}
			RakeDif = Rakevita * 50;
			TextView mostravitarake=(TextView) findViewById(R.id.mostravitarake);
			TextView mostravita=(TextView) findViewById(R.id.mostravita);
			if(vita == 95)
				mostravita.setText("95");
			if(vita == 90)
				mostravita.setText("90");
			if(vita == 85)
				mostravita.setText("85");
			if(vita == 80)
				mostravita.setText("80");
			if(vita == 75)
				mostravita.setText("75");
			if(vita == 70)
				mostravita.setText("70");
			if(vita == 65)
				mostravita.setText("65");
			if(vita == 60)
				mostravita.setText("60");
			if(vita == 55)
				mostravita.setText("55");
			if(vita == 50)
				mostravita.setText("50");
			if(vita == 45)
				mostravita.setText("45");
			if(vita == 40)
				mostravita.setText("40");
			if(vita == 35)
				mostravita.setText("35");
			if(vita == 30)
				mostravita.setText("30");
			if(vita == 25)
				mostravita.setText("25");
			if(vita == 20)
				mostravita.setText("20");
			if(vita == 15)
				mostravita.setText("15");
			if(vita == 10)
				mostravita.setText("10");
			if(vita == 5)
				mostravita.setText("5");
			if(vita < 1){
				rakemorte.setVisibility(View.VISIBLE);
				bosco.setVisibility(View.GONE);
				Rakemorte.postDelayed(Rakeazione, 5000);
				mostravita.setText("0");}
			if(Rakevita == 80)
				mostravitarake.setText("80");
			if(Rakevita == 60)
				mostravitarake.setText("60");
			if(Rakevita == 40)
				mostravitarake.setText("40");
			if(Rakevita == 20)
				mostravitarake.setText("20");
			if(Rakevita == 0){
				mostravitarake.setText("0");}
			if(ora == 20){
				bosco.setBackgroundResource(R.drawable.bosconotte);
				notte = true;}
			if(ora == 8){
				bosco.setBackgroundResource(R.drawable.bosco);
				notte = false;}
			sempre.postDelayed(this, 10);
			RelativeLayout schermo = (RelativeLayout) findViewById(R.id.immagine);
			TextView camera1 = (TextView)findViewById(R.id.camera1);
			camera1.setText(cam1);
			TextView camera2 = (TextView)findViewById(R.id.camera2);
			camera2.setText(cam2);
			TextView camera3 = (TextView)findViewById(R.id.camera3);
			camera3.setText(cam3);
			TextView camera4 = (TextView)findViewById(R.id.camera4);
			camera4.setText(cam4);
			TextView camera5 = (TextView)findViewById(R.id.camera5);
			camera5.setText(cam5);
			Button azione = (Button) findViewById(R.id.azione);
			ImageView mostro =(ImageView) findViewById(R.id.rake);
			TextView orario =(TextView) findViewById(R.id.orario);
			TextView giornata =(TextView) findViewById(R.id.giornata);
			
			if(giorno == 1)
				giornata.setText("1");
			if(giorno == 2)
				giornata.setText("2");
			if(giorno == 3)
				giornata.setText("3");
			if(giorno == 4)
				giornata.setText("4");
			if(giorno == 5)
				giornata.setText("5");
			if(giorno == 6)
				giornata.setText("6");
			if(giorno == 7)
				giornata.setText("7");
			if(giorno == 8)
				giornata.setText("8");
			if(giorno == 9)
				giornata.setText("9");
			if(giorno == 10)
				giornata.setText("10");
			if(giorno == 11)
				giornata.setText("11");
			if(giorno == 12)
				giornata.setText("12");
			if(giorno == 13)
				giornata.setText("13");
			if(giorno == 14)
				giornata.setText("14");
			if(giorno == 15)
				giornata.setText("15");
			if(giorno == 16)
				giornata.setText("16");
			if(giorno == 17)
				giornata.setText("17");
			if(giorno == 18)
				giornata.setText("18");
			if(giorno == 19)
				giornata.setText("19");
			if(giorno == 20)
				giornata.setText("20");
			
			if(ora == 24){
				orario.setText("24");
				ora=0;
				giorno=giorno + 1;
			}
			if(ora == 1)
				orario.setText("1");
			if(ora == 2)
				orario.setText("2");
			if(ora == 3)
				orario.setText("3");
			if(ora == 4)
				orario.setText("4");
			if(ora == 5)
				orario.setText("5");
			if(ora == 6)
				orario.setText("6");
			if(ora == 7)
				orario.setText("7");
			if(ora == 8)
				orario.setText("8");
			if(ora == 9)
				orario.setText("9");
			if(ora == 10)
				orario.setText("10");
			if(ora == 11)
				orario.setText("11");
			if(ora == 12)
				orario.setText("12");
			if(ora == 13)
				orario.setText("13");
			if(ora == 14)
				orario.setText("14");
			if(ora == 15)
				orario.setText("15");
			if(ora == 16)
				orario.setText("16");
			if(ora == 17)
				orario.setText("17");
			if(ora == 18)
				orario.setText("18");
			if(ora == 19)
				orario.setText("19");
			if(ora == 20)
				orario.setText("20");
			if(ora == 21)
				orario.setText("21");
			if(ora == 22)
				orario.setText("22");
			if(ora == 23)
				orario.setText("23");
			if(immagine == "NIENTE"){
				schermo.setBackgroundResource(R.drawable.schermo);}
			if(immagine == "1a"){
				schermo.setBackgroundResource(R.drawable.unoa);
				if(notte)
					schermo.setBackgroundResource(R.drawable.unoabuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "1a")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "2a"){
				schermo.setBackgroundResource(R.drawable.duea);
				if(notte)
					schermo.setBackgroundResource(R.drawable.dueabuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "2a")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "3a"){
				schermo.setBackgroundResource(R.drawable.trea);
				if(notte)
					schermo.setBackgroundResource(R.drawable.treabuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "3a")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "4a"){
				schermo.setBackgroundResource(R.drawable.quattroa);
				if(notte)
					schermo.setBackgroundResource(R.drawable.quattroabuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "4a")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "5a"){
				schermo.setBackgroundResource(R.drawable.cinquea);
				if(notte)
					schermo.setBackgroundResource(R.drawable.cinqueabuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "5a")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "1b"){
				schermo.setBackgroundResource(R.drawable.unob);
				if(notte)
					schermo.setBackgroundResource(R.drawable.unobbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "1b")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "2b"){
				schermo.setBackgroundResource(R.drawable.dueb);
				if(notte)
					schermo.setBackgroundResource(R.drawable.duebbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "2b")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "3b"){
				schermo.setBackgroundResource(R.drawable.treb);
				if(notte)
					schermo.setBackgroundResource(R.drawable.trebbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "3b")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "4b"){
				schermo.setBackgroundResource(R.drawable.quattrob);
				if(notte)
					schermo.setBackgroundResource(R.drawable.quattrobbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "4b")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "5b"){
				schermo.setBackgroundResource(R.drawable.cinqueb);
				if(notte)
					schermo.setBackgroundResource(R.drawable.cinquebbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "5b")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "1c"){
				schermo.setBackgroundResource(R.drawable.unoc);
				if(notte)
					schermo.setBackgroundResource(R.drawable.unobbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "1c")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "3c"){
				schermo.setBackgroundResource(R.drawable.trec);
				if(notte)
					schermo.setBackgroundResource(R.drawable.trecbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "3c")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "4c"){
				schermo.setBackgroundResource(R.drawable.quattroc);
				if(notte)
					schermo.setBackgroundResource(R.drawable.quattrocbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "4c")
					mostro.setVisibility(View.VISIBLE);}
			if(immagine == "5c"){
				schermo.setBackgroundResource(R.drawable.cinquec);
				if(notte)
					schermo.setBackgroundResource(R.drawable.cinquecbuio);
				mostro.setVisibility(View.INVISIBLE);
				if(rake == "5c")
					mostro.setVisibility(View.VISIBLE);}
			if(zona=="2c"){
				azione.setText("MONITOR");
				centro="monitor";
			}
			else if(cam1 == zona){
				azione.setText("PRENDI");
				centro="prendi";
			}
			else if(cam2 == zona){
				azione.setText("PRENDI");
				centro="prendi";
			}
			else if(cam3 == zona){
				azione.setText("PRENDI");
				centro="prendi";
			}
			else if(cam4 == zona){
				azione.setText("PRENDI");
				centro="prendi";
			}
			else if(cam5 == zona){
				azione.setText("PRENDI");
				centro="prendi";
			}
			else{
				azione.setText("POSIZIONA");
				centro="posiziona";
			}
			if(zona=="1a"){
				ImageView coso =(ImageView) findViewById(R.id.unoa);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "1a")
					if(cam2 != "1a")
						if(cam3 != "1a")
							if(cam4 != "1a")
								if(cam5 != "1a")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.unoa);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "1a")
					if(cam2 != "1a")
						if(cam3 != "1a")
							if(cam4 != "1a")
								if(cam5 != "1a")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="2a"){
				ImageView coso =(ImageView) findViewById(R.id.duea);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "2a")
					if(cam2 != "2a")
						if(cam3 != "2a")
							if(cam4 != "2a")
								if(cam5 != "2a")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.duea);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "2a")
					if(cam2 != "2a")
						if(cam3 != "2a")
							if(cam4 != "2a")
								if(cam5 != "2a")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="3a"){
				ImageView coso =(ImageView) findViewById(R.id.trea);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "3a")
					if(cam2 != "3a")
						if(cam3 != "3a")
							if(cam4 != "3a")
								if(cam5 != "3a")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.trea);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "3a")
					if(cam2 != "3a")
						if(cam3 != "3a")
							if(cam4 != "3a")
								if(cam5 != "3a")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="4a"){
				ImageView coso =(ImageView) findViewById(R.id.quattroa);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "4a")
					if(cam2 != "4a")
						if(cam3 != "4a")
							if(cam4 != "4a")
								if(cam5 != "4a")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.quattroa);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "4a")
					if(cam2 != "4a")
						if(cam3 != "4a")
							if(cam4 != "4a")
								if(cam5 != "4a")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="5a"){
				ImageView coso =(ImageView) findViewById(R.id.cinquea);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "5a")
					if(cam2 != "5a")
						if(cam3 != "5a")
							if(cam4 != "5a")
								if(cam5 != "5a")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.cinquea);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "5a")
					if(cam2 != "5a")
						if(cam3 != "5a")
							if(cam4 != "5a")
								if(cam5 != "5a")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="1b"){
				ImageView coso =(ImageView) findViewById(R.id.unob);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "1b")
					if(cam2 != "1b")
						if(cam3 != "1b")
							if(cam4 != "1b")
								if(cam5 != "1b")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.unob);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "1b")
					if(cam2 != "1b")
						if(cam3 != "1b")
							if(cam4 != "1b")
								if(cam5 != "1b")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="2b"){
				ImageView coso =(ImageView) findViewById(R.id.dueb);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "2b")
					if(cam2 != "2b")
						if(cam3 != "2b")
							if(cam4 != "2b")
								if(cam5 != "2b")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.dueb);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "2b")
					if(cam2 != "2b")
						if(cam3 != "2b")
							if(cam4 != "2b")
								if(cam5 != "2b")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="3b"){
				ImageView coso =(ImageView) findViewById(R.id.treb);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "3b")
					if(cam2 != "3b")
						if(cam3 != "3b")
							if(cam4 != "3b")
								if(cam5 != "3b")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.treb);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "3b")
					if(cam2 != "3b")
						if(cam3 != "3b")
							if(cam4 != "3b")
								if(cam5 != "3b")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="4b"){
				ImageView coso =(ImageView) findViewById(R.id.quattrob);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "4b")
					if(cam2 != "4b")
						if(cam3 != "4b")
							if(cam4 != "4b")
								if(cam5 != "4b")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.quattrob);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "4b")
					if(cam2 != "4b")
						if(cam3 != "4b")
							if(cam4 != "4b")
								if(cam5 != "4b")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="5b"){
				ImageView coso =(ImageView) findViewById(R.id.cinqueb);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "5b")
					if(cam2 != "5b")
						if(cam3 != "5b")
							if(cam4 != "5b")
								if(cam5 != "5b")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.cinqueb);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "5b")
					if(cam2 != "5b")
						if(cam3 != "5b")
							if(cam4 != "5b")
								if(cam5 != "5b")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="1c"){
				ImageView coso =(ImageView) findViewById(R.id.unoc);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "1c")
					if(cam2 != "1c")
						if(cam3 != "1c")
							if(cam4 != "1c")
								if(cam5 != "1c")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.unoc);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "1c")
					if(cam2 != "1c")
						if(cam3 != "1c")
							if(cam4 != "1c")
								if(cam5 != "1c")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="2c"){
				ImageView coso =(ImageView) findViewById(R.id.duec);
				coso.setImageResource(R.drawable.baseyou);
				if(cam1 != "2c")
					if(cam2 != "2c")
						if(cam3 != "2c")
							if(cam4 != "2c")
								if(cam5 != "2c")
									coso.setImageResource(R.drawable.baseyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.duec);
				coso.setImageResource(R.drawable.base);
				if(cam1 != "2c")
					if(cam2 != "2c")
						if(cam3 != "2c")
							if(cam4 != "2c")
								if(cam5 != "2c")
									coso.setImageResource(R.drawable.base);
			}
			if(zona=="3c"){
				ImageView coso =(ImageView) findViewById(R.id.trec);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "3c")
					if(cam2 != "3c")
						if(cam3 != "3c")
							if(cam4 != "3c")
								if(cam5 != "3c")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.trec);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "3c")
					if(cam2 != "3c")
						if(cam3 != "3c")
							if(cam4 != "3c")
								if(cam5 != "3c")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="4c"){
				ImageView coso =(ImageView) findViewById(R.id.quattroc);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "4c")
					if(cam2 != "4c")
						if(cam3 != "4c")
							if(cam4 != "4c")
								if(cam5 != "4c")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.quattroc);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "4c")
					if(cam2 != "4c")
						if(cam3 != "4c")
							if(cam4 != "4c")
								if(cam5 != "4c")
									coso.setImageResource(R.drawable.rosso);
			}
			if(zona=="5c"){
				ImageView coso =(ImageView) findViewById(R.id.cinquec);
				coso.setImageResource(R.drawable.verdeyou);
				if(cam1 != "5c")
					if(cam2 != "5c")
						if(cam3 != "5c")
							if(cam4 != "5c")
								if(cam5 != "5c")
									coso.setImageResource(R.drawable.rossoyou);
			}
			else{
				ImageView coso =(ImageView) findViewById(R.id.cinquec);
				coso.setImageResource(R.drawable.verde);
				if(cam1 != "5c")
					if(cam2 != "5c")
						if(cam3 != "5c")
							if(cam4 != "5c")
								if(cam5 != "5c")
									coso.setImageResource(R.drawable.rosso);
			}
		}
	};
	public void create(){
		a=MediaPlayer.create(this,R.raw.a);
		a.start();
	}
}
