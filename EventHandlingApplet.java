import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldApplet extends Action Listener{
Button btn;
public void init() {
btn = new Button("Click me!");
add(textField);
button.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
System.out.println("Button clicked!");
}
}