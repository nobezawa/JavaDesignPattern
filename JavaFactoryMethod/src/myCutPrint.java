
public class myCutPrint extends CutPrint{

    @Override
    protected void draw(Cuttable hanzai) {
        System.out.println("絵を描く");
        
    }

    @Override
    protected void cut(Cuttable hanzai) {
        System.out.println("ナイフで加工");
        
    }

    @Override
    protected void print(Cuttable hanzai) {
        System.out.println("プリントする");
        
    }
    
    protected Cuttable createCuttable(){
        return new Potato();
    }

}
