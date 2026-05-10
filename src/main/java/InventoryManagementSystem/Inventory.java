package InventoryManagementSystem;

import java.util.Collection;
import java.util.HashMap;

public class Inventory<T extends Item> {
    private HashMap<String, T> items = new HashMap<>();

    public Inventory() {
        this.items = new HashMap<>();
    }

  // add Item
    public void addItem( T item){

        if ( items.containsKey(item.getId())){
            throw new IllegalArgumentException("Duplicate id not allowed");
        }
        items.put(item.getId(), item);

    }

    // removeItem
    public void removeItem (String id){
        items.remove(id);
    }
    // getItem
    public T getItem ( String id){
        return  items.get(id);
    }
    // getAllItem

    public Collection<T> getAllItem (){
         return  items.values();
    }

}