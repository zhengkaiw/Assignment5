/**
 * Created by zhengkevin on 2/19/17.
 */


public class IceCream extends DessertItem{

    private int costs;
    DessertShoppe ds = new DessertShoppe();

    public void setCosts(int costs){
        this.costs = costs;
    }

    public IceCream(String name, int costs) {

        setName(name);
        setCosts(costs);

    }

    public IceCream(){}

    public int getCost(){
        return costs;
    }

    public String toString(){
        String tostring = "";

        tostring += getName();
        for (int i = 0; i < (ds.MAX_LINE - getName().length() - ds.centsToDollarsAndCents(getCost()).length()); i++) {
            tostring += " ";
        }
        tostring+=ds.centsToDollarsAndCents(getCost())+System.getProperty("line.separator");

        return tostring;
    }

}
