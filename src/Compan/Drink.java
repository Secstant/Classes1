package Compan;

import java.util.ArrayList;
import java.util.List;

public class Drink implements Magazine {
    private List<Magazine> components = new ArrayList<>();
    public void addComponent(Magazine component){
        components.add(component);
    }
    public void removeComponent(Magazine component){
        components.remove(component);
    }
    public void mix(){
        for (Magazine component:components){
            component.mix();
        }
    }
}
