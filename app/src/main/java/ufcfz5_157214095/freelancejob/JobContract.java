package ufcfz5_157214095.freelancejob;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by X on 1/11/2015.
 */
public class JobContract {

    public static abstract class JobDbEntry implements BaseColumns{
        public static final String TABLE_NAME = "JOB";
        public static final String COLUMN_NAME_TITLE = "TITLE";
        public static final String COLUMN_NAME_CONTENT = "CONTENT";
        public static final String COLUMN_NAME_TIME = "TIME";
        public static final String COLUMN_NAME_ADDRESS = "ADDRESS";
        public static final String COLUMN_NAME_SMS = "SMS";
        public static final String COLUMN_NAME_EMAIL = "EMAIL";
    }



}
