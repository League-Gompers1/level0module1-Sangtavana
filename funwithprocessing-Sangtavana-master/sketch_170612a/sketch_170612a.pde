/* 1. Change the code below to make the rocket ship take off. */
/* 2. Add a moon and stars to the sky. */ 
 
int x = 400; int y = 600;  
void setup() {    size(800, 800); } 
 
void draw() {   fill(random(255), 0, 0);
   background(0, 0, 40);
if(mousePressed){
y = y + -1;
  
}
ellipse(100,400,100,100);
fill(100,100,100,100);
ellipse(x, y + 130, 90, 90);
fill(248, 128, 0);  
ellipse(x, y + 115, 70, 70); 
fill(255, 153, 0);  
ellipse(x, y + 95, 35, 35);
fill(100, 100, 100);
triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100); 

 }