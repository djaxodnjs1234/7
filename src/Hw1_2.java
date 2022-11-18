public class Hw1_2 {
    public static void main(String[] args){
        Human h1 = new Human();
        h1.eat();
        h1.think();

        IAnimal h2 = new Human();
        h2.eat();
        //h2.think();
    }
}
interface IAnimal {
    void eat();
}
class Human implements IAnimal {
    public void eat() {
        System.out.println("수저 사용하여 먹음");
    }
    public void think() {
        System.out.println("생각할 수 있음");
    }
}
