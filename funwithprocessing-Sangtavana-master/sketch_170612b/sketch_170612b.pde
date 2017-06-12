void setup(){
  size(800,800);
}

void draw(){
     //2. make it a nice color 
fill(#5ED8F0);
   //3. if the mouse is pressed, fill the circle with a different color  
 if(mousePressed){
   fill(#0C1B98);
 }
   //1. draw an ellipse 
   ellipse(250,31,23,10);
}