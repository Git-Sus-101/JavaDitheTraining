package strings;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        //strings - 2 types
        //Mutable - values cn be changed further
        //Immutable - once initalized cannot be changed
        //Mutable strings - StringBuilder, StringBuffer
        StringBuffer s1 = new StringBuffer("BatchB2");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("BatchB3");
        System.out.println(s2);

        //insert(), replace(), delete(), reverse()
        s2.append("NSAM");
        System.out.println(s2);

        s2.insert(2, "ABCD");
        System.out.println(s2);

        s2.replace(3, 6, "XYZ");
        System.out.println(s2);

        s2.delete(1,5);
        System.out.println(s2);

        s2.reverse();
        System.out.println(s2);

        //Immutable strings --- 2 ways to create
        //1. Typer-1 Declaration
        String s3 = "Java";
        //2. Type-2 Declaration
        String s = new String("Java");

        String x = "Java";
        String y = "Java";
        System.out.println(x==y); //true

        String p = new String("Java");
        String q = new String("Java");
        System.out.println(p==q); //false

        //string
        // 1. constant pool dublicate allowed
        // 2. non-constant pool no dublicates allowed

        String z = "RajaRamMohanRoy";
        System.out.println(z.charAt(5));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf('R'));
        System.out.println(z.lastIndexOf('R'));
        String a = "nsam";
        String b = "nsam";
        System.out.println(a.equalsIgnoreCase(b));
        char arr[] = z.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}