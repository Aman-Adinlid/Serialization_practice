package se.lexicon;

import se.lexicon.model.AppUser;
import se.lexicon.model.Car;
import se.lexicon.util.JsonIOUtil;
import se.lexicon.util.SerializeUtil;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {
        /* AppUser appUser = new AppUser(2,"test","test","123abc");
        SerializeUtil.serializeAppUser(appUser);
        System.out.println("_______________________");
        AppUser result = SerializeUtil.deserializableAppUser("appUser.ser");
        System.out.println("UserId:  " +result.getUserId());
        System.out.println("Name:  " +result.getName());
        System.out.println("Email:  " + result.getEmail());
        System.out.println("PassWord:  " +result.getPassword());
        SerializeUtil.serialize(new Car());
        SerializeUtil.serialize(appUser);

         */

        JsonIOUtil util = new JsonIOUtil();
        ArrayList<Car> cars = new ArrayList<>();
        Car volvo = new Car("zxc12", "VOLVO", "XS12", LocalDate.parse("2019-02-27"));
        Car Audi = new Car("jha", "Audi", "x55", LocalDate.parse("2021-01-23"));
        cars.add(volvo);
        cars.add(Audi);

        File myCarFile = new File("cars.json");
        util.serializeCarListToJson(cars, myCarFile);

        List<Car> result = util.deserializeJsonListToCar(myCarFile);
        System.out.println(result.toString());
        System.out.println(result.get(0));
        System.out.println(result.get(1));
        System.out.println("-----------------------------------------");
        System.out.println(util.deserializeJsonToCar(new File("car.json")));
    }


}

