/**
 * Created by nobesawa on 2015/12/19.
 */
public class GraphObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.print("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
