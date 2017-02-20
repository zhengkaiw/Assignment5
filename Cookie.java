/**
 * Created by zhengkevin on 2/19/17.
 */
public class Cookie extends DessertItem {

    private int number;
    private int pricePerDozen;

    DessertShoppe ds = new DessertShoppe();

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPricePerDozen(int pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    public int getNumber() {
        return number;
    }

    public int getPricePerDozen() {
        return pricePerDozen;
    }

    public Cookie(String name, int number, int pricePerDozen) {

        setName(name);
        setNumber(number);
        setPricePerDozen(pricePerDozen);

    }

    public Cookie() {

    }

    public int getCost() {

        double t = (double)number / 12;
        return ds.getInt(t, pricePerDozen);

    }

    public String toString() {
        String tostring = "";

        tostring += number + " lbs. @ " + ds.centsToDollarsAndCents(pricePerDozen) + " /lb." + System.getProperty("line.separator");
        tostring += getName();
        for (int i = 0; i < (ds.MAX_LINE - getName().length() - ds.centsToDollarsAndCents(getCost()).length()); i++) {
            tostring += " ";
        }
        tostring += ds.centsToDollarsAndCents(getCost()) + System.getProperty("line.separator");

        return tostring;
    }

}
