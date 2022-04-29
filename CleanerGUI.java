import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CleanerGUI {

	private static JFrame frame= new JFrame();
	private JPanel panel= new JPanel();
	private Boolean OnorOff=false;
	public CleanerGUI() {
		
	}
			public void Create() {
				JFrame frame = new JFrame();
				
				  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				  frame.setSize(100, 200);
				  frame.setFocusable(true);

				  JPanel panel = new JPanel();
				  panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
				  JLabel text = new JLabel();
				  JLabel off = new JLabel();
				  ImageIcon img = new ImageIcon("C:\\Users\\vahet\\OneDrive\\Desktop\\everything/Blitzcrank_Render.png");
		          frame.setIconImage(img.getImage());		   
				
		          panel.add(text);		
		          text.setText("Game Title");
				  frame.add(panel);
				
				  JButton button2 = new JButton("Start");
				  panel.add(button2);
				  button2.addActionListener (new Start());
				  
				  JButton button1 = new JButton("Settings "); 
				  button1.setPreferredSize(new Dimension(5300, 100));
				  panel.add(button1);
				  button1.addActionListener (new Settings());
				  
				
				
				frame.setVisible(true);
			}
			  public static class Start implements ActionListener {        
				  public void actionPerformed (ActionEvent e) {     
				    JFrame frame3 = new JFrame("Click to Start");
				    frame3.setVisible(true);
				    frame3.setSize(200,200);

				    JLabel label = new JLabel("Welcome to the Junglw");
				    JPanel panel = new JPanel(new GridLayout(1,4,4,4));
				    frame3.add(panel);
				    panel.add(label);
				    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				  }
			  }
			  public static class Settings implements ActionListener {        
				  public void actionPerformed (ActionEvent e) {     
				    JFrame frame3 = new JFrame("Click to Start");
				    frame3.setVisible(true);
				    frame3.setSize(200,200);

				    JLabel label = new JLabel("Welcome to the Junglw");
				    JPanel panel = new JPanel();
				    frame3.add(panel);
				    panel.add(label);
				  }
			  }
			public boolean IsthecodeOn() {
				return OnorOff;
			}

	
		
	}

