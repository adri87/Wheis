package es.adri.subsections;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import es.adri.database.WheisDBHelper;
import es.adri.main.R;

public class Apuntar extends Activity{
	
	private SQLiteDatabase db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.apuntar);
		
		// Accedemos a base de datos
		WheisDBHelper dbHelper = new WheisDBHelper(getBaseContext());
		db = dbHelper.getWritableDatabase();
	}
	
	public void guardarTexto (View v){
		String contenido = ((EditText) findViewById(R.id.apuntarUbicacion)).getText().toString();
		String sqlInsert = "INSERT INTO TBDATOS (ubTexto) VALUES ('"+contenido+"');";
		db.execSQL(sqlInsert);
		
		onDestroy();
		
		Toast.makeText(this, "Se ha guardado tu ubicación correctamente", Toast.LENGTH_LONG).show();
	}

}
