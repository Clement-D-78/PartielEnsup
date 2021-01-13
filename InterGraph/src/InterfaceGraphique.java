import java.awt.event.ActionEvent;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.*;


public class InterfaceGraphique extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* Construction de l'interface graphique */
    public InterfaceGraphique() {
        super( "Logiciel Partiel" );
        this.setSize(600,400);
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        
        // Construction et injection de la barre de menu
        this.setJMenuBar( this.createMenuBar() );
    }


    /* Methode de construction de la barre de menu */
    private JMenuBar createMenuBar() {

        // La barre de menu à proprement parler
        JMenuBar menuBar = new JMenuBar();

        // Définition du menu déroulant "File" et de son contenu
        JMenu mnuFile = new JMenu("Menu");
        
        Rond rond = new Rond();

        JMenuItem mnuNewEtudiant = new JMenuItem( "Créer un étudiant");
       // mnuNewFile.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK) );
        mnuFile.add(mnuNewEtudiant);

        mnuFile.addSeparator();

        JMenuItem mnuAssoEtudiant = new JMenuItem( "Associer un cours à un étudiant" );
        mnuFile.add(mnuAssoEtudiant);
        
        mnuFile.addSeparator();

        JMenuItem mnuLireEtudiant = new JMenuItem( "Lire les informations d'un étudiant" );
        mnuFile.add(mnuLireEtudiant);
        
        mnuFile.addSeparator();

        JMenuItem mnuModifEtudiant = new JMenuItem( "Modifier les informations d'un étudiant" );
        mnuFile.add(mnuModifEtudiant);

        mnuFile.addSeparator();

        JMenuItem mnuSupprEtudiant = new JMenuItem( "Supprimer un étudiant" );
        mnuFile.add(mnuSupprEtudiant);
        
        mnuFile.addSeparator();
        
        JMenuItem mnulistEtudiant = new JMenuItem( "Lister l'ensemble des étudiants de l'école" );
        mnuFile.add(mnulistEtudiant);
        
        JButton mnuLogin = new JButton("Connexion");
        mnuLogin.addActionListener( this::mnuNewListener );
        
        menuBar.add(mnuFile);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(rond);
        menuBar.add(mnuLogin);
        
        return menuBar;
    }

    public void mnuNewListener( ActionEvent event ) {
        Connexion con1 = new Connexion();
        con1.connexion();
    }
   
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        InterfaceGraphique frame = new InterfaceGraphique();
        frame.setVisible(true);
        
    }
}