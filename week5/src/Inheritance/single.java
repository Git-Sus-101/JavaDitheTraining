package Inheritance;

class Grandparent{
    int x = 30;
}

class Parent extends Grandparent{
    int a = 10;
}

class Child extends Parent{
    int b = 20;
}

public class single {
    static void main(String[] args){
        Child c = new Child();
        System.out.println(c.b);
        System.out.println(c.a);
        Parent p = new Parent();
        System.out.println(p.x);
    }

}
