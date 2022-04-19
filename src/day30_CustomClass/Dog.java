package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }


    //only the fist dog is eating
    public void eat(){ // we dont need to return anything at the moment, thats why we gave VOID
        System.out.println(name+ " is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Attributes:
    name ,age, gender, breed, size, color



Actions:

        eat(), play(), bark() ...



 */