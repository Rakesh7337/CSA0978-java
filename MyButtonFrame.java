import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyButtonFrame extends JFrame implements ActionListener {
private JButton myButton;
private JLabel clickCountLabel;
private int clickCount = 0;
public MyButtonFrame() {
super("My Button App");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(300, 200);
myButton = new JButton("Click me!");
myButton.addActionListener(this);
clickCountLabel = new JLabel("Button has been clicked 0 times.");
add(myButton);
add(clickCountLabel, "South");
}
public void actionPerformed(ActionEvent event) {
clickCount++;
clickCountLabel.setText("Button has been clicked " + clickCount + " times.");
}
public static void main(String[] args) {
MyButtonFrame frame = new MyButtonFrame();
frame.setVisible(true);
}
}