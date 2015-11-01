package ufcfz5_157214095.freelancejob;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

/**
 * Created by X on 1/11/2015.
 */
public class JobDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + JobContract.JobDbEntry.TABLE_NAME + " (" +
                    JobContract.JobDbEntry._ID + " INTEGER PRIMARY KEY, " +
                    JobContract.JobDbEntry.COLUMN_NAME_TITLE + " TEXT,"+
                    JobContract.JobDbEntry.COLUMN_NAME_CONTENT + " TEXT,"+
                    JobContract.JobDbEntry.COLUMN_NAME_TIME + " TEXT,"+
                    JobContract.JobDbEntry.COLUMN_NAME_ADDRESS + " TEXT,"+
                    JobContract.JobDbEntry.COLUMN_NAME_SMS + " TEXT,"+
                    JobContract.JobDbEntry.COLUMN_NAME_EMAIL + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + JobContract.JobDbEntry.TABLE_NAME;



    public JobDbHelper(Context context) {
        super(context, JobContract.JobDbEntry.TABLE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public boolean insert(Job job) throws SQLException
    {
        return false;
    }
    public boolean update(Job job) throws SQLException
    {
        return false;
    }
    public boolean delete(Job job) throws SQLException
    {
        return delete(-1);
    }
    public boolean delete(int id) throws SQLException
    {
        return false;
    }
}
