import java.util.ArrayList;

public class GameController {

    public static void main(String[] args){
        // Created ArrayList
        ArrayList<Thing> allThings = new ArrayList<>();

        // created first Thing object
        Thing draw1 = new Thing("draw1","nothing");
        draw1.isDrawn = true;
        draw1.drawFile = "groundRock.png";
        draw1.position.x = .5;
        draw1.position.y = .5;

        // created second Thing object
        Thing draw = new Thing("Draw1", "nothing");
        draw.isDrawn = true;
        draw.drawFile = "ground.png";
        draw.position.x = 0.3;
        draw.position.y = .2;

        // Add Those two think into the ArrayList
        allThings.add(draw1);
        allThings.add(draw);

        for(int i=0;i<allThings.size();i++){
            while (allThings.get(i).isDrawn){
                allThings.get(i).update();
                allThings.get(i).draw();
                StdDraw.show(2);
            }
        }

    }

}
