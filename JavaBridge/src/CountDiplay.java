/**
 * Created by nobesawa on 15/12/06.
 */
public class CountDiplay extends Display {
    public CountDiplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
