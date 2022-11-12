public class ThreadManager {
    public static void runThread(ThreadedObject object){
        Thread thread = new Thread(object::run);
        thread.start();
    }
}
