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
		contentPane = new JPanelImage("fond_jeu_tesla.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelNorth = new JPanel();
		panelNorth.setOpaque(false);
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		JLabel lblNewLabel = new JLabel("FELICITATIONS !!!");
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            lblNewLabel.setFont(font.deriveFont( Font.BOLD, 34));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.GRAY);
		panelNorth.add(lblNewLabel);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setOpaque(false);
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Retour Menu");
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		panelSouth.add(btnNewButton);
		
		JPanel panelCenter = new JPanelImage("elon_musk_thumbsup.png");
		panelCenter.setOpaque(false);
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		
		
		
		
	}
	

}
