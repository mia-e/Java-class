//Mia Escoto
//drawing a fancy house

import TurtleGraphics.*;

public class fancy{
    public static void main(String args[]){
        SketchPadWindow pad = new SketchPadWindow(600, 800);
        StandardPen pen = new StandardPen(pad);
        pen.home();
        pen.up();
        pen.setDirection(180);
        pen.move(250);
        pen.setDirection(270);
        pen.move(100);
        pen.down();
        pen.setDirection(0);
        //Draw base
        for(int i = 0; i<=2; i++){  
            pen.move(350);
            pen.turn(90);
            pen.move(200);
            pen.turn(90);
        }
        //drawing roof
        pen.move(-23);
        pen.setDirection(120);
        pen.move(150);
        pen.turn(60);
        pen.move(50);
        //roofer right side
        pen.turn(-40);
        pen.move(30);
        pen.turn(180);
        pen.move(65);
        //move to draw base
        pen.turn(180);
        pen.move(20);
        pen.turn(130);
        //base
        pen.move(50);
        pen.turn(-90);
        pen.move(70);
        pen.turn(-90);
        pen.move(50);
        //roofer left
        pen.setDirection(220);
        pen.move(20);
        pen.turn(180);
        pen.move(65);
        //move to draw roofer window
        pen.up();
        pen.setDirection(270);
        pen.move(40);
        pen.turn(90);
        pen.move(-13);
        pen.down();
        //draw window
        for(int i = 0; i<=4; i++){
            pen.move(25);
            pen.turn(-90);
        }
        //draw the window cross
        pen.move(12.5);
        pen.turn(-90);
        pen.move(25);
        pen.turn(-90);
        pen.move(12.5);
        pen.turn(-90);
        pen.move(12.5);
        pen.turn(-90);
        pen.move(25);
        //move back to roof
        pen.up();
        pen.setDirection(0);
        pen.move(25);
        pen.turn(90);
        pen.move(45);
        pen.turn(90);
        pen.move(50);
        pen.down();
        pen.move(150);
        //draw chiminey
        pen.turn(-90);
        pen.move(50);
        pen.turn(-90);
        pen.move(25);
        pen.turn(-90);
        pen.move(50);
        pen.turn(180);
        pen.move(45);
        pen.turn(90);
        pen.move(25);
        pen.turn(90);
        pen.move(45);
        //draw smoke
        pen.up();
        pen.setDirection(90);
        pen.move(55);
        pen.turn(-90);
        pen.move(5);
        pen.down();
        for(int i = 0; i <= 3; i++){
            drawCircle(pen, .5);
            pen.setDirection(0);
        }
        //finish roof
        pen.up();
        pen.setDirection(0);
        pen.move(30);
        pen.setDirection(270);
        pen.move(141);
        pen.turn(-90);
        pen.down();
        pen.setDirection(240);
        pen.move(150);
        pen.turn(120);
        pen.move(23);
        //move to draw windows
        pen.setDirection(270);
        pen.up();
        pen.move(40);
        pen.turn(90);
        pen.move(30);
        //draw window
        for (int j = 0; j<= 2; j++){
            pen.down();
                for(int i = 0; i<=4; i++){
                pen.move(50);
                pen.turn(-90);
            }
            //draw the window cross
            pen.move(25);
            pen.turn(-90);
            pen.move(50);
            pen.turn(-90);
            pen.move(25);
            pen.turn(-90);
            pen.move(25);
            pen.turn(-90);
            pen.move(50);
            pen.turn(180);
            pen.move(50);
            pen.up();
            pen.setDirection(0);
            pen.move(100);
            pen.down();
        }
        //draw door
        pen.up();
        pen.move(-125);
        pen.setDirection(270);
        pen.move(90);
        pen.down();
        for (int i = 0; i < 2; i++){
            pen.move(70);
            pen.turn(90);
            pen.move(50);
            pen.turn(90);
        }
        //draw handle
        pen.setDirection(0);
        pen.up();
        pen.move(50);
        pen.turn(-90);
        pen.move(40);
        pen.turn(-90);
        pen.move(10);
        pen.down();
        for(int i = 0; i<=11; i++){
            drawCircle(pen,.2);
        }
        //walkway 
        pen.up();
        pen.setDirection(0);
        pen.move(10);
        //right side
        pen.setDirection(270);
        pen.move(20);
        pen.down();
        pen.setDirection(315);
        pen.move(100);
        //go back up
        pen.turn(180);
        pen.move(100);
        pen.setDirection(180);
        pen.move(50);
        //walkway left side
        pen.setDirection(225);
        pen.move(100);
        //go to draw bushes
        pen.turn(180);
        pen.move(100);
        pen.setDirection(90);
        pen.move(20);
        pen.setDirection(180);
        pen.move(10);
        //draw bushes
        for(int i = 0; i<= 7; i ++){
            for(int k = 0; k <= 10; k++){
                pen.turn(180);
                drawCircle(pen, .2);
                pen.move(10);
            }
            pen.setDirection(153);
            pen.move(10);
        }
        //draw pool
        pen.up();
        pen.setDirection(270);
        pen.move(50);
        pen.down();
        pen.setDirection(225);
        for(int k = 0; k <= 4; k++){
            pen.move(100);
            pen.turn(90);
            }
        pen.up();
        pen.move(15);
        pen.turn(90);
        pen.move(20);
        pen.turn(-90);
        pen.down();
        pen.setDirection(0);
        //draw ripples
        for (int j = 0; j <= 3; j++){
            for (int x = 0; x <= 3; x++){
                pen.move(10);
                pen.turn(90);
                pen.move(10);
                pen.turn(-90);
            }
            pen.up();
            pen.turn(-45);
            pen.move(20);
            pen.turn(-90);
            pen.move(56);
            pen.turn(135);
            pen.down();
        }
        //set to draw trees
        pen.up();
        pen.setDirection(0);
        pen.move(400);
        pen.turn(90);
        pen.move(155);
        pen.down();
        //draw trees
        for(int i = 0; i <=3; i ++){
            pen.move(100);
            //leaves
            for(int k = 0; k <= 10; k++){
                pen.turn(180);
                drawCircle(pen, .2);
                pen.move(10);
            }
            pen.up();
            pen.setDirection(270);
            pen.move(31);
            pen.down();
            pen.move(90);
            pen.turn(90);
            pen.move(15);
            pen.up();
            pen.move(85);
            pen.turn(90);
            pen.down();
        } 
        //set to draw clouds
        pen.up();
        pen.setDirection(180);
        pen.move(350);
        pen.setDirection(90);
        pen.move(300);
        pen.down();
        //draw cloud
        for(int k = 0; k <= 10; k++){
                pen.turn(180);
                drawCircle(pen, .5);
                pen.move(10);
            }
    }
    
        public static void drawCircle(StandardPen pen, double x){
        for(int i = 0; i < 75; i++){
            double side = x * 3.14 *50/120;
            pen.move(side);
            pen.turn(3);
        }
    }
}