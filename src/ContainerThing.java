import java.util.ArrayList;

public class ContainerThing extends Thing {
    ArrayList<Thing> theThing = new ArrayList<>();

    public ContainerThing(String name, String description){
        super(name, description);
    }


}
