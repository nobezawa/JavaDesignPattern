/**
 * Created by nobesawa on 15/12/06.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entryes ...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 1000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();
        } catch (FileTreatementExeption e) {
            e.printStackTrace();
        }
    }
}
