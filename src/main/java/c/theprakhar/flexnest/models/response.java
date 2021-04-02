package c.theprakhar.flexnest.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class response {
    @SerializedName("page")
    public int page;
    @SerializedName("per_page")
    public int per_page;
    @SerializedName("total")
    public int total;
    @SerializedName("total_pages")
    public int total_pages;
    @SerializedName("data")
    public List<User> data;
    @SerializedName("support")
    public Support support;

    public int getPage() {
        return page;
    }


    public List<User> getData() {
        return data;
    }


}
