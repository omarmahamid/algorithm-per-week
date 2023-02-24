package algorithm.every.week.foocuncurrency;

public class FooMain{

    public static void main(String[] args) throws InterruptedException {

        Foo foo = new Foo();

        Thread printFirst = new Thread(() -> System.out.println("Hello from first"));

        Thread printSecond = new Thread(() -> System.out.println("Hello from second"));

        Thread printThird = new Thread(() -> System.out.println("Hello from third"));

        foo.first(printFirst);
        foo.second(printSecond);
        foo.third(printThird);

    }
}
