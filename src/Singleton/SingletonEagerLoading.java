package Singleton;

public class SingletonEagerLoading {
    private static final SingletonEagerLoading instance = new SingletonEagerLoading();

    public SingletonEagerLoading() {
    }

    public static SingletonEagerLoading getInstance() {
        return instance;
    }
}
