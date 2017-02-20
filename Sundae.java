/**
 * Created by zhengkevin on 2/19/17.
 */
public class Sundae extends IceCream {

    private String topping;
    private int costs_topping;

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setCosts_topping(int costs_topping) {
        this.costs_topping = costs_topping;
    }

    public Sundae(String name, int costs, String topping, int costs_topping) {

        setName(name);
        setCosts(costs);
        setTopping(topping);
        setCosts_topping(costs_topping);

    }

    public Sundae() {

    }

    public int getCost() {
        return super.getCost() + costs_topping;
    }

    public String toString() {
        String tostring = "";

        tostring += topping + " Sundae with" + System.getProperty("line.separator");
        tostring += getName();
        for (int i = 0; i < (ds.MAX_LINE - getName().length() - ds.centsToDollarsAndCents(getCost()).length()); i++) {
            tostring += " ";
        }
        tostring += ds.centsToDollarsAndCents(getCost()) + System.getProperty("line.separator");

        return tostring;
    }

}
