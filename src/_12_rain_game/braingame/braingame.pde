int score = 0;

void setup(){
  size(600,600);
  background(0,255,0);
}
void draw(){
  background(0,255,0);
  fill(0, 0, 255);
  stroke(255, 0, 0);
  ellipse(x, y, 100, 100);
  y += 5;
  if(y>=600){
    x = (int) random(width);
    y = 100;
  }
   rect(mouseX, mouseY, 200, 150);
   checkCatch(x);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
int y = 100;
int x = 100;

 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
