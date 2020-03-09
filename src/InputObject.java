import java.awt.event.*;

// A simple class that uses StdDraw to listen for arrow key input and stores it in an object form.
public class InputObject{
	
	private boolean[] rawInput; // Up Down Left Right
	private boolean debug_mode = true;

	public InputObject(){
		rawInput = new boolean[4];
	}

	public void updateInput(){

		// Is UP key currently pressed? 
		if( StdDraw.isKeyPressed(KeyEvent.VK_UP)){
			if(debug_mode)
				System.out.println("Up Pressed");
			rawInput[0] = true;
		}else{
			rawInput[0] = false;
		}

		// Is DOWN key currently pressed? 
		if( StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
			if(debug_mode)
				System.out.println("Down Pressed");
			rawInput[1] = true;
		}else{
			rawInput[1] = false;
		}

		// Is LEFT key currently pressed? 
		if( StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
			if(debug_mode)
				System.out.println("Left Pressed");
			rawInput[2] = true;
		}else{
			rawInput[2] = false;
		}
		
		// Is RIGHT key currently pressed? 
		if( StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
			if(debug_mode)
				System.out.println("Right Pressed");
			rawInput[3] = true;
		}else{
			rawInput[3] = false;
		}

	}

	// ************ PROVIDED FOR EXAMPLE AND TESTING PURPOSES ONLY
	// SHOULD NOT BE USED IN YOUR PROJECT DIRECTLY
	public static void main(String[] args){

		InputObject input = new InputObject();

		input.updateLoop();

	}
	// This is a basic input update loop that updates the input at a fixed framerate.

	private void updateLoop(){

		while(true){

			updateInput();

			StdDraw.show(20); // 20 Milliseconds or 50 frames per second (20/1000 = 50)
		}
	}

}