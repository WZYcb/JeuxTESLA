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
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import calcul.Niveau;

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
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class InterfaceNiveaux extends JFrame {
	public int a;
	
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-406,209
	 */
	private final JTextArea txtNiveauxDeJeu;


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
		
		
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            JLabel lblNewLabel = new JLabel("TESLA INTERGALACTIQUE");
    		lblNewLabel.setForeground(Color.RED);
    		lblNewLabel.setFont(font.deriveFont( Font.BOLD, 24));
    		panelTitre.add(lblNewLabel);
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		
		JPanel grilleBoutonsNiveaux = new JPanel();
		grilleBoutonsNiveaux.setForeground(Color.DARK_GRAY);
		grilleBoutonsNiveaux.setOpaque(false);
		panelImageFond.add(grilleBoutonsNiveaux, BorderLayout.CENTER);
		
		
		grilleBoutonsNiveaux.setLayout(new BoxLayout(grilleBoutonsNiveaux, BoxLayout.Y_AXIS));
		
		JPanel niveaux_1_2_3 = new JPanel();
		niveaux_1_2_3.setOpaque(false);
		grilleBoutonsNiveaux.add(niveaux_1_2_3);
		
		JButton btnNewButton = new JButton("Niveau 1");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_1_2_3.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Niveau 2");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_2.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_1_2_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Niveau 3");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_3.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_1_2_3.add(btnNewButton_3);
		
		JPanel niveaux_4_5_6 = new JPanel();
		niveaux_4_5_6.setOpaque(false);
		grilleBoutonsNiveaux.add(niveaux_4_5_6);
		
		JButton btnNewButton_4 = new JButton("Niveau 4");
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_4.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_4_5_6.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Niveau 5");
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_5.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_4_5_6.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Niveau 6");
		btnNewButton_6.setForeground(Color.RED);
		btnNewButton_6.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_6.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_4_5_6.add(btnNewButton_6);
		
		JPanel niveaux_7_8_9 = new JPanel();
		niveaux_7_8_9.setOpaque(false);
		grilleBoutonsNiveaux.add(niveaux_7_8_9);
		
		JButton btnNewButton_7 = new JButton("Niveau 7");
		btnNewButton_7.setForeground(Color.RED);
		btnNewButton_7.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_7.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_7_8_9.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Niveau 8");
		btnNewButton_8.setForeground(Color.RED);
		btnNewButton_8.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_8.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_7_8_9.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Niveau 9");
		btnNewButton_9.setForeground(Color.RED);
		btnNewButton_9.setBackground(Color.GRAY);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton_9.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		niveaux_7_8_9.add(btnNewButton_9);
		
		JProgressBar avanceeNiveaux = new JProgressBar();
		grilleBoutonsNiveaux.add(avanceeNiveaux);
		
	}
	
		
	
	
	
}
