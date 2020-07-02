import java.util.Iterator;

class Waitress {
    private MenuComponent allMenus;

    Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    void printMenu(){
        allMenus.print();
    }

    void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n-----");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try{
                if(menuComponent.isVegetarian())
                    menuComponent.print();
            } catch (UnsupportedOperationException ignored){}
        }
    }
}
