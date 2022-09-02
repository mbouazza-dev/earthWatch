package utils;

import com.google.gson.Gson;
import model.Earthquake;

public class Serialize {

    public static String serialize(Earthquake e){
        return new Gson().toJson(e);
    }

}
