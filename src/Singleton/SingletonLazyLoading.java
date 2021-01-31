package Singleton;

public class SingletonLazyLoading {

    //Field hält Referenz auf einzigartige Instan
    private static SingletonLazyLoading instance;

    // Privater Konstruktur verhindert Instanziierung durch Client
    public SingletonLazyLoading() {
    }

    public static SingletonLazyLoading getInstance() {
        if (instance == null){
            instance = new SingletonLazyLoading();
        }
        return instance;
    }
}
