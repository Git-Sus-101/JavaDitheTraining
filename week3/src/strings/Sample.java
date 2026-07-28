package strings;

public class Sample {
    int a;
    int b;
    Sample(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("First Constructor:"+a+" "+b);
    }
    Sample(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Second Constructor:"+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        Sample s = new Sample(10,20);
        Sample s1 = new Sample(10,20,30);
    }
}
