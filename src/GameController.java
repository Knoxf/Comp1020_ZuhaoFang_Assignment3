public class GameController {

    public static void main(String[] args){
        Thing draw1 = new Thing("draw1","nothing");
        draw1.isDrawn = true;
        draw1.xAxis = 2;
        draw1.yAsix = 30000;
        draw1.drawFile = "groundRock.png";

        while(draw1.isDrawn){
            draw1.draw();
        }
    }
}
