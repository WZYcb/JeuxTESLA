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

public class InterfaceGameOver extends JFrame {

	private JPanel contentPane;
	private JTextField txtGameOver;
	private JPanel panel;

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
		
		JButton btnNewButton = new JButton("Retour Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicRetourMenu();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		
		txtGameOver = new JTextField();
		txtGameOver.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtGameOver.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		txtGameOver.setSelectedTextColor(Color.GRAY);
		txtGameOver.setSelectionColor(Color.RED);
		txtGameOver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 44));
		txtGameOver.setBackground(Color.BLACK);
		txtGameOver.setForeground(Color.GRAY);
		txtGameOver.setText("GAME OVER");
		txtGameOver.setColumns(10);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(btnNewButton);
		panel.add(txtGameOver);
	}

	public void clicRetourMenu() {
		InterfaceNiveaux menuNiveaux = new InterfaceNiveaux();// créer la frame du menu avec les niveaux
		menuNiveaux.setVisible(true);// l'ouvrir
		this.dispose();//ferme la frame
	}
}