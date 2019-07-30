package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class TextInputEx extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextInputEx frame = new TextInputEx();
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
	public TextInputEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //얘가 없으면 창이 닫혀지지가 않음
		setBounds(200, 200, 1000, 700); //처음에 띄웠을때 위치잡아줌 앞에 두개는 위치, 뒤에 두개는 창 사이즈
		contentPane = new JPanel(); //
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(9);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(47, 107, 57, 15);
		contentPane.add(lblName);
		
		JLabel lblContents = new JLabel("Contents");
		lblContents.setBounds(47, 188, 57, 15);
		contentPane.add(lblContents);
		
		txtName = new JTextField();
		txtName.setToolTipText("this is tooltip");
		txtName.setText("input your name");
		txtName.setBounds(193, 104, 116, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(47, 279, 92, 15);
		contentPane.add(lblPassword);
		
		JTextArea txtrHello = new JTextArea();
		txtrHello.setText("hello");
		txtrHello.setBounds(193, 157, 130, 91);
		contentPane.add(txtrHello);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 276, 184, 21);
		contentPane.add(passwordField);
		
		JButton btnStore = new JButton("Store");
		btnStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStore.setBounds(189, 504, 68, 23);
		contentPane.add(btnStore);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(""); //공백값으로 변경
				txtrHello.setText("");  // 공백값으로 변경
				passwordField.setText("");
				
			}
		});
		btnReset.setBounds(283, 504, 97, 23);
		contentPane.add(btnReset);
		
		JToggleButton tglbtnWhatIsToggle = new JToggleButton("what is toggle?");
		tglbtnWhatIsToggle.setBounds(438, 103, 135, 23);
		contentPane.add(tglbtnWhatIsToggle);
		
		JCheckBox chkCpp = new JCheckBox("C++");
		chkCpp.setBounds(597, 103, 115, 23);
		contentPane.add(chkCpp);
		
		JCheckBox chkjava = new JCheckBox("java");
		chkjava.setBounds(760, 103, 130, 23);
		contentPane.add(chkjava);
		
		ButtonGroup grp = new ButtonGroup(); //female과 male은 둘중에 하나만 선택되어야하기때문에 그룹으로 묶어줌
		JRadioButton rdofemale = new JRadioButton("Female");
		rdofemale.setBounds(597, 138, 121, 23);
		contentPane.add(rdofemale);
		
		JRadioButton rdomale = new JRadioButton("Male");
		rdomale.setBounds(760, 138, 121, 23);
		contentPane.add(rdomale);
		
		grp.add(rdofemale); //그래서 이말도 추가
		grp.add(rdomale);
		
		String[] pet = {"Make a selection", "Cat", "Dog", "Rabbit", "Pig"};
		
		JList list = new JList (pet); 
		list.setBounds(438, 187, 200, 91);
		contentPane.add(list);
		
		JComboBox combo = new JComboBox(pet);
		combo.setBounds(663, 188, 200, 21);
		contentPane.add(combo);
		
	}
}
