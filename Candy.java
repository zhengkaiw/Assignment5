/**
 * Created by zhengkevin on 2/19/17.
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerPound;

    DessertShoppe ds = new DessertShoppe();

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return String.valueOf(weight);
    }

    public int getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(int pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    public Candy(String name, double weight, int pricePerPound) {

        setName(name);
        setWeight(weight);
        setPricePerPound(pricePerPound);

    }

    public Candy() {

    }

    public int getCost() {

        return ds.getInt(weight, pricePerPound);

    }

    public String toString() {
        String tostring = "";

        tostring += ds.centsToDollarsAndCents((int)(weight*100)) + " lbs. @ " + ds.centsToDollarsAndCents(pricePerPound) + " /lb." + System.getProperty("line.separator");
        tostring += getName();
        for (int i = 0; i < (ds.MAX_LINE - getName().length() - ds.centsToDollarsAndCents(getCost()).length()); i++) {
            tostring += " ";
        }
        tostring += ds.centsToDollarsAndCents(getCost()) + System.getProperty("line.separator");

        return tostring;
    }

}
