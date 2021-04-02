package c.theprakhar.flexnest.repos;

import android.app.Application;
import android.util.Log;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import c.theprakhar.flexnest.models.User;
import c.theprakhar.flexnest.models.response;
import c.theprakhar.flexnest.retro.api_interface;
import c.theprakhar.flexnest.retro.client;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class repo {
    Application application;

    public repo(Application application) {
        this.application = application;
    }

    public LiveData<List<User>> userRetro() {

        final MutableLiveData<List<User>> data = new MutableLiveData<>();
        final api_interface service = client.getClient().create(api_interface.class);
        Call<response> call = service.getUsers(1);
        call.enqueue(new Callback<response>() {
            @Override
            public void onResponse(Call<response> call, Response<response> response) {
                if (response.body() != null && response.body().getPage() == 1) {
                    List<User> userList = response.body().getData();
                    repoRoom dbrepo = new repoRoom(application);
                    dbrepo.insertUsers(userList);
                    data.setValue(userList);


                }
            }

            @Override
            public void onFailure(Call<response> call, Throwable t) {
                Log.e("out", t.toString());
            }
        });

        return data;
    }

}