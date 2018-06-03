package extra;
import static javax.swing.JOptionPane.*;
public class SecretMessage {
public static void main(String[] args) {
String password ="yolo";
	String message =showInputDialog( "what's the secret message");
String answer=showInputDialog("enter password to see secret message");
if (answer.equalsIgnoreCase(password) ) {
	showMessageDialog(null, message );
	
} else {
showMessageDialog(null, "INTRUDER!");
}
}
	

}
