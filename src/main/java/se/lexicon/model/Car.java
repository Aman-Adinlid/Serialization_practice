package se.lexicon.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Car implements Serializable {

    private UUID carId;
    private String regNum;
    private String brand;
    private String model;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate regDate;


    public Car() {
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Car(String regNum, String brand, String model, LocalDate regDate) {
        this.carId = UUID.randomUUID();
        this.regNum = regNum;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;


    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", regNum='" + regNum + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}
