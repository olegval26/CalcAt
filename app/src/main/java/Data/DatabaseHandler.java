package Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.List;

import Model.Resistor;
import Utils.Util;

public class DatabaseHandler extends SQLiteOpenHelper {

    public DatabaseHandler(Context context) {
        super(context, Util.DATABASE_NAME, null, Util.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_RESISTOR_TABLE = "CREATE TABLE " + Util.TABLE_NAME + " ("
                + Util.KEY_ID + " INTEGER PRIMARY KEY, "
                + Util.KEY_VALUE + " REAL )" ;

        sqLiteDatabase.execSQL(CREATE_RESISTOR_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Util.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    public void addRes (Resistor resistor){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Util.KEY_VALUE, resistor.getValue());


        db.insert(Util.TABLE_NAME, null,contentValues);
        db.close();
    }
    public Resistor getRes(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(Util.TABLE_NAME, new String[] {Util.KEY_ID, Util.KEY_VALUE},
                Util.KEY_ID + "=?", new String[]{String.valueOf(id)}, null,null,null,null);
        if (cursor != null){
            cursor.moveToFirst();
        }
        Resistor resistor = new Resistor(Integer.parseInt(cursor.getString(0)),
                Double.parseDouble(cursor.getString(1)));
        return resistor;
    }
    public List<Resistor> getAllRes () {

        SQLiteDatabase db = this.getReadableDatabase();
        List<Resistor> resList = new ArrayList<>();
        String selectAllRes = "Select * from " + Util.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAllRes, null);
        if (cursor.moveToFirst()){

            do {
                Resistor resistor = new Resistor();
                resistor.setId(Integer.parseInt( cursor.getString(0)));
                resistor.setValue(Double.parseDouble(cursor.getString(1)));


                resList.add(resistor);
            } while(cursor.moveToNext());
        }
        return resList;
    }
    public int updateRes (Resistor resistor) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Util.KEY_VALUE, resistor.getValue());


        return db.update(Util.TABLE_NAME, contentValues, Util.KEY_ID + "=?", new String[]{String.valueOf(resistor.getId())});
    }

    public void deleteRes (Resistor resistor){
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(Util.TABLE_NAME, Util.KEY_ID + "=?", new String[]{String.valueOf(resistor.getId())});
        db.close();
    }

}
