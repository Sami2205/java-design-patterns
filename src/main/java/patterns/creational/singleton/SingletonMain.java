package patterns.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton);
        if (singleton == anotherSingleton) {
            System.out.println("Singleton pattern is working!");
        }

        ThreadsafeSingleton threadsafeSingleton = ThreadsafeSingleton.getInstance();
        System.out.println(threadsafeSingleton);
        ThreadsafeSingleton anotherThreadsafeSingleton = ThreadsafeSingleton.getInstance();
        System.out.println(anotherThreadsafeSingleton);
        if (threadsafeSingleton == anotherThreadsafeSingleton) {
            System.out.println("Threadsafe singleton pattern is working!");
        }
    }

}
