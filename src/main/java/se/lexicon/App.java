package se.lexicon;

import se.lexicon.model.AppUser;
import se.lexicon.model.Car;
import se.lexicon.util.SerializeUtil;

public class App {


    public static void main(String[] args) {
        AppUser appUser = new AppUser(2,"test","test","123abc");
        SerializeUtil.serializeAppUser(appUser);
        System.out.println("_______________________");
        AppUser result = SerializeUtil.deserializableAppUser("appUser.ser");
        System.out.println("UserId:  " +result.getUserId());
        System.out.println("Name:  " +result.getName());
        System.out.println("Email:  " + result.getEmail());
        System.out.println("PassWord:  " +result.getPassword());
        SerializeUtil.serialize(new Car());
        SerializeUtil.serialize(appUser);
    }


    }

