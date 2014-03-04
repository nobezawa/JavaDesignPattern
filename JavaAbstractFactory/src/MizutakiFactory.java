import java.util.List;


public class MizutakiFactory extends Factory{

    @Override
    public Soup getSoup() {
        return new ChickenBonesSoup();
    }

    @Override
    public Protein getProtein() {
        return new Chiken();
    }

    @Override
    public List getVegetables() {
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new Renkon());
        vegetables.add(new Ninjin());
        return vegetables;
    }
    
    @Override
    public List getOtherlngredients() {
        List<Ingredients> otherlngredients = new ArrayList<Ingredients>();
        otherlngredients.add(new Tofu());
        return otherlngredients;
    }

}
