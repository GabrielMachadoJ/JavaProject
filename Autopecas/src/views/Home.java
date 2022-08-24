package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.ProductController;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Autopeças");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel.setBounds(71, 24, 132, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewProduct viewProduct = new ViewProduct();
				viewProduct.setVisible(true);
				setVisible(false);
			}
		});
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnRegister.setBounds(71, 91, 132, 40);
		contentPane.add(btnRegister);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductController produto = new ProductController();
				System.out.println(ProductController.products.size());
			}
		});
		btnListar.setBackground(Color.LIGHT_GRAY);
		btnListar.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnListar.setBounds(71, 142, 132, 40);
		contentPane.add(btnListar);
		
		JButton btnRelatrio = new JButton("Relatório");
		btnRelatrio.setBackground(Color.LIGHT_GRAY);
		btnRelatrio.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnRelatrio.setBounds(71, 193, 132, 40);
		contentPane.add(btnRelatrio);
		
		JButton btnQuit = new JButton("Sair");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnQuit.setForeground(Color.WHITE);
		btnQuit.setBackground(Color.DARK_GRAY);
		btnQuit.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnQuit.setBounds(71, 276, 132, 40);
		contentPane.add(btnQuit);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 77, 264, 1);
		contentPane.add(separator);
	}
}
