package singleton;

public class Singleton {

    private volatile static Singleton singletonInstance = null;
    private Singleton(){
        System.out.println("Singleton instance retrieved!");
    }

    /*
    This way of initialization is called double-checked locking
     */
    public static Singleton getInstance(){
        if(singletonInstance == null){
            synchronized(Singleton.class){
                singletonInstance =  new Singleton();
            }
        }
        return singletonInstance;
    }
}
