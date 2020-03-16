import java.util.ArrayList;

public class ContainerThing extends Thing {
    ArrayList<Thing> theThing = new ArrayList<>();
    QuantityThing ds = new QuantityThing("x","s");

    public ContainerThing(String name, String description){
        super(name, description);
    }

    public double totalWeight(){
        double totalWeight;
        totalWeight = ds.totalWeight() + super.totalWeight() ;
        return totalWeight;
    }

    public double maxWeightCapacity(){
        double maxWeightCapacity;
        maxWeightCapacity = ds.maxCapacity * ds.units;
        return maxWeightCapacity;
    }

    public boolean addThing(Thing newThing){
        boolean isAdd = false;

        if(theThing.contains(newThing)){
            if((newThing.weight + super.weight) < maxWeightCapacity()){
                theThing.add(newThing);
                isAdd = true;
            }
        }
        return isAdd;
    }

    public boolean removeThing(Thing toRemove){
        boolean isRemove = false;

        if(theThing.contains(toRemove)){
            theThing.remove(toRemove);
            isRemove = true;
        }
        return isRemove;
    }

}
