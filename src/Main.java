public class Main {
    public static void main(String args[]) {
        for (int i = 0; i < 4; i++) {
            MyRunnable R = new MyRunnable("Thread " + i);

            R.start();
        }
    }
}
