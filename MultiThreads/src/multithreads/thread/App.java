package multithreads.thread;

/**
 *
 * @author Leg
 */
public class App {

    /**
     * Le programme comporte 4 threads, le main en est un. (Thread principal)
     * Si on appelait directement la méthode run(), la méthode run() de chaque thread serait exécutée entièrement. 
     * La méthode start ne peut être appelée qu'une seule fois.
     * Si on n'utilise pas le sleep() dans le code, le comportement va dépendre de l'environnement.
     */

    public static void main(String[] args) {
       
        Writer write1 = new Writer("write1", 5, 2000);
        Writer write2 = new Writer("write2", 3, 2000);
        Writer write3 = new Writer("write3", 2, 2000);
 
        write1.start();
        write2.start();
        write3.start();

    }
    
}
