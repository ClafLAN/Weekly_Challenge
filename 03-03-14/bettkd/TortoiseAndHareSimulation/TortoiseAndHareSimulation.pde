final int FASTPLOD = 3;
final int SLIP = -6;
final int SLOWPOD = 1;

final int SLEEP = 0;
final int BIGHOP = 9;
final int BIGSLIP = -12;
final int SMALLHOP = 1;
final int SMALLSLIP = -2;

final int MAX = 70;
final int MIN = 1;

int tortPos;
int harePos;
PImage tortImg;
PImage hareImg;
PImage finImg;
PImage startImg;
PImage stopImg;
PImage trackImg;
PImage bgImg;

int currentTime = 0;
boolean start = false;
void setup () {
  size(1280, 700);
  if (frame != null) {
    frame.setResizable(true);
  }
  tortPos = MIN;
  harePos = MIN;
  tortImg = loadImage("data/tort.png");
  hareImg = loadImage("data/hare.png");
  finImg = loadImage("data/finish.png");
  startImg = loadImage("data/start.png");
  stopImg = loadImage("data/stop.png");
  trackImg = loadImage("data/track.jpg");
  bgImg = loadImage("data/bg.jpg");
  tortImg.resize(width/10,height/10);
  hareImg.resize(width/10,height/10);
  finImg.resize(width/8,height);
  startImg.resize(width/8,height);
  stopImg.resize(width/8,height);
  trackImg.resize(width-2*(width/8), height/5);
  bgImg.resize(width,height);
  
  currentTime = millis();
  noLoop();
}

void draw() {
  background(200);
  image(bgImg, 0, 0);
  int edge = width/8;
  int track = width - edge*2;
  int pace = track/MAX;
  
  if(!start){
    image(stopImg, 0, 0, edge, height);
    fill(0,0,200);
    textSize(40);
    text("Touch/Click To Start Race.", width/4, height/6);
    start = true;
  }else{
    image(startImg, 0, 0, edge, height);
  }
  tint(255, 230);
  image(trackImg, edge, 8*height/14);
  tint(255, 255);
  image(finImg, width-edge, 0, edge, height);
  
  
  image(tortImg, tortPos*pace+edge, 7*height/12);
  image(hareImg, harePos*pace+edge, 2*height/3);
  
  if(tortPos == MAX){
    textSize(40);
    fill(0,0,200);
    text("Touch/Click To Restart!!", width/4, height/6);
    fill(0,200,0);
    text("Yaay!! Dominic's Tortoise Wins!!", width/4, height/3);
    image(stopImg, 0, 0, edge, height);
    start = false;
    noLoop();
  }
  if(harePos == MAX) {
    textSize(40);
    fill(0,0,200);
    text("Touch/Click To Restart!!", width/4, height/6);
    fill(0,200,0);
    text("Oops!! Your Hare Wins :((", width/3, height/3);
    image(stopImg, 0, 0, edge, height);
    start = false;
    noLoop();
  }
  if(tortPos == MAX && harePos == MAX){
    textSize(40);
    fill(0,0,200);
    text("Touch/Click To Restart!!", width/4, height/6);
    fill(200,0,0);
    text("Yuck!! No Winner.", width/3, height/3);
    image(stopImg, 0, 0, edge, height);
    start = false;
    noLoop();
  }
  if ( millis() - currentTime > 1000 ) {
    tortPos += tortMovt();
    harePos += hareMovt();
    if(tortPos < MIN) tortPos = MIN;
    if(tortPos > MAX) tortPos = MAX;
    if(harePos < MIN) harePos = MIN;
    if(harePos > MAX) harePos = MAX;  
    currentTime = millis();
  }
}

void mouseClicked() {
  tortPos = MIN;
  harePos = MIN;
  loop();
}

int tortMovt(){
  int rand = (int) random(10);
  if(rand < 5)
    return FASTPLOD;
  else if( rand < 7)
    return SLIP;
  else
    return SLOWPOD;    
}

int hareMovt(){
  int rand = (int)random(10);
  if(rand < 2)
    return SLEEP;
  else if( rand < 4)
    return BIGHOP;
  else if( rand < 5)
    return BIGSLIP;
  else if( rand < 8)
    return SMALLHOP;
  else
    return SMALLSLIP;    
}
