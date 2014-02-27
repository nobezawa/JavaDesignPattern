/**
 * FactoryMethod
 * 
 * インスタンスの生成をサブクラスに行わせることで、より柔軟に生成するインスタンスを選択することが可能
 */


/**
 * createCutPrint()の1行目において、まだどのクラスのインスタンスで生成することをまだ決めたくない。
 * そこで、createCuttable()をサブクラスでオーバーライドすればサブクラスで自由にインスタンスの
 * 型を決定できる。
 */

public abstract class CutPrint {
    
    protected abstract void draw(Cuttable hanzai);
    protected abstract void cut(Cuttable hanzai);
    protected abstract void print(Cuttable hanzai);
    protected Cuttable createCuttable(){
        return new Wood();
    }
    
    public void createCutPrint(){
        Cuttable hanzai = createCuttable();
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }

}
