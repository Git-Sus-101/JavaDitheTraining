package Abstraction;

abstract class Nsam{
    abstract void cs_dept();
    void com_dept(){
        System.out.println("Student from COM DEPT");
    }
}

class Students extends Nsam{

    @Override
    void cs_dept() {
        System.out.println("Student from CS DEPT");
    }
}

public class abstractsample {
    public static void main(String[] args){
        Students s = new Students();
        s.cs_dept();
        s.com_dept();
    }
}




