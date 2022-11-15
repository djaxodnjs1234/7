class Parent {
    static void who() { System.out.println("Parent’s static who"); }
    void show() { System.out.println("Parent’s instance show\n");}
}
class Child extends Parent {
    static void who() { System.out.println("Child’s static who"); }    // 숨김
    void show() { System.out.println("Child’s instance show\n"); }     // 재정의
}

public class Hw1_1 { // Dynamic binding
    public static void main(String[] args) {
        System.out.println("Child c = new Child: ");
        Child c = new Child(); c.who(); c.show();

        System.out.println("Parent p = new Child: ");
        Parent p = new Child(); p.who(); p.show();

        System.out.println("Child c2 = new Child - (Parent)c2:  ");

        Child c2 = new Child(); ((Parent)c2).who(); ((Parent)c2).show();
        // 선언타입은 static 실제타입은 instance
    }
}