import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Paint extends JFrame{
	int x = -5;
	int y = -5;
	JButton colorChooser; //Boutton qui permets de choisir la couleur du pinceau
	JColorChooser jc; // Roue de couleur
	Color c; //Couleur pour le pinceau
	Paint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null); //Centrer la fenetre
		colorChooser = new JButton("Choisir une couleur");
		colorChooser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c = JColorChooser.showDialog(null,"Choisis une couleur",Color.BLACK);
				}
				});
				addMouseMotionListener(new MouseMotionAdapter (){
					public void mouseDragged(MouseEvent e) {
						x = e.getX();
						y = e.getY();
						repaint();



					}

			});
				add(colorChooser,BorderLayout.NORTH);

				setVisible(true);
		}

			public void paint (Graphics g) {
				g.setColor(c);
				g.fillOval(x,y,4,4);
	   }

       public static void main(String[] args){
		   new Paint();
	   }
  }
