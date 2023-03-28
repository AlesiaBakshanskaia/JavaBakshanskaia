package lesson6;

//import lombok.Getter;
//import lombok.Setter;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

//@Getter
//@Setter
public class Cat {
   /* 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.*/

    String pedigree; // порода
    private String name; // кличка
    int age;
    double weight;
    String[] vaccination; // прививки
    Map<String, String> ownerPhone; // Владелец:Телефон

    public Cat(String pedigree, String name, int age, double weight) {
        this.pedigree = pedigree;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "pedigree='" + pedigree + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", vaccination=" + Arrays.toString(vaccination) +
                ", ownerPhone=" + ownerPhone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(pedigree, cat.pedigree) && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedigree, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
