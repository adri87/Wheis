package es.adri.database;
 
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
 
public class WheisDBHelper extends SQLiteOpenHelper {
 
   private static int version = 1;
   private static String name = "HipotecaDb" ;
   private static CursorFactory factory = null;
 
   public WheisDBHelper(Context context)
   {
      super(context, name, factory, version);
   }
 
   @Override
   public void onCreate(SQLiteDatabase db)
   {
	   Log.i(this.getClass().toString(), "Creando base de datos");
	   
	   db.execSQL( "CREATE TABLE TBDATOS(" +
	          " id INTEGER PRIMARY KEY AUTOINCREMENT," +
	          " ubTexto TEXT " +
	          " )" );
	 
	   Log.i(this.getClass().toString(), "Tabla creada");
	   
	   db.execSQL("INSERT INTO TBDATOS(id, ubTexto) VALUES(1,'No hay nigún registro')");

   }
 
   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
   {
 
   }
}