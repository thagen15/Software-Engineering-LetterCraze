package player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import player.view.LevelSelect;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		initComponents();
		createEvents();

	}

	private void createEvents() {
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				LevelSelect level = new LevelSelect();
				level.setVisible(true);
				dispose();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
	}

	private void initComponents() {
		setResizable(false);
		setTitle("Letter Craze");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Level Select");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(326, 175, 355, 61);
		contentPane.add(btnNewButton);
		
		button = new JButton("Quit Game"
				+ "");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setBounds(326, 247, 355, 61);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/images/BackgroundTitle.gif")));
		lblNewLabel.setBounds(0, 0, 994, 541);
		contentPane.add(lblNewLabel);
	}
}
