void setup(){
   size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.jpg");      //in setup method
        pictureOfRecord.resize(height,width);     //in setup method
}

void draw(){
   rotateImage(pictureOfRecord,angle);
  image(pictureOfRecord, 100, 100);  //in draw method
   if(mousePressed){
   angle += 5;  
   }
}
int angle = 0;
PImage pictureOfRecord;                        //as member variable
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}


      
