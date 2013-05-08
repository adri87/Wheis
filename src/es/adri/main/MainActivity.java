package es.adri.main;

import es.adri.database.WheisDBHelper;
import es.adri.sections.Historial;
import es.adri.sections.Registrar;
import es.adri.sections.WheIs;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Inicializamos la base de datos
        WheisDBHelper dbHelper = new WheisDBHelper(getBaseContext());
        dbHelper.getWritableDatabase();
    }
    
    
    /**
     * Este método nos llega a la pantalla de Wheis.
     * Esta pantalla nos indica dónde se encuentra nuestro
     * coche.
     * 
     * @param v
     */
    public void goWheis (View v) {
    	Intent i = new Intent();
    	i.setClass(MainActivity.this, WheIs.class);
    	startActivity(i);
    }
    
    /**
     * Este método nos llega a la pantalla de Historial
     * en la cuál estan registrados las últimas ubicaciones.
     * 
     * @param v
     */
    public void goHist (View v) {
    	Intent i = new Intent();
    	i.setClass(MainActivity.this, Historial.class);
    	startActivity(i);
    }
    
    /**
     * Este método nos llega a la pantalla de Registrar
     * en la cuaĺ grabaremos la posición en la que hemos
     * aparcado el coche.
     * 
     * @param v
     */
    public void goRegi (View v) {
    	Intent i = new Intent();
    	i.setClass(MainActivity.this, Registrar.class);
    	startActivity(i);
    }
   
}
