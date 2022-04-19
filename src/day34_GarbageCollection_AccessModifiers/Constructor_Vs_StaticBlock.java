package day34_GarbageCollection_AccessModifiers;

public class Constructor_Vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }

    public Constructor_Vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Constructor_Vs_StaticBlock(); //1
        new Constructor_Vs_StaticBlock(); //2
        new Constructor_Vs_StaticBlock(); //3
        new Constructor_Vs_StaticBlock(); //4
        new Constructor_Vs_StaticBlock(); //5

    }


}