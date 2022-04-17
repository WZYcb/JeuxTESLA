package interfaceGraphiqueTesla;
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
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;

public class InterfaceGameOver extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JButton btnNewButton;
	private JPanel panel_2;

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
		
		panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setForeground(Color.GRAY);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		
		panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.GRAY);
		panel.add(panel_1, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("GAME OVER");
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            lblNewLabel.setFont(font.deriveFont( Font.BOLD, 30));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		lblNewLabel.setForeground(Color.RED);
		panel_1.add(lblNewLabel);
		
		panel_2 = new JPanelImage("tesla_crash.jpg");
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.setOpaque(false);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		panel.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("Retour Menu");
		btnNewButton.setIcon(null);
		btnNewButton.setToolTipText("");
		btnNewButton.setOpaque(false);
		try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Tesla.ttf"));
            btnNewButton.setFont(font.deriveFont( Font.BOLD, 13));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }
		btnNewButton.setForeground(Color.BLACK);
		//enlever la zone de contenu
		btnNewButton.setContentAreaFilled(false);
		//enlever la bordure
		btnNewButton.setBorderPainted(false);
		panel_3.add(btnNewButton);
	}
}