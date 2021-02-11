package patterns.creational.singleton;

public class ThreadsafeSingleton {

    private static volatile ThreadsafeSingleton instance = null;

    private ThreadsafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static ThreadsafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadsafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadsafeSingleton();
                }
            }
        }
        return instance;
    }

}
