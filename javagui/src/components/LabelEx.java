package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LabelEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabelEx frame = new LabelEx();
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
	public LabelEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 102, 204));
		contentPane.setBackground(new Color(255, 204, 51));
		contentPane.setBorder(new LineBorder(new Color(204, 0, 0), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJavaDbClass = new JLabel("java DB class");
		lblJavaDbClass.setBounds(42, 45, 108, 25);
		contentPane.add(lblJavaDbClass);
		
		JLabel lbltitle = new JLabel("java DB class this is title");
		lbltitle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbltitle.setBackground(new Color(255,55,22));
			}
		});
		lbltitle.setFont(new Font("함초롬돋움", Font.BOLD, 17));
		lbltitle.setForeground(new Color(0, 102, 204));
		lbltitle.setBounds(136, 62, 207, 25);
		contentPane.add(lbltitle);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbltitle.setForeground(new Color(0,0,255));
			}
		});
		btnNewButton.setBounds(114, 160, 97, 23);
		contentPane.add(btnNewButton);
	}
}
