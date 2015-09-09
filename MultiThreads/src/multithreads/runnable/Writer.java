package multithreads.runnable;

/**
 *
 * @author Leg
 */
public class Writer implements Runnable{

    private String text;
    private int nb;
    private long waitTime;
    
    public Writer(String text, int nb, long waitTime){
        this.text = text;
        this.nb = nb;
        this.waitTime = waitTime;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < nb; ++i){
            System.out.println(text);
            try {
                Thread.sleep(waitTime); //est une méthode static
            } catch (InterruptedException ex) {}
        }
    }

    void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
    
}
