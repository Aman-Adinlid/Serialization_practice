package se.lexicon.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class PlayerCharacter {

    public List<PlayerCharacter> serialize (List <PlayerCharacter> source, String filePath){
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
        ){
            out.writeObject(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return source;
    }
}
