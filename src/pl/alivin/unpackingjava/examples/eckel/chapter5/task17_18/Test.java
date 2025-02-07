package pl.alivin.unpackingjava.examples.eckel.chapter5.task17_18;

class Test {
    Test(String s) {
        System.out.println(s);
    }
}

class Main {
    public static void main(String[] args) {
        Test[] test = {new Test("String 1"), new Test("String 2"), new Test("String 3")};
    }

}

