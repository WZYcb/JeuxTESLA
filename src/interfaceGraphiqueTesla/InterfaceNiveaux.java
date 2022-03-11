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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class InterfaceNiveaux extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-406,209
	 */
	private final JTextArea txtNiveauxDeJeu;
	private JProgressBar progressBar;
	private JButton btnNewButton;

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
		txtNiveauxDeJeu = new JTextArea();
		txtNiveauxDeJeu.setText("Niveaux de jeu");
		txtNiveauxDeJeu.setColumns(10);
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
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		panelTitre.add(lblNewLabel);
		
		JPanel grilleBoutonsNiveaux = new JPanel();
		grilleBoutonsNiveaux.setForeground(Color.DARK_GRAY);
		grilleBoutonsNiveaux.setOpaque(false);
		panelImageFond.add(grilleBoutonsNiveaux, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		btnNewButton = new JButton("Niveau 1");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue()+100);
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Niveau 2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue()+100);
			}
		});
		btnNewButton_1_1.setForeground(Color.MAGENTA);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_1.setBackground(Color.GRAY);
		
		JButton btnNewButton_1_2 = new JButton("Niveau 3");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue()+50);
			}
		});
		btnNewButton_1_2.setForeground(Color.MAGENTA);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_2.setBackground(Color.GRAY);
		JButton btnNewButton_4 = new JButton("Niveau 4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue()+50);
			}
		});
		btnNewButton_4.setForeground(Color.MAGENTA);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBackground(Color.GRAY);
		JButton btnNewButton_5 = new JButton("Niveau 5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue()+50);
			}
		});
		btnNewButton_5.setForeground(Color.MAGENTA);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.setBackground(Color.GRAY);
		JButton btnNewButton_7 = new JButton("Niveau 6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue()+50);
			}
		});
		btnNewButton_7.setForeground(Color.MAGENTA);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_7.setBackground(Color.GRAY);
		JButton btnNewButton_8 = new JButton("Niveau 7");
		btnNewButton_8.setToolTipText("");
		btnNewButton_8.setForeground(Color.MAGENTA);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_8.setBackground(Color.GRAY);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicNiveau7();
			}
		});
		JButton btnNewButton_10 = new JButton("Niveau 8");
		btnNewButton_10.setForeground(Color.MAGENTA);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_10.setBackground(Color.GRAY);
		btnNewButton_10.setEnabled(false);
		JButton btnNewButton_11 = new JButton("Niveau 9");
		btnNewButton_11.setForeground(Color.MAGENTA);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton_11.setEnabled(false);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton b = new JButton("New Button", new ImageIcon("Cadena.jpg"));
			}
		});
		SpringLayout sl_grilleBoutonsNiveaux = new SpringLayout();
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_11, 0, SpringLayout.NORTH, btnNewButton_8);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, btnNewButton_11, 0, SpringLayout.WEST, btnNewButton_1_2);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.EAST, btnNewButton_11, -82, SpringLayout.EAST, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_10, 0, SpringLayout.NORTH, btnNewButton_8);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.EAST, btnNewButton_10, 0, SpringLayout.EAST, btnNewButton_1_1);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_7, 0, SpringLayout.NORTH, btnNewButton_4);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.EAST, btnNewButton_7, 0, SpringLayout.EAST, btnNewButton_1_2);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.SOUTH, btnNewButton_4, -104, SpringLayout.SOUTH, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_8, 19, SpringLayout.SOUTH, btnNewButton_4);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.EAST, btnNewButton_8, 0, SpringLayout.EAST, btnNewButton);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_5, 0, SpringLayout.NORTH, btnNewButton_4);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, btnNewButton_5, 0, SpringLayout.WEST, btnNewButton_1_1);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, btnNewButton_4, 0, SpringLayout.WEST, btnNewButton);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, btnNewButton_1_2, 253, SpringLayout.WEST, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.EAST, btnNewButton_1_1, -27, SpringLayout.WEST, btnNewButton_1_2);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_1_2, 0, SpringLayout.NORTH, btnNewButton);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton, 44, SpringLayout.NORTH, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, btnNewButton, 23, SpringLayout.WEST, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, panel, 11, SpringLayout.NORTH, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, panel, 8, SpringLayout.WEST, grilleBoutonsNiveaux);
		grilleBoutonsNiveaux.setLayout(sl_grilleBoutonsNiveaux);
		grilleBoutonsNiveaux.add(panel);
		grilleBoutonsNiveaux.add(btnNewButton);
		grilleBoutonsNiveaux.add(btnNewButton_1_1);
		grilleBoutonsNiveaux.add(btnNewButton_1_2);
		grilleBoutonsNiveaux.add(btnNewButton_4);
		grilleBoutonsNiveaux.add(btnNewButton_5);
		grilleBoutonsNiveaux.add(btnNewButton_7);
		grilleBoutonsNiveaux.add(btnNewButton_8);
		grilleBoutonsNiveaux.add(btnNewButton_10);
		grilleBoutonsNiveaux.add(btnNewButton_11);
		
		progressBar = new JProgressBar();
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, progressBar, 25, SpringLayout.SOUTH, btnNewButton_8);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, progressBar, 10, SpringLayout.WEST, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.SOUTH, progressBar, -10, SpringLayout.SOUTH, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.EAST, progressBar, -242, SpringLayout.EAST, grilleBoutonsNiveaux);
		progressBar.setForeground(Color.GREEN);
		grilleBoutonsNiveaux.add(progressBar);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = new JButton("Cliquer pour fermer!");
			}
		});
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, progressBar);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.WEST, btnNewButton_1, -111, SpringLayout.EAST, grilleBoutonsNiveaux);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setToolTipText("");
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -10, SpringLayout.SOUTH, grilleBoutonsNiveaux);
		sl_grilleBoutonsNiveaux.putConstraint(SpringLayout.EAST, btnNewButton_1, -10, SpringLayout.EAST, grilleBoutonsNiveaux);
		grilleBoutonsNiveaux.add(btnNewButton_1);
	}
	
	protected void clicNiveau7() {
		// TODO Auto-generated method stub
		progressBar.setValue(progressBar.getValue()+50);
	}
}
