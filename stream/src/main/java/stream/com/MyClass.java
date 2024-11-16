package stream.com;

public class MyClass {
    static int count = 10;

    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
        MyClass myClass = new MyClass();
        myClass.displayCountInstance();
    }
     void displayCountInstance() {
        System.out.println("Count: from instatce " + count);
    }
}
