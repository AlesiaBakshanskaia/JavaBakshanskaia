package lesson6;

import java.util.TreeMap;


public class Task02 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Русская Голубая","Барсик", 5, 3.5);
        cat1.pedigree = "Русская Голубая";
//        cat1.name = "Барсик";
//        cat1.setName("Барсик");
//        cat1.age = 5;
//        cat1.weight = 3.5;
        cat1.vaccination = new String[]{"бешенство", "чумка"};
        cat1.ownerPhone = new TreeMap<>();
        cat1.ownerPhone.put("Петров", "123");

        Cat cat2 = new Cat("Норвежский мейнкун", "Барс", 6, 5);
//        cat2.pedigree = "Норвежский мейнкун";
//        cat2.name = "Барс";
//        cat2.setName("Барс");
//        cat2.age = 6;
//        cat2.weight = 5;
        cat2.vaccination = new String[] {"бешенство"};
        cat2.ownerPhone = new TreeMap<>();
        cat2.ownerPhone.put("Иванов", "456");

        Cat cat3 = new Cat("Русская Голубая","Барсик", 11, 7);
//        cat3.pedigree = "Сиамский";
//        cat3.name = "Верес";
//        cat3.setName("Верес");
//        cat3.age = 11;
//        cat3.weight = 7;
        cat3.vaccination = new String[] {};
        cat3.ownerPhone = new TreeMap<>();
        cat3.ownerPhone.put("Сидорова", "789");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
//        System.out.println(cat3.getWeight());
        System.out.println(cat1.equals(cat3));
    }
}
