//1. Make a variable to hold the X co-ordinate of the dot, and set it to something. 
 int xcoordinate=10;
 
void setup() {   size(800, 200); } 
 
void draw() {  
  
  //3. make it a nice color    
fill(#9ED6E0);
//4. if the mouse is pressed... 
if(mousePressed){
//5. ... change the X co-ordinate so that the dot moves to the right    
xcoordinate=xcoordinate + 10;

}
//2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position. 
 ellipse(xcoordinate, 100, 100, 100);
//6. Make your dot move really fast so that it can win the race (you have to figure out what part of your code to change) 
}