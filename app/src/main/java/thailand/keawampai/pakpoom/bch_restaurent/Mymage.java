package thailand.keawampai.pakpoom.bch_restaurent;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by PAKPOOM_K on 29/2/2559.
 */
public class Mymage {
    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqleDatabase,readSqleDatabase;


    public Mymage(Context context ) {
        //create Database
        myOpenHelper = new MyOpenHelper(context);
        writeSqleDatabase = myOpenHelper.getWritableDatabase();
        readSqleDatabase = myOpenHelper.getReadableDatabase();
    }//Constructor
}//Main Class
