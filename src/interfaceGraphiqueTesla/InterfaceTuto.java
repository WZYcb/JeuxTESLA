package interfaceGraphiqueTesla;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class InterfaceTuto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceTuto frame = new InterfaceTuto();
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
	public InterfaceTuto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		
		JPanel panelTitre = new JPanel();
		panelTitre.setForeground(Color.WHITE);
		contentPane.add(panelTitre, BorderLayout.NORTH);
		
		JLabel lblTitre = new JLabel("Instructions");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            lblTitre.setFont(font.deriveFont( Font.BOLD, 28));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		lblTitre.setForeground(Color.RED);
		panelTitre.add(lblTitre);
		
		JPanel panelTexte = new JPanel();
		panelTexte.setForeground(Color.WHITE);
		contentPane.add(panelTexte, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setOpaque(false);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            textArea.setFont(font.deriveFont( Font.BOLD, 20));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		textArea.setForeground(Color.BLACK);
		textArea.setText("Salut Starman, et bienvenue chez UberSpaceEats,\r\n"
				+ "le nouveau service de livraison de pizza interplanétaire !\r\n"
				+ "Tu dois livrer ta pizza sur la planète bleue (en bas à droite)\r\n"
				+ "Attention, la pizza ne doit pas arriver froide, fait attention\r\n"
				+ "à respecter le délai de livraison !\r\n"
				+ "Prends gardes aux obstacles sur le chemin, les trous noirs attirent\r\n"
				+ "ta voiture et les trous blancs la repousse.\r\n"
				+ "De plus, les asteroides traversent l'espace et peuvent te \r\n"
				+ "fracasser à tout moment");
		panelTexte.add(textArea);
	}

}
