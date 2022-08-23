package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.ProductController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Product extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDescription;
	private JTextField txtPrice;
	private JTextField txtDate;
	private JTextField txtSuplier;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product frame = new Product();
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
	public Product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddNewRegister = new JButton("Salvar");
		btnAddNewRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductController product = new ProductController();
				product.handleCreateNewRegister(txtDescription.getText(), txtDate.getText(),Double.parseDouble(txtPrice.getText()), txtSuplier.getText());
			}
		});
		btnAddNewRegister.setBackground(new Color(204, 255, 204));
		btnAddNewRegister.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnAddNewRegister.setBounds(10, 310, 120, 40);
		contentPane.add(btnAddNewRegister);
		
		JButton btnListar_1_1 = new JButton("Voltar");
		btnListar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home home = new Home();
				
				setVisible(false);
				
				home.setVisible(true);
			}
		});
		btnListar_1_1.setForeground(Color.WHITE);
		btnListar_1_1.setBackground(new Color(255, 153, 153));
		btnListar_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnListar_1_1.setBounds(154, 310, 120, 40);
		contentPane.add(btnListar_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 91, 264, 1);
		contentPane.add(separator);
		
		JLabel lblProdutos = new JLabel("Produtos");
		lblProdutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProdutos.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblProdutos.setBounds(71, 32, 132, 34);
		contentPane.add(lblProdutos);
		
		JLabel lblNewLabel = new JLabel("Descrição");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 103, 87, 23);
		contentPane.add(lblNewLabel);
		
		txtDescription = new JTextField();
		txtDescription.setBounds(10, 124, 264, 29);
		contentPane.add(txtDescription);
		txtDescription.setColumns(10);
		
		JLabel lblValor = new JLabel("Preço de Compra");
		lblValor.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblValor.setBounds(10, 164, 120, 23);
		contentPane.add(lblValor);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(10, 185, 120, 29);
		contentPane.add(txtPrice);
		
		JLabel lblDataDaCompra = new JLabel("Data da Compra");
		lblDataDaCompra.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblDataDaCompra.setBounds(154, 164, 120, 23);
		contentPane.add(lblDataDaCompra);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(154, 185, 120, 29);
		contentPane.add(txtDate);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblFornecedor.setBounds(10, 225, 87, 23);
		contentPane.add(lblFornecedor);
		
		txtSuplier = new JTextField();
		txtSuplier.setColumns(10);
		txtSuplier.setBounds(10, 249, 264, 29);
		contentPane.add(txtSuplier);
	}
}
