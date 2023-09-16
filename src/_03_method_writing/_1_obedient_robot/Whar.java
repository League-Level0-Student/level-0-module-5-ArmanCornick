package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Whar {
public static void main(String[] args) {	
Robot rob = new Robot();	
rob.setSpeed(130123012);
String color = JOptionPane.showInputDialog("shape?");
String shape = JOptionPane.showInputDialog("color for shape (red blue green and red)");
if(shape.equals("red")) {
if((color.equals("square"))) {
drawSquare(Color.red,rob);	
}
if(color.equals("traingle")) {
drawTriangle(Color.red,rob);
}
}

	
	
	
				
	
	
	
	
	
	
	
	
	
	
}

static void drawSquare(Color color, Robot r) {	
	r.penDown();
	r.setPenColor(color);
	for(int i=0;i<4;i++) {
	r.move(50);
	r.turn(90);
	}
}
static void drawTriangle(Color color, Robot r) {	
	r.penDown();
	r.setPenColor(color);
	for(int i=0;i<3;i++) {
	r.move(100);
	r.turn(120);
	}
}
}
