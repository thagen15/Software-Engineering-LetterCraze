package player.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class LightningLevelTemplate extends JFrame {

	private JPanel contentPane;
	private JButton btnExitLevel;

	/**
	 * Launch the application.
	 */
	public static void LightningLevelTemplate() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightningLevelTemplate frame = new LightningLevelTemplate();
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
	public LightningLevelTemplate() {
		
		initComponents();
		
		createEvents();
		
		
		
	}

	private void createEvents() {
		btnExitLevel.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				LevelSelect levelSelect = new LevelSelect();
				levelSelect.setVisible(true);
				dispose();
			}
		});
		
	}

	private void initComponents() {
		setTitle("Letter Craze");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(797, 217, 90, 90);
		label_3.setIcon(new ImageIcon(ThemeLevelTemplate.class.getResource("/images/starlevel.png")));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(797, 302, 90, 90);
		label_4.setIcon(new ImageIcon(ThemeLevelTemplate.class.getResource("/images/starlevel.png")));
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(797, 387, 90, 90);
		label_5.setIcon(new ImageIcon(ThemeLevelTemplate.class.getResource("/images/starlevel.png")));
		contentPane.add(label_5);
		
		
		JButton btnR = new JButton("R");
		btnR.setBounds(462, 86, 60, 60);
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(594, 86, 60, 60);
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnS);
		
		JButton button_3 = new JButton("L");
		button_3.setBounds(528, 86, 60, 60);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_3);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(661, 86, 60, 60);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnE);
		
		JButton button_6 = new JButton("K");
		button_6.setBounds(396, 152, 60, 60);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_6);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(462, 152, 60, 60);
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnF);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(528, 152, 60, 60);
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnT);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(594, 152, 60, 60);
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnN);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(661, 152, 60, 60);
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnP);
		
		JButton button_11 = new JButton("V");
		button_11.setBounds(727, 152, 60, 60);
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("X");
		button_12.setBounds(396, 219, 60, 60);
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("S");
		button_13.setBounds(462, 219, 60, 60);
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_13);
		
		JButton button_16 = new JButton("E");
		button_16.setBounds(661, 219, 60, 60);
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_16);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(727, 219, 60, 60);
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnA);
		
		JButton button_18 = new JButton("O");
		button_18.setBounds(396, 284, 60, 60);
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("O");
		button_19.setBounds(462, 284, 60, 60);
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_19);
		
		JButton button_22 = new JButton("W");
		button_22.setBounds(661, 284, 60, 60);
		button_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("Z");
		button_23.setBounds(727, 284, 60, 60);
		button_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("G");
		button_24.setBounds(396, 350, 60, 60);
		button_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("L");
		button_25.setBounds(462, 350, 60, 60);
		button_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("F");
		button_26.setBounds(528, 350, 60, 60);
		button_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("E");
		button_27.setBounds(594, 350, 60, 60);
		button_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("J");
		button_28.setBounds(661, 350, 60, 60);
		button_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("O");
		button_29.setBounds(727, 350, 60, 60);
		button_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_29);
		
		JButton btnN_1 = new JButton("N");
		btnN_1.setBounds(462, 417, 60, 60);
		btnN_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnN_1);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(528, 417, 60, 60);
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnH);
		
		JButton button_33 = new JButton("L");
		button_33.setBounds(594, 417, 60, 60);
		button_33.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(button_33);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(661, 417, 60, 60);
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnM);
		
		JTextArea txtrNoteTheTime = new JTextArea();
		txtrNoteTheTime.setBounds(24, 159, 89, 68);
		txtrNoteTheTime.setBackground(Color.LIGHT_GRAY);
		txtrNoteTheTime.setFont(new Font("Gill Sans MT", Font.PLAIN, 13));
		txtrNoteTheTime.setText("Note: The time\r\nwill continue to\r\ncountdown on\r\nreset.");
		contentPane.add(txtrNoteTheTime);
		
		JLabel label_2 = new JLabel("Time Left:");
		label_2.setBounds(141, 453, 100, 31);
		label_2.setFont(new Font("Gill Sans MT", Font.BOLD, 19));
		contentPane.add(label_2);
		
		JLabel label = new JLabel("");
		label.setBounds(392, 82, 400, 400);
		label.setIcon(new ImageIcon(LevelTemplate.class.getResource("/images/Grid.gif")));
		contentPane.add(label);
		
		JLabel lblPuzzle = new JLabel("Lightning");
		lblPuzzle.setBounds(392, 34, 400, 37);
		lblPuzzle.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuzzle.setFont(new Font("Gill Sans MT", Font.BOLD, 24));
		contentPane.add(lblPuzzle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(141, 116, 226, 284);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane);
		
		JLabel lblWordsFound = new JLabel("Words Found");
		lblWordsFound.setBounds(141, 82, 226, 31);
		lblWordsFound.setHorizontalAlignment(SwingConstants.CENTER);
		lblWordsFound.setFont(new Font("Gill Sans MT", Font.BOLD, 19));
		contentPane.add(lblWordsFound);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setBounds(141, 411, 66, 31);
		lblScore.setFont(new Font("Gill Sans MT", Font.BOLD, 19));
		contentPane.add(lblScore);
		
		btnExitLevel = new JButton("Exit Level");
		btnExitLevel.setBounds(24, 82, 89, 23);
		
		btnExitLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnExitLevel);
		
		JButton btnGiveUp = new JButton("Reset");
		btnGiveUp.setBounds(24, 136, 89, 23);
		btnGiveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnGiveUp);
		
		JButton btnSubmitWord = new JButton("Submit Word");
		btnSubmitWord.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSubmitWord.setBounds(797, 127, 106, 40);
		contentPane.add(btnSubmitWord);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 984, 531);
		label_1.setIcon(new ImageIcon(LevelTemplate.class.getResource("/images/BackgroundBlank.gif")));
		contentPane.add(label_1);
		
	}
}
