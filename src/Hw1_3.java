abstract class Animal {
    abstract String cry();
}
class Cat extends Animal {
    String cry() {
        return "야옹";
    }
}
class Dog extends Animal {
    String cry() {
        return "멍멍";
    }
}
class Caw extends Animal {
    String cry() {
        return "음머어어어어어";
    }
}
public class Hw1_3 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Caw(),
        };

        for (Animal x : animals)
            hear(x);
    }

    /* hear() accepts not only Animal type objects
       but also Animal’s subtype objects. (*/
    static void hear (Animal a) {
        System.out.println(a.cry());
    }
}
