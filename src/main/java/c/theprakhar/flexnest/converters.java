package c.theprakhar.flexnest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import androidx.room.TypeConverter;
import c.theprakhar.flexnest.models.Support;

public class converters {
    @TypeConverter
    public String fromSupport(Support support) {
        if (support == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Support>() {}.getType();
        return gson.toJson(support, type);
    }

    @TypeConverter
    public Support toSupport(String supportStr) {
        if (supportStr == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Support>() {}.getType();
        return gson.fromJson(supportStr, type);
    }
}