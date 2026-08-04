package Inheritance;

class nitte{
    void display(){
        System.out.println("Student from Nitte Institute");
    }
}

class nsam extends nitte {
    void nsam_details(){
        System.out.println("NSAM CLG");
    }
}

//child
class nmamit extends nitte{
    void nmamit_details(){
        System.out.println("NMAMIT CLG");
    }
}

public class hierarchical{
    static void main() {
        nsam n1 = new nsam();
        n1.nsam_details();
        n1.display();
        nmamit n2 = new nmamit();
        n2.nmamit_details();
        n2.display();
    }
}
