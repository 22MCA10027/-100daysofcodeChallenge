import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
public class BorderLayoutDemo
{
public static void main(String[] args)
{
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame fj = new JFrame("Demonstration of Border Layout");
fj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton jbtn1 = new JButton("UP");
JButton jbtn2 = new JButton("DOWN");
JButton jbtn3 = new JButton("LEFT");
JButton jbtn4 = new JButton("RIGHT");
JButton jbtn5 = new JButton("MIDDLE");
JPanel pnl = new JPanel();
pnl.setLayout(new BorderLayout());
pnl.add(jbtn1, BorderLayout.NORTH);
pnl.add(jbtn2, BorderLayout.SOUTH);
pnl.add(jbtn3, BorderLayout.WEST);
pnl.add(jbtn4, BorderLayout.EAST);
pnl.add(jbtn5, BorderLayout.CENTER);
fj.add(pnl);
fj.pack();
fj.setVisible(true);
}
}
