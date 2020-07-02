import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    PancakeHouseIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }
}
