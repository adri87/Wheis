package es.adri.sections;

import es.adri.database.WheisDBHelper;
import es.adri.main.R;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class WheIs extends Activity{
	
	private SQLiteDatabase db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wheis);
		
		WheisDBHelper dbHelper = new WheisDBHelper(getBaseContext());
		db = dbHelper.getWritableDatabase();
		
		// Mostramos información de ubicación si hay alguna
		TextView ubicacionEscrita = (TextView) findViewById(R.id.wheisTexto);
		String sqlSelect = "SELECT ubTexto FROM TBDATOS ORDER BY id DESC";
		Cursor c = db.rawQuery(sqlSelect, null);
		if (c.moveToFirst())
			ubicacionEscrita.setText(c.getString(0));
		
	}

}
