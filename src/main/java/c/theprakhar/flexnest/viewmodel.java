package c.theprakhar.flexnest;

import android.app.Application;


import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import c.theprakhar.flexnest.models.User;
import c.theprakhar.flexnest.repos.repo;
import c.theprakhar.flexnest.repos.repoRoom;

public class viewmodel extends AndroidViewModel {

    repo retrorepo;
    repoRoom dbrepo;
    private LiveData<List<User>> mAllUsers;
    private final LiveData<List<User>>  retroObservable;

    public viewmodel(@NonNull Application application) {
        super(application);
        retrorepo = new repo(application);
        dbrepo = new repoRoom(application);
        retroObservable=retrorepo.userRetro();
        mAllUsers = dbrepo.getAllUsers();


    }

    public LiveData<List<User>> getAllUsers() {
        return mAllUsers;
    }


}
