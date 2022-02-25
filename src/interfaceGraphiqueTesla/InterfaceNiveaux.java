package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class InterfaceNiveaux extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceNiveaux frame = new InterfaceNiveaux();
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
	public InterfaceNiveaux() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelImageFond = new JPanelImage("fond_jeu_tesla.jpg");
		contentPane.add(panelImageFond, BorderLayout.CENTER);
		panelImageFond.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitre = new JPanel();
		panelTitre.setOpaque(false);
		panelImageFond.add(panelTitre, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Tesla Intergalactique");
		panelTitre.add(lblNewLabel);
		
		JPanel grilleBoutonsNiveaux = new JPanel();
		grilleBoutonsNiveaux.setOpaque(false);
		panelImageFond.add(grilleBoutonsNiveaux, BorderLayout.CENTER);
		grilleBoutonsNiveaux.setLayout(new GridLayout(1, 0, 0, 0));
	}

}
