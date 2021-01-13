import java.awt.Container;

import javax.swing.*;

public class Connexion {

	public void connexion() {

		JFrame f = new JFrame("Connexion");
		f.setSize(300, 100);
		//JPanel pannel = new JPanel();
		
//		JTextField testfield1 = new JTextField(""); 
//		JTextField testfield2 = new JTextField("Mot de passe");
//		JButton button1 = new JButton("Valider");
//		
		        Container contentPane1 = f.getContentPane();
		        Container contentPane2 = f.getContentPane();
		        SpringLayout layout = new SpringLayout();
		        contentPane1.setLayout(layout);
		        contentPane2.setLayout(layout);
		        contentPane1.add(new JLabel("Label: "));
		        contentPane2.add(new JTextField("Text field", 15));
		        f.setVisible(true);
		    
	
		/*
		Font testfont = testfield1.getFont().deriveFont(Font.PLAIN, 15f);
		testfield1.getFont().deriveFont(Font.PLAIN, 15f);
        testfield1.setFont(testfont);
		*/
		
//		if (testfield1.getText().equals("admin") && testfield2.getText().equals("123")) {
//			JOptionPane.showMessageDialog(null, "Vous êtes connecté !");
//        }
//		else {
//			JOptionPane.showMessageDialog(null, "Vos identifiants sont incorrects !");
//		}
//		
//		
//		pannel.add(testfield1);
//		pannel.add(testfield2);
//		pannel.add(button1);
//		f.getContentPane().add(pannel);
//		f.setVisible(true);
}



}
