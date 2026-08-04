package interfaces;

interface nsam {
    void cs_dept();
    void com_dept();
    void math_dept();
    void languages();

}

class Student implements nsam {

    @Override
    public void cs_dept() {
        System.out.println("Student from CS Dept");
    }

    @Override
    public void com_dept() {
        System.out.println("Student from COM Dept");
    }

    @Override
    public void math_dept() {
        System.out.println("Student from Math Dept");
    }

    @Override
    public void languages() {
        System.out.println("Student from Language Dept");
    }
}

public class sample1 {
   public static void main(String[] args) {

       Student s = new Student();
       s.cs_dept();
       s.com_dept();
       s.math_dept();
       s.languages();

    }
}
