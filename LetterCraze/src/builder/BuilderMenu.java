package builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class BuilderMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderMenu frame = new BuilderMenu();
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
	public BuilderMenu() {
		setResizable(false);
		setTitle("Letter Craze Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPuzzle = new JButton("Puzzle");
		btnPuzzle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PuzzleBuilder frame = new PuzzleBuilder();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPuzzle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPuzzle.setBounds(235, 227, 190, 32);
		contentPane.add(btnPuzzle);
		
		JButton btnLightning = new JButton("Lightning");
		btnLightning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LightningBuilder frame = new LightningBuilder();
				frame.setVisible(true);
			}
		});
		
		JLabel lblEditAnExisting = new JLabel("or Edit an Existing Level:");
		lblEditAnExisting.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEditAnExisting.setBounds(580, 203, 190, 14);
		contentPane.add(lblEditAnExisting);
		btnLightning.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLightning.setBounds(235, 270, 190, 32);
		contentPane.add(btnLightning);
		
		JButton btnTheme = new JButton("Theme");
		btnTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemeBuilder frame = new ThemeBuilder();
				frame.setVisible(true);
			}
		});
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Hourglass [P]", "Potatoes [T]", "5 Seconds One Word [L]"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(580, 227, 190, 118);
		contentPane.add(list);
		btnTheme.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTheme.setBounds(235, 313, 190, 32);
		contentPane.add(btnTheme);
		
		JLabel lblLevelBuilder = new JLabel("Level Builder");
		lblLevelBuilder.setFont(new Font("Gill Sans MT", Font.BOLD, 30));
		lblLevelBuilder.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelBuilder.setBounds(305, 136, 389, 43);
		contentPane.add(lblLevelBuilder);
		
		JLabel lblSelectTheType = new JLabel("Select the type of level you would like to create:");
		lblSelectTheType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelectTheType.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectTheType.setBounds(186, 202, 294, 14);
		contentPane.add(lblSelectTheType);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(BuilderMenu.class.getResource("/images/BackgroundTitle.gif")));
		label.setBounds(0, 0, 994, 541);
		contentPane.add(label);
	}
}
