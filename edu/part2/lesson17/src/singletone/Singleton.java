package singletone;

class Singleton {

    public static int counter = 0;

    private static Singleton instance;

    private Singleton(){
        counter++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}