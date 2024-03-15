public class MyRunnable implements Runnable {

    private Thread MyThread;
    private String threadName;

    MyRunnable( String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        LazyInitializedSingleton Instance = LazyInitializedSingleton.getInstance();
        System.out.println(Instance);
    }

    public void start () {
        System.out.println("Starting " + threadName );
        if (MyThread == null) {
            MyThread = new Thread (this, threadName );
            MyThread.start ();
        }
    }
}
