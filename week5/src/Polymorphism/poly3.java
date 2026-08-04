package Polymorphism;

class parent{
    int x = 10;
    void display(){
        System.out.println("from parent class");
    }
}

class child1 extends parent{
    void print(){
        System.out.println(super.x);
        super.display();
    }
}
public class poly3 {
    static void main(String[] args) {
        child1 c  = new child1();
        c.print();

    }
}
