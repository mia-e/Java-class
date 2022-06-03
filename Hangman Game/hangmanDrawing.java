//Mia Escoto 
//Hangman

import TurtleGraphics.*; 

public class hangman{
    public static void main(String args[]){
        SketchPadWindow pad = new SketchPadWindow(600, 800);
        StandardPen pen = new StandardPen(pad);
        drawGallow(pen);
        drawHat(pen);
        drawHead(pen);
        drawRightEye(pen);
        drawLeftEye(pen);
        drawRightEar(pen);
        drawLeftEar(pen);
        drawGlasses(pen);
        drawNose(pen);
        drawMouth(pen);
        drawTeeth(pen);
        drawBody(pen);
        drawRightArm(pen);
        drawLeftArm(pen);
        drawRightLeg(pen);
        drawLeftLeg(pen);
        drawRightFoot(pen);
        drawLeftFoot(pen);
        drawRightEarring(pen);
        drawLeftEarring(pen);
        drawTop(pen);
        drawRightSandal(pen);
        drawLeftSandal(pen);
        drawButtons(pen);
        drawPants(pen);
    }
    public static void drawGallow(StandardPen pen){
        pen.home();
        //set pen
        pen.up();
        pen.move(-100);
        pen.down();
        //base
        pen.turn(-90);
        pen.move(200);
        pen.turn(180);
        pen.move(100);
        pen.turn(-90);
        //stand
        pen.move(400);
        pen.turn(90);
        pen.move(150);
        //hook
        pen.turn(90);
        pen.move(20);
    }
    public static void drawHat(StandardPen pen){
        pen.home();
        //set pen
        pen.up();
        pen.turn(90);
        pen.move(50);
        pen.turn(-90);
        pen.move(280);
        pen.down();
        //top
        pen.turn(90);
        pen.move(20);
        pen.turn(180);
        pen.move(40);
        pen.turn(-90);
        //right
        pen.move(50);
        pen.turn(90);
        //base
        pen.move(10);
        pen.turn(180);
        pen.move(60);
        pen.turn(180);
        pen.move(10);
        //left
        pen.turn(90);
        pen.move(50);
        
    }
    public static void drawHead(StandardPen pen){
        pen.home();
        //move
        pen.up();
        pen.turn(90);
        pen.move(13);
        pen.turn(-90);
        pen.move(192);
        pen.down();
        //draw
        drawCircle(pen, 1.5);
    }
    public static void drawRightEye(StandardPen pen){
        pen.home();
        //move
        pen.up();
        pen.turn(90);
        pen.move(60);
        pen.turn(-90);
        pen.move(200);
        pen.down();
        //draw
        drawCircle(pen, .2);
    }
    public static void drawLeftEye(StandardPen pen){
        pen.home();
        //move
        pen.up();
        pen.turn(90);
        pen.move(30);
        pen.turn(-90);
        pen.move(200);
        pen.down();
        //draw
        drawCircle(pen, .2);
    }
    public static void drawRightEar(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(190);
        pen.turn(-95);
        pen.move(-13);
        pen.down();
        drawHalfCircle(pen, .3);
    }
    public static void drawLeftEar(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(190);
        pen.turn(80);
        pen.move(90);
        pen.down();
        drawHalfCircle(pen, .3);
    }
    public static void drawGlasses(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(190);
        pen.turn(80);
        pen.move(90);
        pen.down();
        //left stick
        pen.turn(180);
        pen.setDirection(-25);
        pen.move(16);
        pen.setDirection(90);
        pen.move(7.5);
        //left lens
            for (int i = 0; i <=4; i++){
            pen.turn(-90);
            pen.move(15);
        }
        //bridge
        pen.turn(-90);
        pen.move(7.5);
        pen.turn(90);
        pen.move(15);
        pen.turn(-90);
        pen.move(7.5);
        //right lens
            for (int i = 0; i <=4; i++){
            pen.turn(90);
            pen.move(15);
        }
        //right stick
        pen.turn(90);
        pen.move(7.5);
        pen.setDirection(25);
        pen.move(15);
    }
    public static void drawNose(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(195);
        pen.turn(90);
        pen.move(50);
        pen.down();
        drawHalfCircle(pen, .2);
    }
    public static void drawMouth(StandardPen pen){
        pen.home();
        pen.up();
        //position
        pen.turn(90);
        pen.move(67);
        pen.turn(-90);
        pen.move(180);
        pen.setDirection(257);
        pen.down();
        //under lip
        drawHalfCircle(pen, .6);
        pen.setDirection(180);
        //top lip
        pen.move(30);
    }
    public static void drawTeeth(StandardPen pen){
        pen.home();
        pen.up();
        pen.turn(90);
        pen.move(67);
        pen.turn(-90);
        pen.move(180);
        pen.turn(180);
        pen.down();
        for (int i = 0; i <=4 ;i++){
            pen.move(9);
            pen.turn(90);
            pen.move(6);
            pen.turn(90);
            pen.move(9);
            pen.turn(180);
        }
    }
    public static void drawBody(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(158);
        pen.turn(90);
        pen.move(40);
        pen.turn(90);
        //neck
        pen.down();
        pen.move(15);
        pen.turn(-90);
        pen.up();
        pen.move(20);
        pen.down();
        pen.turn(-90);
        pen.move(15);
        //shoulders
        pen.turn(180);
        pen.move(15);
        pen.turn(-90);
        pen.move(30);
        pen.up();
        pen.turn(180);
        pen.move(50);
        pen.down();
        pen.move(30);
        //torso
        pen.up();
        pen.turn(180);
        pen.move(15);
        pen.turn(90);
        pen.move(20);
        pen.down();
        pen.move(70);
        pen.up();
        pen.turn(-90);
        pen.move(50);
        pen.down();
        pen.turn(-90);
        pen.move(70);
    }
    public static void drawRightArm(StandardPen pen){
        pen.home();
        pen.up();
        pen.turn(90);
        pen.move(8);
        pen.turn(-90);
        pen.move(143);
        pen.down();
        pen.turn(180);
        pen.move(90);
        pen.turn(-90);
        pen.move(15);
    }
    public static void drawLeftArm(StandardPen pen){
        pen.home();
        pen.up();
        pen.turn(90);
        pen.move(90);
        pen.turn(-90);
        pen.move(143);
        pen.down();
        pen.turn(180);
        pen.move(90);
        pen.turn(90);
        pen.move(15);
    }
    public static void drawRightLeg(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(52);
        pen.turn(90);
        pen.move(25);
        pen.turn(90);
        pen.down();
        pen.move(80);
        pen.turn(-90);
        pen.up();
        pen.move(25);
        pen.down();
        pen.turn(-90);
        pen.move(70);
        
    }
    public static void drawLeftLeg(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(52);
        pen.turn(90);
        pen.move(75);
        pen.turn(90);
        pen.down();
        pen.move(80);
        pen.turn(90);
        pen.up();
        pen.move(25);
        pen.down();
        pen.turn(90);
        pen.move(70);
    }
    public static void drawRightFoot(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(-30);
        pen.turn(90);
        pen.move(50);
        pen.down();
        pen.turn(90);
        pen.move(20);
        pen.turn(90);
        pen.move(45);
        pen.turn(90);
        pen.move(15);
        pen.turn(90);
        //toe
        pen.move(10);
        pen.turn(180);
        pen.move(10);
        pen.turn(90);
        pen.move(5);
        pen.turn(90);
        pen.move(20);
    }
    public static void drawLeftFoot(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(-30);
        pen.turn(90);
        pen.move(50);
        pen.down();
        pen.turn(90);
        pen.move(20);
        pen.turn(-90);
        pen.move(45);
        pen.turn(-90);
        pen.move(15);
        pen.turn(-90);
        //toe
        pen.move(10);
        pen.turn(180);
        pen.move(10);
        pen.turn(-90);
        pen.move(5);
        pen.turn(-90);
        pen.move(20);
    }
    public static void drawRightSandal(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(-30);
        pen.turn(90);
        pen.move(23);
        pen.turn(90);
        pen.down();
        //slide
        pen.move(20);
        pen.turn(90);
        pen.move(5);
        pen.turn(90);
        pen.move(20);
        pen.turn(90);
        //strap
        pen.move(30);
    }
        public static void drawLeftSandal(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(-30);
        pen.turn(90);
        pen.move(77);
        pen.turn(90);
        pen.down();
        //slide
        pen.move(20);
        pen.turn(-90);
        pen.move(5);
        pen.turn(-90);
        pen.move(20);
        pen.turn(-90);
        //strap
        pen.move(30);
    }
    public static void drawRightEarring(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(192);
        pen.turn(90);
        pen.move(10);
        pen.turn(90);
        pen.down();
        pen.move(10);
        drawCircle(pen, .02);
    }
    public static void drawLeftEarring(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(192);
        pen.turn(90);
        pen.move(92);
        pen.turn(90);
        pen.down();
        pen.move(10);
        pen.turn(180);
        drawCircle(pen, .02);
    }   
    public static void drawTop(StandardPen pen){
        pen.home();
        pen.up();
        //neck
        pen.move(142);
        pen.turn(90);
        pen.move(40);
        pen.turn(90);
        pen.setDirection(240);
        pen.down();
        pen.move(20);
        pen.setDirection(-240);
        pen.move(20);
        pen.setDirection(180);
        pen.up();
        pen.move(15);
        pen.turn(90);
        pen.move(30);
        pen.turn(-90);
        pen.down();
        //left sleeve
        pen.move(15);
        pen.turn(180);
        pen.up();
        pen.move(65);
        pen.down();
        //right sleeve
        pen.move(15);
        //bottom
        pen.up();
        pen.turn(-90);
        pen.move(60);
        pen.turn(-90);
        pen.move(15);
        pen.down();
        pen.move(50);
    }
    public static void drawButtons(StandardPen pen){
        pen.home();
        pen.up();
        pen.turn(90);
        pen.move(50);
        pen.turn(-90);
        pen.move(110);
        pen.down();
        //buttons
        for (int i = 0; i <=3; i++){
            pen.setDirection(215);
            drawCircle(pen, .1);
            pen.up();
            pen.move(10);
            pen.down();
        }   
    }
    public static void drawPants(StandardPen pen){
        pen.home();
        pen.up();
        pen.move(-20);
        pen.turn(90);
        pen.move(25);
        pen.down();
        pen.move(50);
    }
    
    public static void drawCircle(StandardPen pen, double x){
        for(int i = 0; i < 140; i++){
            double side = x * 3.14 *50/120;
            pen.move(side);
            pen.turn(3);
            
        }
    }
    public static void drawHalfCircle(StandardPen pen, double x){
        for(int i = 0; i < 70; i++){
            double side = x * 3.14 *50/120;
            pen.move(side);
            pen.turn(3);
        }
    }

}