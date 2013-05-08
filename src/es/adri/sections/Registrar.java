package es.adri.sections;

import es.adri.main.R;
import es.adri.subsections.Apuntar;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Registrar extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registrar);
	}
	
	public void apuntar (View w){
    	Intent i = new Intent();
    	i.setClass(Registrar.this, Apuntar.class);
    	startActivity(i);
	}

}
