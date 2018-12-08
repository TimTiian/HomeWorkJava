import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Chenliang Tian
 */

public class Main extends JFrame { 
  public Main(Object obj) { 
    super("Text Tester"); 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setBounds(100, 100, 250, 150);
    JPanel contentPane=new JPanel();
    this.setContentPane(contentPane);

    JPanel pane1=new JPanel();
    contentPane.add(pane1);
    JPanel pane2=new JPanel();
    contentPane.add(pane2);
	
    JLabel label1=new JLabel("FirstName：");
		
    JTextField textField1=new JTextField();
    textField1.setColumns(10);
    pane1.add(label1);
    pane1.add(textField1);
    JLabel label2=new JLabel("LastName：");
    JTextField textField2=new JTextField();
    textField2.setColumns(10);
    pane2.add(label2);
    pane2.add(textField2);
    
    textField1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 
        System.out.println("FirstName: " + textField1.getText()); 
      } 
    }); 
     textField2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 
        System.out.println("LastName: " + textField2.getText()); 
      } 
    }); 
    this.setVisible(true);
  } 
  
  public static void main(String[] args){
      Main m = new Main(new JavaBean());
  }
}
