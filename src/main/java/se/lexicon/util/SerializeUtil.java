package se.lexicon.util;

import se.lexicon.model.AppUser;

import java.io.*;

public class SerializeUtil {


    public static void serializeAppUser(AppUser appUser) {

        String fileName = "appUser.ser";
        try (
                FileOutputStream stream = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(stream);
        ) {
            out.writeObject(appUser);
            System.out.println("Operation is done: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static AppUser deserializableAppUser(String fileName) {
        AppUser result = null;

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        ) {
            result = (AppUser) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;

    }

    // using generic
    public static <T> void serialize(T t) {
        String fileName = t.getClass().getName() + ".ser";

        try (
                FileOutputStream stream = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(stream);
        ) {
            out.writeObject(t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T deserialize(String fileName) {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        ) {
            return (T) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}




