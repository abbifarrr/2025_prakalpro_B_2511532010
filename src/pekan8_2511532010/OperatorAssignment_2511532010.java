package pekan8_2511532010;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class OperatorAssignment_2511532010 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField field;
	private JTextField txthasil;

	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "peringatan", JOptionPane.WARNING_MESSAGE);
	}

	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAssignment_2511532010 frame = new OperatorAssignment_2511532010();
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
	public OperatorAssignment_2511532010() {
		setTitle("OPERATOR ASSIGNMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(180, 6, 61, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel("BILANGAN");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(31, 6, 137, 39);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("OPERATOR");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(31, 113, 137, 39);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("HASIL");
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(31, 237, 112, 16);
		contentPane.add(lblNewLabel_1_3);

		JComboBox combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(new String[] { "+=", "-=", "*=", "/=", "%=" }));
		combo.setBounds(190, 110, 112, 51);
		contentPane.add(combo);

		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			private float a = 0;

			public void actionPerformed(ActionEvent e) {
				if (field.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan harus diisi");
				} else {
					try {
						float b = Float.parseFloat(field.getText());
						int c = combo.getSelectedIndex();
						if (c == 0) {
							a += b;
						} else if (c == 1) {
							a -= b;
						} else if (c == 2) {
							a *= b;
						} else if (c == 3) {
							a /= b;
						} else if (c == 4) {
							a %= b;
						}
					} catch (NumberFormatException ex) {
						pesanError("Bilangan harus angka");
					}
					txthasil.setText(String.valueOf(a));
				}
			}
		});
		btnNewButton.setBounds(311, 121, 98, 29);
		contentPane.add(btnNewButton);

		field = new JTextField();
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		field.setBounds(190, 0, 112, 51);
		contentPane.add(field);
		field.setColumns(10);

		txthasil = new JTextField();
		txthasil.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txthasil.setHorizontalAlignment(SwingConstants.CENTER);
		txthasil.setColumns(10);
		txthasil.setBounds(190, 222, 112, 51);
		contentPane.add(txthasil);

	}
}
