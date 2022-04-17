package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class InterfaceNivReussi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceNivReussi frame = new InterfaceNivReussi();
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
	public InterfaceNivReussi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanelImage("fond_jeu_tesla.jpg");
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton btnNewButton = new JButton("Retour Menu");
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicRetourMenu();
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("FELICITATIONS !!!");
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            lblNewLabel.setFont(font.deriveFont( Font.BOLD, 34));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.GRAY);
		panel.add(lblNewLabel);
		
		
		
		
		
	}
	public void clicRetourMenu() {
		InterfaceNiveaux menuNiveaux = new InterfaceNiveaux();// créer la frame du menu avec les niveaux
		menuNiveaux.setVisible(true);// l'ouvrir
		this.dispose();//ferme la frame 
	}
	

}
