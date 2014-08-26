int x=150;
int y=150;
int xDelta=5;
int yDelta=4;
void setup()
{
	size(300,300);
}

void draw()
{
	background(255,255,0);	
	ball();
}

void ball()
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