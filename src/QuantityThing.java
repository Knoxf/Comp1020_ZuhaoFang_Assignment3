public class QuantityThing extends Thing{

    String measurement;
    double weightPerUnit;
    int units;
    int maxCapacity;

    public QuantityThing(String name, String description) {
        super(name, description);
    }

    public double totalWeight(){
        return units * weightPerUnit;
    }

    public int remainingCapacity(){
        return maxCapacity - units;
    }

    public void add(){
        if((maxCapacity - units) != 0 && (maxCapacity - units)>0){

        }
    }

    public void remove(){

    }


}
