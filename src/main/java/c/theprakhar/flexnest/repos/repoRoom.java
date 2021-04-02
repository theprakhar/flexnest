package c.theprakhar.flexnest.repos;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;
import c.theprakhar.flexnest.models.User;
import c.theprakhar.flexnest.room.dao;
import c.theprakhar.flexnest.room.roomdb;

public class repoRoom {
    private dao roomdao;
    LiveData<List<User>> mAllUsers;

    public repoRoom(Application application){
        roomdb db = roomdb.getDatabase(application);
        roomdao = db.roomDao();
        mAllUsers = roomdao.getAllUsers();
    }

    public LiveData<List<User>> getAllUsers() {
        return mAllUsers;
    }
    public void insertUsers (List<User> userModel) {
        new insertAsyncTask(roomdao).execute(userModel);
    }

    private static class insertAsyncTask extends AsyncTask<List<User>, Void, Void> {

        private dao mAsyncTaskDao;

        insertAsyncTask(dao roomdao) {
            mAsyncTaskDao = roomdao;
        }

        @Override
        protected Void doInBackground(final List<User>... params) {
            mAsyncTaskDao.insertUsers(params[0]);
            return null;
        }
    }
}
