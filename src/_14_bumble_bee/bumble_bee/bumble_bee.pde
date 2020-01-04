
void setup() {
     ellipseMode(CENTER);
     size(500, 500);
     background(160, 160, 160);
      drawFlower(350, 100);

  
}

void draw() {
/*Use a loop to make a body for the Bee!
Then put his head on using drawBeeFace(x,y)
Use Modulo to make the colors alternate 
*/
int x=20;
int y=20;


for(int i=0; i<2; i++){  
  fill(#FFF817);
  ellipse(x,y,35,35);
  ellipse(x+30,y+30,35,35);
  ellipse(x+60,y+60,35,35);
  ellipse(x+90,y+90,35,35);
  ellipse(x+120,y+120,35,35);
  ellipse(x+150,y+150,35,35);
  ellipse(x+180,y+180,35,35);
fill(#030200);
ellipse(x+15,y+15,35,35);
ellipse(x+45,y+45,35,35);
ellipse(x+75,y+75,35,35);
ellipse(x+105,y+105,35,35);
ellipse(x+135,y+135,35,35);
ellipse(x+165,y+165,35,35);

}

 drawBeeFace(220,220);

}
void drawFlower(int x, int y) {
     noStroke();
     translate(x, y);
     // draw 5 petals, rotating after each one
     fill(#c6ff89);      // green
      for (int i = 0; i < 5; i++) {
           ellipse(0, -40, 50, 50);
          rotate(radians(72));
     }
     fill(#fff9bb); // light yellow
     ellipse(0, 0, 50, 50);
} 
void drawBeeFace(int BeeFaceX, int BeeFaceY) {

  noStroke();
     fill(0, 0, 0);
     stroke(1);
     strokeWeight(5);
     line(BeeFaceX-10, BeeFaceY-27, BeeFaceX-17, BeeFaceY-50);
     line(BeeFaceX+10, BeeFaceY-27, BeeFaceX+17, BeeFaceY-50);
     ellipse(BeeFaceX-17, BeeFaceY-50, 10, 10);
     ellipse(BeeFaceX+17, BeeFaceY-50, 10, 10);
     noStroke();
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY, 60, 60); // face
     fill(255, 237, 209);
     fill(0,0,0);
      ellipse(BeeFaceX-10, BeeFaceY-15, 10, 10); // eyes
     ellipse(BeeFaceX+10, BeeFaceY-15, 10, 10);
      ellipse(BeeFaceX, BeeFaceY-5, 10, 10); // nose
      ellipse(BeeFaceX, BeeFaceY+10, 20, 10);// mouth
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY+5, 20, 6);
}
