package se.lexicon.util;

import java.io.*;
import java.util.List;

public class PlayerCharacter {

    public static <T> void serializeList(List<T> source, String filePath) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
        ) {
            out.writeObject(source);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
