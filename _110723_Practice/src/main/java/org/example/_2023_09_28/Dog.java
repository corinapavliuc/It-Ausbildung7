package org.example._2023_09_28;

//x = 5
public class Dog {
    private String name;
    public int age;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        String s;
        Dog d1 = new Dog();
        d1.age = 2;
        d1.setName("Tyson");

        System.out.println(d1);

        System.out.println(d1.age);
        System.out.println(d1.getName());
    }
}