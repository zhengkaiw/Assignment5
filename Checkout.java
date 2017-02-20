import java.util.Vector;

/**
 * Created by zhengkevin on 2/19/17.
 */

public class Checkout {

    Vector<DessertItem> v;

    DessertShoppe ds = new DessertShoppe();
    Candy can;
    Cookie coo;
    IceCream ice;
    Sundae sun;

    public Checkout() {
        v = new Vector<DessertItem>();
    }

    public void enterItem(DessertItem item) {
        v.add(item);
    }

    public int numberOfItems() {
        return v.size();
    }

    public void clear() {
        v.clear();
    }

    public int totalCost() {
        int t = 0;

        for (DessertItem d : v) {
            t += d.getCost();
        }
        return t;
    }

    public int totalTax() {
        int t = 0;

        for (DessertItem d : v) {
            t += ds.getInt(ds.TAXRATE, d.getCost());
        }
        return t;
    }

    public String toString() {

        String tostring = "";

        tostring += "     M & M Dessert Shoppe     " + System.getProperty("line.separator") + "     ____________________     " + System.getProperty("line.separator") + System.getProperty("line.separator");

        for (DessertItem d : v) {
            tostring += d.toString();
        }
        tostring += System.getProperty("line.separator") + "Tax";
        for (int i = 0; i < (ds.MAX_LINE - ds.centsToDollarsAndCents(totalTax()).length() - 3); i++) {
            tostring += " ";
        }
        tostring += ds.centsToDollarsAndCents(totalTax()) + System.getProperty("line.separator") + "Total Cost";
        for (int i = 0; i < (ds.MAX_LINE - ds.centsToDollarsAndCents(totalCost()+totalTax()).length() - 10); i++) {
            tostring += " ";
        }
        tostring += ds.centsToDollarsAndCents(totalCost()+totalTax());
        return tostring;
    }
}
