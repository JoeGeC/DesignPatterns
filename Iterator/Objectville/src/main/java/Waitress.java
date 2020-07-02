import java.util.ArrayList;
import java.util.Iterator;

class Waitress {
    private ArrayList<Menu> menus;

    Waitress(ArrayList menus) {
        this.menus = menus;
    }

    void printMenu(){
        for (Menu menu : menus)
            printMenu(menu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
