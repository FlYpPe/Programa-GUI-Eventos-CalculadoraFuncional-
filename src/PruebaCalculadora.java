import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Calculadora extends JFrame implements ActionListener {

	Double n1 = 0.0, n2 = 0.0, res;
	byte operacion = 0;
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public Calculadora() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad");
		setSize(335, 300);
		setLocationRelativeTo(null);
		setVisible(true);

		JButton jb1 = new JButton("===");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbl.setConstraints(jb1, gbc);
		add(jb1);

		JLabel lb1 = new JLabel("  ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbl.setConstraints(lb1, gbc);
		add(lb1);

		JLabel lb2 = new JLabel("Estandar");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb2, gbc);
		add(lb2);

		JLabel lb3 = new JLabel("0");
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbl.setConstraints(lb3, gbc);
		add(lb3);

		JButton jb2 = new JButton("MC");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb2, gbc);
		add(jb2);

		JButton jb4 = new JButton("MR");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb4, gbc);
		add(jb4);

		JButton jb5 = new JButton("M+");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb5, gbc);
		add(jb5);
		JButton jb6 = new JButton("M-");
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb6, gbc);
		add(jb6);
		JButton jb7 = new JButton("MS");
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb7, gbc);
		add(jb7);
		JButton jb8 = new JButton("M-");
		gbc.gridx = 5;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb8, gbc);
		add(jb8);

		JButton jb3 = new JButton("%");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb3, gbc);
		add(jb3);
		JButton jb9 = new JButton("sqrt");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb9, gbc);
		add(jb9);
		jb9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				lb3.setText(String.valueOf(Math.sqrt(Double.parseDouble(lb3.getText()))));
				
			}
		});

		JButton jb10 = new JButton("x^2");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb10, gbc);
		add(jb10);
		jb10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(String.valueOf(Math.pow(Double.parseDouble(lb3.getText()), 2)));

			}
		});
		JButton jb11 = new JButton("1/x");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb11, gbc);
		add(jb11);
		jb11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(String.valueOf(Math.pow(Double.parseDouble(lb3.getText()), 2)));

			}
		});

		JButton jb12 = new JButton("CE");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb12, gbc);
		add(jb12);
		jb12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText("");

			}
		});
		JButton jb13 = new JButton("C");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb13, gbc);
		add(jb13);
		JButton jb14 = new JButton("DEL");
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb14, gbc);
		add(jb14);
		jb14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText().substring(0, lb3.getText().length()-1));

			}
		});
		JButton jb15 = new JButton("/");
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb15, gbc);
		add(jb15);
		jb15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(lb3.getText());
				lb3.setText("");
				operacion = 3;
			}
		});
		JButton jb16 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb16, gbc);
		add(jb16);
		jb16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "7");

			}
		});
		JButton jb17 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb17, gbc);
		add(jb17);
		jb17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "8");

			}
		});
		JButton jb18 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb18, gbc);
		add(jb18);
		jb18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "9");

			}
		});
		JButton jb19 = new JButton("*");
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb19, gbc);
		add(jb19);
		jb19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(lb3.getText());
				lb3.setText("");
				operacion = 2;
			}
		});
		JButton jb20 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb20, gbc);
		add(jb20);
		jb20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "4");

			}
		});
		JButton jb21 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb21, gbc);
		add(jb21);
		jb21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "5");

			}
		});
		JButton jb22 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb22, gbc);
		add(jb22);
		jb22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "6");

			}
		});
		JButton jb23 = new JButton("-");
		gbc.gridx = 3;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb23, gbc);
		add(jb23);
		jb23.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(lb3.getText());
				lb3.setText("");
				operacion = 1;
			}
		});

		JButton jb24 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb24, gbc);
		add(jb24);
		jb24.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "1");

			}
		});
		JButton jb25 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb25, gbc);
		add(jb25);
		jb25.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "2");

			}
		});
		JButton jb26 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb26, gbc);
		add(jb26);
		jb26.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "3");

			}
		});
		JButton jb27 = new JButton("+");
		gbc.gridx = 3;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb27, gbc);
		add(jb27);
		jb27.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(lb3.getText());
				lb3.setText("");
				operacion = 0;
			}
		});
		
		JButton jb28 = new JButton("+-");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb28, gbc);
		add(jb28);
		JButton jb29 = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb29, gbc);
		add(jb29);
		jb29.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + "0");

			}
		});
		JButton jb30 = new JButton(".");
		gbc.gridx = 2;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb30, gbc);
		add(jb30);
		jb30.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lb3.setText(lb3.getText() + ".");

			}
		});
		JButton jb31 = new JButton("=");
		gbc.gridx = 3;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb31, gbc);
		add(jb31);
		jb31.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				n2 = Double.parseDouble(lb3.getText());
				
				switch (operacion) {
				case 0:
					lb3.setText(String.valueOf(n1+n2));
					break;
				case 1:
					lb3.setText(String.valueOf(n1-n2));
					break;
				case 2:
					lb3.setText(String.valueOf(n1*n2));
					break;
				case 3:
					lb3.setText(String.valueOf(n1/n2));
					break;

				default:
					break;
				}
				n1 =  0.0;
				n2 = 0.0;
				operacion = 0;
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}

public class PruebaCalculadora {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculadora();
			}
		});

	}

}
