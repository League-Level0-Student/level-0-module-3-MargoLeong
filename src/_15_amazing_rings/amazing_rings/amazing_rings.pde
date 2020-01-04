  int circleWidth= 400;
  int circleHeight=400;
  int circleX=200;
  int circleY=200;


void setup(){
  background(150,150,150);
  size(1500, 500);  
  ring1();
}

void draw(){
  
  
  


 
}

                
 public void ring1(){
   for(int numberOfRings=0; numberOfRings<40; numberOfRings++){  
         if (numberOfRings == 39) break;    
        if (numberOfRings % 2==0){
          fill(150,150,150);
        }  
        else {
          fill (0,0,0);
        }
        ellipse(circleX,circleY,circleWidth-=10, circleHeight-=10);
      }
 }
