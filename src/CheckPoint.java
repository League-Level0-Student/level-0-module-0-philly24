
import org.jointheleague.graphical.robot.Robot;
import static javax.swing.JOptionPane.*;
public class CheckPoint {
public static void main(String[] args) {
	String answer = showInputDialog("what is your favorite color");
	showMessageDialog(null, answer+ " is my favoirte color too");

	Robot r2d2 = new Robot(); 
	for (int i = 0; i < 3; i++) {
		r2d2.penDown();
		r2d2.setSpeed(1000000);
		r2d2.move(200);
		r2d2.penDown();
		r2d2.setSpeed(1000000);

		r2d2.turn(120);
	}
	
}

}

