package pekan8_2511532010;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511532010 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtfield2;
	private JTextField txthasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"kesalahan",JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532010 frame = new OperatorAritmatikaGUI_2511532010();
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
	public OperatorAritmatikaGUI_2511532010() {
		setTitle("OPERATOR ARITMATIKA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtBill = new JLabel("Bilangan 1");
		txtBill.setBounds(16, 49, 70, 16);
		contentPane.add(txtBill);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(95, 6, 149, 16);
		contentPane.add(lblNewLabel);
		
		JLabel txtBil2 = new JLabel("Bilangan 2");
		txtBil2.setBounds(16, 94, 70, 16);
		contentPane.add(txtBil2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(16, 141, 70, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(16, 231, 70, 16);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(115, 38, 98, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtfield2 = new JTextField();
		txtfield2.setHorizontalAlignment(SwingConstants.CENTER);
		txtfield2.setColumns(10);
		txtfield2.setBounds(115, 83, 98, 38);
		contentPane.add(txtfield2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		comboBox.setBounds(115, 137, 98, 27);
		contentPane.add(comboBox);
		
		txthasil = new JTextField();
		txthasil.setHorizontalAlignment(SwingConstants.CENTER);
		txthasil.setEditable(false);
		txthasil.setColumns(10);
		txthasil.setBounds(115, 220, 98, 38);
		contentPane.add(txthasil);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(textField.getText () .trim() .isEmpty()) 
					{pesanPeringatan ("Bilangan 1 harus diisi");
			} else if (txtfield2.getText () . trim() .isEmpty () ) { pesanPeringatan ("Bilangan 2 harus diisi") ;}
			else {
				
				try {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(txtfield2.getText());
				int c = comboBox.getSelectedIndex();
				if (c==0) {hasil = a+b;}
				if (c==1) {hasil = a-b;}
				if (c==2) {hasil = a*b;}
				if (c==3) {hasil = a/b;}
				if (c==4) {hasil = a%b;}
			} catch (NumberFormatException ex){
				pesanError ("Bilangan 1 dan Bilangan 2 harus angka");
			}
				
				txthasil.setText(String.valueOf(hasil));
				
				
				
			}}
		});
		btnProses.setBounds(225, 142, 85, 16);
		contentPane.add(btnProses);

	}
}
