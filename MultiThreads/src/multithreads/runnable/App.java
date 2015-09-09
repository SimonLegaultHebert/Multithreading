package multithreads.runnable;

/**
 *
 * @author Leg
 */
public class App {

   public static void main(String[] args) {
       
        Writer write1 = new Writer("write1", 5, 2000);
        Writer write2 = new Writer("write2", 3, 2000);
        Writer write3 = new Writer("write3", 2, 2000);
 
        write1.start();
        write2.start();
        write3.start();

    }
    
}
