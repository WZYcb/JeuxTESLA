package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
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
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Retour Menu");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLACK);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicRetourMenu();
			}
		});
		
		JLabel lblNewLabel = new JLabel("FELICITATIONS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.YELLOW);
		panel.add(lblNewLabel);
	}
	public void clicRetourMenu() {
		InterfaceNiveaux menuNiveaux = new InterfaceNiveaux();// créer la frame du menu avec les niveaux
		menuNiveaux.setVisible(true);// l'ouvrir
		this.dispose();//ferme la frame 
}
}