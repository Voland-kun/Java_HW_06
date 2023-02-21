package hw06;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop {
    private String modelName;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;

    public Laptop(String modelName, Integer ram, Integer hdd, String os, String color) {
        this.modelName = modelName;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public void printInfo() {
        System.out.printf("%s \t %s  \t %s \t %s  \t %s \n", modelName, ram, hdd, os, color);
    }
}