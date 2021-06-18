
void setup() {
    size(700,700);
}
void draw() {
    fill(#d79914);
ellipse(350, 350, 400, 400);
PImage pepperoni;
pepperoni = loadImage("pepperoni.png");
image(pepperoni,200,200);
image(pepperoni,200,400);
image(pepperoni,400,200);
image(pepperoni,400,400);
pepperoni.resize(30, 30);

PImage olive;
olive = loadImage("olive.png");
image(olive,300,300);
image(olive,200,300);
image(olive,300,200);
image(olive,400,300);
olive.resize(30, 30);

PImage mushroom;
mushroom = loadImage("mushroom.png");
image(mushroom,300,250);
image(mushroom,250,400);
image(mushroom,400,250);
image(mushroom,321,400);
mushroom.resize(30, 30);
}
