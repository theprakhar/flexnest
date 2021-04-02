package c.theprakhar.flexnest.models;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import c.theprakhar.flexnest.converters;


@TypeConverters({converters.class})
@Entity(tableName = "users")
public class User {
    @NonNull
    @PrimaryKey
    @SerializedName("id")
    public int id;
    @SerializedName("email")
    public String email;
    @SerializedName("first_name")
    public String first_name;
    @SerializedName("last_name")
    public String last_name;

    @SerializedName("avatar")
    public String avatar;

    @BindingAdapter({"avatar"})
    public static void loadImage(ImageView imageView, String imagepath){
        Glide.with(imageView.getContext()).load(imagepath).diskCacheStrategy(DiskCacheStrategy.DATA)
                .into(imageView);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
