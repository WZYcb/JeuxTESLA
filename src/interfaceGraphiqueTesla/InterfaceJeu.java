package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calcul.Simulateur;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color; 
import java.awt.Dimension;

public class InterfaceJeu extends JFrame {

	private JPanel contentPane;
	private Simulateur simul;

    private int niveau;

	private JProgressBar niveauBatterie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceJeu frame = new InterfaceJeu(1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public InterfaceJeu(int niveau) {
		this.setNiveau(niveau);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel affichageJeu = new JPanelImage("fond_jeu_tesla.jpg");
		contentPane.add(affichageJeu, BorderLayout.CENTER);
		affichageJeu.setLayout(new BorderLayout(0, 0));
		
		JPanel infosEnJeu = new JPanel();
		infosEnJeu.setOpaque(false);
		infosEnJeu.setToolTipText("");
		affichageJeu.add(infosEnJeu, BorderLayout.NORTH);

		JPanel panelLogoTesla = new JPanelImage("logo_tesla.png");
		panelLogoTesla.setOpaque(false);
		infosEnJeu.add(panelLogoTesla);
		
	   JButton btnAbandonner = new JButton("Abandonner");
	   try {
           Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
           btnAbandonner.setFont(font.deriveFont( Font.BOLD, 13));
       } catch (FontFormatException | IOException ex) {
           ex.printStackTrace();
       }
	   btnAbandonner.setForeground(Color.RED);
	   btnAbandonner.setBackground(null);
	   btnAbandonner.setOpaque(false);
	   btnAbandonner.setContentAreaFilled(false);
	   btnAbandonner.setBorderPainted(false);
	   btnAbandonner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicAbandonner();
			}
		});
		infosEnJeu.add(btnAbandonner);
		
		JLabel lblTempsRestant = new JLabel("Temps restant :"); // modifier avec un retour du temps 閏oule de l'algorithmique
		try {
	           Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
	           lblTempsRestant.setFont(font.deriveFont( Font.BOLD, 13));
	       } catch (FontFormatException | IOException ex) {
	           ex.printStackTrace();
	       }
		lblTempsRestant.setForeground(Color.RED);
		infosEnJeu.add(lblTempsRestant);
		
		JPanel panelLogoBatterie = new JPanelImage("logo_batterie.png");
		panelLogoBatterie.setOpaque(false);
		infosEnJeu.add(panelLogoBatterie);
		
		niveauBatterie = new JProgressBar();
		niveauBatterie.setForeground(new Color(0, 128, 0));

		niveauBatterie.setValue(100); //関entuellement supprimer � l'int間ration
		if(niveauBatterie.getValue()>0) {// ajouter un retour du niveau de la batterie de l'algorithmique
			//perte progressive de batterie lorsqu'on d閜lace la voiture
			//gain instantan� de batterie lorsqu'on passe sur un supercharger
		}

		infosEnJeu.add(niveauBatterie);
		
		JPanel panelBonusActif = new JPanelImage("logo_bonus.png");
		panelBonusActif.setOpaque(false);
		if(true) { // condition � ajouter : savoir si bonus r閏up閞� r閏emment ou pas
			//panelBonusActif.setImage("logo_bonus.png");
		}
		infosEnJeu.add(panelBonusActif);
		
		JPanelDessin mapJeu = new JPanelDessin();
		mapJeu.setOpaque(false);
		affichageJeu.add(mapJeu, BorderLayout.CENTER);
		simul = new Simulateur(this,niveau);
		mapJeu.setSimul(simul);
		simul.start();

		
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(new MyDispatcher());
		
	}
	
	public void afficherNivBatterie() {
		if(simul!=null) {
			niveauBatterie.setValue(simul.getNiv().getTesla().getNivBatterie());
		} else {
			niveauBatterie.setValue(100);
		}
	}
    public void clicAbandonner() {

		InterfaceGameOver abandon = new InterfaceGameOver();// cr閑r la frame du menu avec les niveaux
	/*    this.setNiveauReussi(false);//indiquer que le niveau n'est pas r閡ssi car on retourne au menu avant

		InterfaceNiveaux menuNiveaux = new InterfaceNiveaux();// cr�er la frame du menu avec les niveaux   */

		abandon.setVisible(true);// l'ouvrir
		this.dispose();//ferme la frame
	}
	
	
	public void clicClavier(KeyEvent arg0) {
		// Valeur de la touche
		simul.setKey(arg0.getKeyCode());
		}
	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	private class MyDispatcher implements KeyEventDispatcher {
		@Override
		public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
		clicClavier(e);
		} else if (e.getID() == KeyEvent.KEY_RELEASED) {
		//System.out.println("RELEASED");
		} else if (e.getID() == KeyEvent.KEY_TYPED) {
		//System.out.println("TYPED");
		}
		return false;
		}

		}
		
		
}
