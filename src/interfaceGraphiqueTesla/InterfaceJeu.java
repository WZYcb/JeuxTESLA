package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class InterfaceJeu extends JFrame {

	private JPanel contentPane;
	private Simulateur simul;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceJeu frame = new InterfaceJeu();
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
	public InterfaceJeu() {
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
		
		JButton btnRetourMenu = new JButton("Retour Menu");
		btnRetourMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicRetourMenu();
			}
		});
		infosEnJeu.add(btnRetourMenu);
		
		JLabel lblTempsRestant = new JLabel("Temps restant : 00:00"); // modifier avec un retour du temps �coule de l'algorithmique
		lblTempsRestant.setForeground(new Color(255, 0, 0));
		infosEnJeu.add(lblTempsRestant);
		
		JPanel panelLogoBatterie = new JPanelImage("logo_batterie.png");
		panelLogoBatterie.setOpaque(false);
		infosEnJeu.add(panelLogoBatterie);
		
		JProgressBar niveauBatterie = new JProgressBar();
		niveauBatterie.setForeground(new Color(0, 128, 0));
		if(simul!=null) {
			niveauBatterie.setValue(simul.getNiv().getTesla().getNivBatterie());
		} else {
			niveauBatterie.setValue(100);
		}
		infosEnJeu.add(niveauBatterie);
		
		JPanel panelBonusActif = new JPanelImage("logo_bonus.png");
		panelBonusActif.setOpaque(false);
		if(true) { // condition � ajouter : savoir si bonus r�cup�r� r�cemment ou pas
			//panelBonusActif.setImage("logo_bonus.png");
		}
		infosEnJeu.add(panelBonusActif);
		
		JPanelDessin mapJeu = new JPanelDessin();
		mapJeu.setOpaque(false);
		affichageJeu.add(mapJeu, BorderLayout.CENTER);
		simul = new Simulateur(this);
		mapJeu.setSimul(simul);
		simul.start();

		
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(new MyDispatcher());
		
	}
	public void clicRetourMenu() {
		InterfaceNiveaux menuNiveaux = new InterfaceNiveaux();// cr�er la frame du menu avec les niveaux
		menuNiveaux.setVisible(true);// l'ouvrir
		this.dispose();//ferme la frame
	}
	
	
	public void clicClavier(KeyEvent arg0) {
		// Valeur de la touche
		simul.setKey(arg0.getKeyCode());
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
