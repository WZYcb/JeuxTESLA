package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceJeu extends JFrame {

	private JPanel contentPane;

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
		
		JPanel affichageJeu = new JPanelImage();
		contentPane.add(affichageJeu, BorderLayout.CENTER);
		affichageJeu.setLayout(new BorderLayout(0, 0));
		
		JPanel InfosEnJeu = new JPanel();
		InfosEnJeu.setToolTipText("");
		contentPane.add(InfosEnJeu, BorderLayout.NORTH);
		
		JButton btnRetourMenu = new JButton("Retour au Menu");
		btnRetourMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicRetourMenu();
			}
		});
		InfosEnJeu.add(btnRetourMenu);
		
		JLabel lblTempsRestant = new JLabel("Temps restant : 00:00"); // modifier avec un retour du temps écoule de l'algorithmique
		InfosEnJeu.add(lblTempsRestant);
		
		JPanel panelLogoBatterie = new JPanelImage("logo_batterie.png");
		InfosEnJeu.add(panelLogoBatterie);
		
		JProgressBar niveauBatterie = new JProgressBar();
		niveauBatterie.setValue(100); //éventuellement supprimer à l'intégration
		// ajouter un retour du niveau de la batterie de l'algorithmique
		InfosEnJeu.add(niveauBatterie);
		
		JPanel panelBonusActif = new JPanel();
		InfosEnJeu.add(panelBonusActif);
	}
	public void clicRetourMenu() {
		InterfaceNiveaux menuNiveaux = new InterfaceNiveaux();// ouvrir la frame du menu avec les niveaux (ne marche pas)
		this.dispose();//ferme la frame
	}
}
