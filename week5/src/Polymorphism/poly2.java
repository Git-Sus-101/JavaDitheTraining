package Polymorphism;

//method overriding

class Parent{
    void display(){
        System.out.println("from parent class");
    }
}
class child extends Parent{
    void display(){
        System.out.println("from child class");
    }
}


public class poly2 {
    static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        child c = new child();
        c.display();;
    }
}
