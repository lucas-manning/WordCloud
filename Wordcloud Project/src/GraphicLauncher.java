import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class GraphicLauncher extends Frame 
		implements ActionListener, WindowListener {

	private Label lblInput;
	private Button btnLaunch;
	private TextArea taInput;
	
	private String cloudInput;
	
	public GraphicLauncher() 
	{
		setLayout(new FlowLayout());
		
		lblInput = new Label("Enter your text");
		add(lblInput);
		
		taInput = new TextArea(5,65);
		taInput.setEditable(true);
		add(taInput);
		
		btnLaunch = new Button("Make Cloud");
		add(btnLaunch);
		
		btnLaunch.addActionListener(this);
		
		addWindowListener(this);
		
		setTitle("WordCloud Launcher");
		setSize(650,400);
		setVisible(true);
	}
	
	public String getText() {
		return cloudInput;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Creating WordCloud");
		
		cloudInput = taInput.getText();
		
		
		WordList wl = new WordList(" " + cloudInput + " ");
		
		wl.makeList();
		
		JFrame window = new JFrame();
		// Basic functions, make window available
		window.setSize(1980, 1045);
		window.setTitle("Stuff");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
		DrawComponent DC = new DrawComponent();
		
		DC.listInput(wl);
		
		window.add(DC);
		
	}
	
	@Override
	   public void windowClosing(WindowEvent evt) {
	      System.exit(0);  
	   }
	 
	  
	   @Override public void windowOpened(WindowEvent evt) { }
	   @Override public void windowClosed(WindowEvent evt) { }

	   @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
	   @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
	   @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
	   @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
	
}
