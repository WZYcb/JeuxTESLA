import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaceGraphiqueTesla.InterfaceNiveaux;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class InterfaceGameOver extends JFrame {

	private JPanel contentPane;
	private JTextField txtGameOver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGameOver frame = new InterfaceGameOver();
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
	public InterfaceGameOver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setForeground(Color.GRAY);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Retour Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicRetourMenu();
			}
		});
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.RED);
		panel.add(btnNewButton);
		
		txtGameOver = new JTextField();
		txtGameOver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 46));
		txtGameOver.setBackground(Color.BLACK);
		txtGameOver.setForeground(Color.WHITE);
		txtGameOver.setText("GAME OVER");
		panel.add(txtGameOver);
		txtGameOver.setColumns(10);
	}

	public void clicRetourMenu() {
		InterfaceNiveaux menuNiveaux = new InterfaceNiveaux();// créer la frame du menu avec les niveaux
		menuNiveaux.setVisible(true);// l'ouvrir
		this.dispose();//ferme la frame
	}
}