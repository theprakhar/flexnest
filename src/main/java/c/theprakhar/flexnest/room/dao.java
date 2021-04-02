package c.theprakhar.flexnest.room;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import c.theprakhar.flexnest.models.User;

@Dao
public interface dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User userModel);

    @Query("SELECT * from users")
    LiveData<List<User>> getAllUsers();

    @Query("DELETE FROM users")
    void deleteAll();


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUsers(List<User> usersModel);
}
