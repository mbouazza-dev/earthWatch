package utils;

import com.google.gson.Gson;
import model.Earthquake;

public class Deserialize {

    public static Earthquake deserialize(String json){
        return new Gson().fromJson(json, Earthquake.class);
    }
}
