package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        MyInfo myInfo = new MyInfo("Victor","Glushakov");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(myInfo));
    }
}