package c.theprakhar.flexnest.retro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class client {
    public static final String base_url="https://reqres.in/api/";
    public static Retrofit retrofit=null;
    public static Retrofit getClient()
    {
        retrofit=new Retrofit.Builder().baseUrl(base_url).addConverterFactory(GsonConverterFactory.create()).build();

        return retrofit;
    }
}
