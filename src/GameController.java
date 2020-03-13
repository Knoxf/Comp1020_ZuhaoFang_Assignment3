public class GameController {

    public static void main(String[] args){
        draw1();
        draw2();
    }


    public static void draw1(){
        Thing draw1 = new Thing("draw1","nothing");
        draw1.isDrawn = true;
        draw1.drawFile = "groundRock.png";
        draw1.position.x = .5;
        draw1.position.y = .5;
        while(draw1.isDrawn){
            draw1.draw();
            StdDraw.show(60);
        }
    }

    public static void draw2(){
        Thing draw = new Thing("Draw1", "nothing");
        draw.isDrawn = true;
        draw.drawFile = "Person0.png";
        draw.position.x = 0.3;
        draw.position.y = .2;

        while(draw.isDrawn){
            draw.draw();
            StdDraw.show(60);
        }
    }
}
