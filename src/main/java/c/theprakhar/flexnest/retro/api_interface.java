package c.theprakhar.flexnest.retro;

import c.theprakhar.flexnest.models.response;
import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface api_interface {
    @GET("users")
    Call<response> getUsers(@Query("page")int page);

}
