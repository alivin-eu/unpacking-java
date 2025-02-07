package pl.alivin.unpackingjava.examples.eckel.chapter5.task2;

class Test {
    String string = "Test string";
    String s;

    Test(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        Test t = new Test("String with constructor");
        System.out.println(t.string);
        System.out.println(t.s);
    }

}
