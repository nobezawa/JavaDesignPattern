/**
 * Strategy「戦略」
 * 
 * ifなどの分岐をClassに置き換えることで柔軟にさせる。
 * Classを比較にしたい対象でインスタンスすることで同じような、比較をClass単位でできる。
 * 
 */



public class SampleClass {
    
    private Comparator comparator = null;
    
    public SampleClass(Comparator comparator){
        this.comparator = comparator;
    }
    
    
    public int compare(Human h1, Human h2){
        return comparator.compare(h1, h2);
    }

}
