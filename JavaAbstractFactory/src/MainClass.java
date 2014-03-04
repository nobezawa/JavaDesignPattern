/**
 * AbstractFactory
 * 
 * 元となるオブジェクト(今回はFactoryClass)を生成して、さまざまなオブジェクト生成できる。
 * また、FactoryClassを変更することで、継承したオブジェクトを一気に変更することも可能。
 * 
 */



public class MainClass {
    
    public static void main(String args[]){
        HotPot hotPot = new HotPot(new Pot());
        Factory factory = new MizutakiFactory();
        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getProtein());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addOtherlngredients(factory.getOtherlngredients());
    }

}
