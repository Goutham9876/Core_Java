package Abstraction.constructor;

import java.sql.SQLOutput;

public class Son extends Father {

    String name;

    public Son(String name, String fatherProperty){
        super(fatherProperty);
        this.name = name;

    }
    public Son(String name){
        super("Land");
        this.name = name;

    }

    public static void main(String[] args) {
        Son son = new Son("older");
        System.out.println(son.fatherProperty);
        System.out.println(son.name);

        son = new Son("younger","Gold");
        System.out.println(son.name);
        System.out.println(son.fatherProperty);
    }

}
