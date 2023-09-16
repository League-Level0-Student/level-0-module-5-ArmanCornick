package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Whar {
public static void main(String[] args) {	
Robot rob = new Robot();	
rob.setSpeed(130123012);
drawSquare(Color.red,rob);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

static void drawSquare(Color color, Robot r) {	
	r.penDown();
	r.setPenColor(color);
	for(int i=0;i<4;i++) {
	r.move(50);
	r.turn(90);
	}
}
}
