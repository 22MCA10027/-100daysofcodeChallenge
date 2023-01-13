import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginScreen
 {
public static void main(String[] args)
{
JFrame frame=new JFrame("Login Screen"); 
JLabel label = new JLabel();
label.setBounds(20,150, 200,50);  
final JPasswordField value = new JPasswordField();
value.setBounds(100,75,100,30);
JLabel userNameLabel=new JLabel("User Name:");
userNameLabel.setBounds(20,20, 80,30);
JLabel paswordLabel=new JLabel("Password:");
paswordLabel.setBounds(20,75, 80,30);
JButton loginButton = new JButton("Login Here");
loginButton.setBounds(100,120, 80,30);
final JTextField text = new JTextField();
text.setBounds(100,20, 100,30);
frame.add(value);  
frame.add(userNameLabel); 
frame.add(label);
frame.add(paswordLabel);
frame.add(loginButton); 
frame.add(text);  
frame.setSize(300,300);
frame.setLayout(null);   
frame.setVisible(true);  
loginButton.addActionListener(new ActionListener() 
                              {  
public void actionPerformed(ActionEvent e)
 {
String userNameDisplay = "You are " + text.getText();
label.setText(userNameDisplay);    
}
});
}
}
