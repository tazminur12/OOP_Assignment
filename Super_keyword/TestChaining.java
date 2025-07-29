package Super_keyword;

public class TestChaining {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Object created: " + obj);
    }
}

class A {
    public A() {
        System.out.println("A's constructor is called");
    }
}

class B extends A {
    public B() {
        // compiler automatically adds: super();
        System.out.println("B's constructor is called");
    }
}
