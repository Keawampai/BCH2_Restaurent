package thailand.keawampai.pakpoom.bch_restaurent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.StaticLayout;


/**
 * Created by PAKPOOM_K on 29/2/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{
    //Explipit
    public static final String database_name = "BCH.db";
    private static final int database_version = 1;
    private static final String create_table_user = "create table userTABLE ("+"_id integer primary key,"+
            "User text,"+
            "Password text,"+
            "Name text);";
    private static final String create_table_food = "create table foodTABLE (" +
            "_id integer primary key," +
            "Food text," +
            "Price text," +
            "Source text);";

    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);

    }//Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_table_food);
        sqLiteDatabase.execSQL(create_table_user);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//Main Class
