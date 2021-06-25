
void setup() {
size(700, 700);
}
void draw() {
PImage face = loadImage("face.png");
face.resize(200, 200);
image(face, 230, 230);
fill(255, 0, 0);
ellipse(300, 300, 50, 50);
ellipse(350, 300, 50, 50);
if(mousePressed){
fill(0, 0, 0);
ellipse(300, 300, 50, 50);
ellipse(350, 300, 50, 50);
}
}
