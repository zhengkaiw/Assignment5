/**
 * Created by zhengkevin on 2/19/17.
 */

public abstract class DessertItem {

    private String name;

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getCost();

    public DessertItem(){

    }

    public DessertItem(String name){
        this.setName(name);
    }
}
