package day37_Inheritance.animalTask;

public class Parrots extends Animal{

    public String parrotWingColor; // bunu eklemek istersek asagidaki constructor icerisine. Then we should follow the steps below.

    public Parrots(String name, String breed, char gender, int age, String size, String color, String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor=parrotWingColor;



    }

    public void sing(){
        System.out.println(name+" is singing");

    }







}
