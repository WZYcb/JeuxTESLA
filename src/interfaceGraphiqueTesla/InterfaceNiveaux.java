package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfaceNiveaux extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-406,209
	 */
	private final JTextArea txtrNiveauxDeJeu = new JTextArea();
	/**
	 * @wbp.nonvisual location=114,-1
	 */
	private final JTextField txtNiveauxDeJeu = new JTextField();

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
		txtNiveauxDeJeu.setText("Niveaux de jeu");
		txtNiveauxDeJeu.setColumns(10);
		txtrNiveauxDeJeu.setText("Niveaux de jeu");
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
		GridBagLayout gbl_grilleBoutonsNiveaux = new GridBagLayout();
		gbl_grilleBoutonsNiveaux.columnWidths = new int[]{89, 89, 89, 89, 0};
		gbl_grilleBoutonsNiveaux.rowHeights = new int[]{98, 23, 0, 0, 0};
		gbl_grilleBoutonsNiveaux.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_grilleBoutonsNiveaux.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		grilleBoutonsNiveaux.setLayout(gbl_grilleBoutonsNiveaux);
		
		JButton btnNewButton_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		grilleBoutonsNiveaux.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1_1.gridx = 2;
		gbc_btnNewButton_1_1.gridy = 1;
		grilleBoutonsNiveaux.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1_2.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1_2.gridx = 3;
		gbc_btnNewButton_1_2.gridy = 1;
		grilleBoutonsNiveaux.add(btnNewButton_1_2, gbc_btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 2;
		grilleBoutonsNiveaux.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 2;
		gbc_btnNewButton_5.gridy = 2;
		grilleBoutonsNiveaux.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_7.gridx = 3;
		gbc_btnNewButton_7.gridy = 2;
		grilleBoutonsNiveaux.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_8.gridx = 1;
		gbc_btnNewButton_8.gridy = 3;
		grilleBoutonsNiveaux.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_10.gridx = 2;
		gbc_btnNewButton_10.gridy = 3;
		grilleBoutonsNiveaux.add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton b = new JButton("New Button", new ImageIcon("Cadena.jpg"));
			}
		});
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.gridx = 3;
		gbc_btnNewButton_11.gridy = 3;
		grilleBoutonsNiveaux.add(btnNewButton_11, gbc_btnNewButton_11);
	}

}
