package c.theprakhar.flexnest.room;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import c.theprakhar.flexnest.models.User;

@Database(entities = {User.class}, version = 1,exportSchema = false)
public abstract class roomdb extends RoomDatabase {
    public abstract dao roomDao();

    private static roomdb INSTANCE;


    public static roomdb getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (roomdb.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            roomdb.class, "postinfo_database")

                            .build();

                }
            }
        }
        return INSTANCE;
    }


}
