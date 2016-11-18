package LetterCrazeWindowBuilder.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LevelSelect extends JFrame {

	private JPanel contentPane;
	private JButton btnLevel;

	/**
	 * Launch the application.
	 */
	public static void Levels() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelSelect frame = new LevelSelect();
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
	public LevelSelect() {
		setTitle("Letter Craze");
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLevel = new JButton("Level 1");
		btnLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblHigh_2 = new JLabel("High: 5401");
		lblHigh_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHigh_2.setBounds(463, 260, 80, 14);
		contentPane.add(lblHigh_2);
		
		JLabel lblHigh_1 = new JLabel("High: 11312");
		lblHigh_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHigh_1.setBounds(361, 260, 80, 14);
		contentPane.add(lblHigh_1);
		
		JLabel lblHigh = new JLabel("High: 7556");
		lblHigh.setHorizontalAlignment(SwingConstants.CENTER);
		lblHigh.setBounds(259, 260, 80, 14);
		contentPane.add(lblHigh);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_29.setBounds(463, 277, 80, 80);
		contentPane.add(label_29);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_16.setBounds(667, 155, 80, 80);
		contentPane.add(label_16);
		
		JLabel label_33 = new JLabel("");
		label_33.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_33.setBounds(361, 403, 80, 80);
		contentPane.add(label_33);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_17.setBounds(259, 277, 80, 80);
		contentPane.add(label_17);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_28.setBounds(361, 277, 80, 80);
		contentPane.add(label_28);
		
		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_35.setBounds(565, 403, 80, 80);
		contentPane.add(label_35);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_15.setBounds(565, 155, 80, 80);
		contentPane.add(label_15);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_32.setBounds(259, 403, 80, 80);
		contentPane.add(label_32);
		
		JLabel label_36 = new JLabel("");
		label_36.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_36.setBounds(667, 403, 80, 80);
		contentPane.add(label_36);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_30.setBounds(565, 277, 80, 80);
		contentPane.add(label_30);
		
		JLabel label_34 = new JLabel("");
		label_34.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_34.setBounds(463, 403, 80, 80);
		contentPane.add(label_34);
		
		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/lock.gif")));
		label_31.setBounds(667, 277, 80, 80);
		contentPane.add(label_31);
		
		btnLevel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnLevel.setBounds(259, 155, 80, 80);
		contentPane.add(btnLevel);
		
		JButton button = new JButton("Level 2");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LightningLevelTemplate temp = new LightningLevelTemplate();
				temp.setVisible(true);
				dispose();
			}
		});
		button.setBounds(361, 155, 80, 80);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Level 3");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ThemeLevelTemplate temp = new ThemeLevelTemplate();
				temp.setVisible(true);
				dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.setBounds(463, 155, 80, 80);
		contentPane.add(button_1);
		
		/*
		JButton button_2 = new JButton("Level 4");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBounds(565, 155, 80, 80);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Level 5");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(667, 155, 80, 80);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Level 6");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_4.setBounds(259, 277, 80, 80);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Level 7");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_5.setBounds(361, 277, 80, 80);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Level 8");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_6.setBounds(463, 277, 80, 80);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Level 9");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_7.setBounds(565, 277, 80, 80);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Level 10");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_8.setBounds(667, 277, 80, 80);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("Level 11");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_9.setBounds(259, 403, 80, 80);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("Level 12");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_10.setBounds(361, 403, 80, 80);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("Level 13");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_11.setBounds(463, 403, 80, 80);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("Level 14");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_12.setBounds(565, 403, 80, 80);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("Level 15");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_13.setBounds(667, 403, 80, 80);
		contentPane.add(button_13);
		
		*/
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/twoStars.gif")));
		lblNewLabel_1.setBounds(259, 234, 80, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label.setBounds(361, 234, 80, 30);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/oneStars.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_1.setBounds(463, 234, 80, 30);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_2.setBounds(565, 234, 80, 30);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_3.setBounds(667, 234, 80, 30);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_4.setBounds(259, 356, 80, 30);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_5.setBounds(361, 356, 80, 30);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_6.setBounds(463, 356, 80, 30);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_7.setBounds(565, 356, 80, 30);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_8.setBounds(667, 356, 80, 30);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_9.setBounds(259, 482, 80, 30);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_10.setBounds(361, 482, 80, 30);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_11.setBounds(463, 482, 80, 30);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_12.setBounds(565, 482, 80, 30);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/StarsBlank.gif")));
		label.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/Stars.gif")));
		label_13.setBounds(667, 482, 80, 30);
		contentPane.add(label_13);
		
		JButton btnCustomLevel = new JButton("Custom Level");
		btnCustomLevel.setBounds(121, 184, 114, 23);
		contentPane.add(btnCustomLevel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LevelSelect.class.getResource("/LetterCrazeWindowBuilder/resources/BackgroundTitle.gif")));
		lblNewLabel.setBounds(0, 0, 994, 531);
		contentPane.add(lblNewLabel);
		
	}

	private void createEvents() {
		btnLevel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				LevelTemplate temp = new LevelTemplate();
				temp.setVisible(true);
				dispose();
			}
		});
		
	}
}
