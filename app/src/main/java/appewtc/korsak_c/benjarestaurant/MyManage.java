package appewtc.korsak_c.benjarestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by korsak_c on 2/29/2016.
 */
public class MyManage {
    //Explicite
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;


    public MyManage(Context context) {
        //Create Database
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }   // Constructor
}   // Main Class
