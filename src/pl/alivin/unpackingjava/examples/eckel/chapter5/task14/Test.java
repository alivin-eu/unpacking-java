package pl.alivin.unpackingjava.examples.eckel.chapter5.task14;

public class Test {
    static String str = new String("This is a static class field");

    static {
        System.out.println("This is a static block");
        String str = new String("This is a field from a static block");
        System.out.println(str);
    }

    static void display() {
        System.out.println("This is a static method");
        System.out.println("The value of str field: " + str);
    }
}

class Main {
    public static void main(String[] args) {
        Test.display();
    }
}


