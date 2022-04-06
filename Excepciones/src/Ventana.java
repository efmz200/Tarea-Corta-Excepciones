import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;

public class Ventana implements ActionListener{
	int comprobacion;
	JFrame ventana;
	JPanel panel;
	JButton FirstButton;
	JButton SecondButton;
	JButton ThirdButton;

    public Ventana() {
		comprobacion=0;
		ventana = new JFrame("Jueguito de Botones");
		ventana.setSize(300, 130);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		ventana.add(panel);
		placeComponents(panel);

		ventana.setVisible(true);
		
	}

	private void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Pistas: 3x5 - 10+10 - 36/4");
		userLabel.setBounds(50, 10, 150, 10);
		panel.add(userLabel);		

		FirstButton = new JButton("20");
		FirstButton.addActionListener(this);
		FirstButton.setBounds(10, 50, 80, 25);
		panel.add(FirstButton);
		
		SecondButton = new JButton("9");
		SecondButton.addActionListener(this);
		SecondButton.setBounds(95, 50, 80, 25);
		panel.add(SecondButton);

        ThirdButton = new JButton("15");
		ThirdButton.addActionListener(this);
		ThirdButton.setBounds(180, 50, 80, 25);		
		panel.add(ThirdButton);
	}
	@Override
    public void actionPerformed(ActionEvent e) {
        
        try{
			if (e.getSource().equals(FirstButton)){
				if(comprobacion==15){
					comprobacion+= 20;
									 
				}
				else{				
						JOptionPane.showMessageDialog(ventana, "Te equivocaste de orden, empieza de nuevo");
						comprobacion=0;
						throw new Exception("Metiste la pata");
					}
			}
			if (e.getSource().equals(SecondButton)){
				if(comprobacion==35){
					JOptionPane.showMessageDialog(ventana, "Felicidades, lo lograste!");
					comprobacion=0;		
				}
				else{					
					JOptionPane.showMessageDialog(ventana, "Te equivocaste de orden, empieza de nuevo");
					comprobacion=0;
					throw new Exception("Metiste la pata");
					}
			}
			if (e.getSource().equals(ThirdButton)){
				if(comprobacion==0){
					comprobacion+=15; 
				}
				else{					
					JOptionPane.showMessageDialog(ventana, "Te equivocaste de orden, empieza de nuevo");
					comprobacion=0;
					throw new Exception("Metiste la pata");
					}
				}
		}
		catch(Exception error){
			System.out.println(error);
		}		      
    }


}