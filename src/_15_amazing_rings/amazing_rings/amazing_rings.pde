int circleWidth= 400;
int circleHeight=400;
int circleX=200;
int circleY=250;
int circleXposition=200;
int value=5;
int value2=5;
int X=1490;
int circle2X=1300;
int circle2Y=250;
void setup() {
  background(150, 150, 150);
  size(1500, 500);  
  ring1();
  ring2();
}

void draw() {
  background(150, 150, 150);
  circleXposition+=value;
  circle2X+=value2;
  ring1();
  ring2();
  //checking right circle
  if(circleXposition> width){
    value=-5;
  }else if(circleXposition<0){
      value=+5;
    }
 //checking left circle

if(circle2X<0){
  value2=+5;
}else if(circle2X>width){
  value2=-5;
}

}
 
  
public void ring1() {
  for (int numberOfRings=0; numberOfRings<40; numberOfRings++) {  
    if (numberOfRings == 39) break;    
    if (numberOfRings % 2==0) {
      fill(150, 150, 150);
    } else {
      fill (0, 0, 0);
    }
     noFill();
    ellipse(circleXposition, circleY, circleWidth-=10, circleHeight-=10);
   
  }
  circleWidth=400;
  circleHeight=400;
}

public void ring2() {
  for (int numberOfRings=0; numberOfRings<40; numberOfRings++) {  
    if (numberOfRings == 39) break;    
    if (numberOfRings % 2==0) {
      fill(150, 150, 150);
    } else {
      fill (0, 0, 0);
    }
     noFill();
    ellipse(circle2X, circle2Y, circleWidth-=10, circleHeight-=10);
   
  }
  circleWidth=400;
  circleHeight=400;
}
