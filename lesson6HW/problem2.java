package lesson6HW;

	import javax.swing.JButton;
	 import javax.swing.JFrame;
	 import javax.swing.JOptionPane; 
	 
	import java.awt.*;
	 import java.awt.event.ActionEvent; 
	import java.awt.event.ActionListener; 
	 
	public class problem2{ 
	   public static void main(String[] args) { 
	  JFrame frame = new JFrame("Rainbow Color Frame");   
	   frame.setSize(650, 250);   
	frame.setLocation(400, 350);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 
	  frame.setLayout(new FlowLayout(FlowLayout.LEFT));  
	    JButton btnRed = new JButton();
	   btnRed.setPreferredSize(new Dimension(50, 50));
	   btnRed.setBackground(Color.GREEN);   
	frame.add(btnRed);
	   JButton btnOrange = new JButton(); 
	  btnOrange.setPreferredSize(new Dimension(50, 50));
	   btnOrange.setBackground(Color.BLUE);
	   frame.add(btnOrange); 
	 
	  JButton btnGreen = new JButton(); 
	  btnGreen.setPreferredSize(new Dimension(50, 50));
	   btnGreen.setBackground(Color.RED);
	   frame.add(btnGreen);    
	     JButton btnBlue = new JButton();  
	 btnBlue.setPreferredSize(new Dimension(50, 50));   
	btnBlue.setBackground(Color.BLUE);
	   frame.add(btnBlue);    
	  JButton btnYellow = new JButton(); 
	  btnYellow.setPreferredSize(new Dimension(50, 50));
	   btnYellow.setBackground(Color.BLUE);
	   frame.add(btnYellow);  
	    JButton btnIndigo = new JButton();  
	 btnIndigo.setPreferredSize(new Dimension(50, 50));
	   btnIndigo.setBackground(new Color(70, 0, 120));
	   frame.add(btnIndigo); 
	     JButton btnViolet = new JButton();  
	 btnViolet.setPreferredSize(new Dimension(50, 50));
	   btnViolet.setBackground(new Color(140, 45, 225));
	   frame.add(btnViolet);
	         btnRed.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) { 
	    JOptionPane.showMessageDialog(null, "Red signifies passion, vitality, enthusiasm and security", "Color Meaning", JOptionPane.INFORMATION_MESSAGE); 
	   }
	   });    
	 
	    btnOrange.addActionListener(new ActionListener() {  
	  public void actionPerformed(ActionEvent e) {    
	 JOptionPane.showMessageDialog(null, " It is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
	         } 
	  });    
	  btnGreen.addActionListener(new ActionListener() {    
	public void actionPerformed(ActionEvent e) {
	     JOptionPane.showMessageDialog(null, "denotes fertility, growth, balance, health and wealth", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
	    }
	   }); 
	     btnBlue.addActionListener(new ActionListener() { 
	   public void actionPerformed(ActionEvent e) {     
	JOptionPane.showMessageDialog(null, "Spirituality and Divinity", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);  
	  }   
	});      
	btnYellow.addActionListener(new ActionListener() {   
	 public void actionPerformed(ActionEvent e) {
	     JOptionPane.showMessageDialog(null, "It represents clarity of thought, wisdom, orderliness and energy", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);   
	 }
	   }); 
	        btnIndigo.addActionListener(new ActionListener() { 
	   public void actionPerformed(ActionEvent e) {  
	   JOptionPane.showMessageDialog(null, "used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);    
	}
	   });
	         btnViolet.addActionListener(new ActionListener() {   
	 public void actionPerformed(ActionEvent e) {
	     JOptionPane.showMessageDialog(null, "Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);    
	}
	   });
	      frame.setVisible(true);
	  }
	 
	 
	} 

	


