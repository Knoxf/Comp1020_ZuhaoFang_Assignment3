public class QuantityThing extends Thing{

    public String measurement;
    public double weightPerUnit;
    public int units;
    public int maxCapacity;

    public QuantityThing(String name, String description) {
        super(name, description);
    }

    public double totalWeight(){
        return units * weightPerUnit;
    }

    public int remainingCapacity(){
        return maxCapacity - units;
    }

    public void add(int addNum){
        if((maxCapacity - units) >= 0){
            if((units + addNum) <= maxCapacity){
                units += addNum;
            }
        }
    }

    public void remove(int removeNum){
        if(units >= 0){
            if((units - removeNum) >= 0){
                units -= removeNum;
            }
        }
    }


}
