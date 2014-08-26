import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x=150;
int y=150;
int xDelta=5;
int yDelta=4;
public void setup()
{
	size(300,300);
}

public void draw()
{
	background(255,255,0);	
	ball();
}

public void ball()
{
	ellipse(x,y,30,30);
	if(x+15>300){
		xDelta=-5;
	}
	if(x-15<0){
		xDelta=5;
	}
	if(y+15>300){
		yDelta=-4;
	}
	if(y-15<0){
		yDelta=4;
	}
	x=x+xDelta;
	y=y+yDelta;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
