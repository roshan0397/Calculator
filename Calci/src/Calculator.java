import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame {
	int operator = 0;
	double a = 0, b = 0, result = 0;

	JTextField screen;
	JLabel l1, l2;
	JRadioButton r1, r2;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;

	public void setComponents() {
		screen = new JTextField();

		l1 = new JLabel("ON");
		l2 = new JLabel("OFF");

		r1 = new JRadioButton();
		r2 = new JRadioButton();

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b10 = new JButton("0");
		b11 = new JButton("+");
		b12 = new JButton("-");
		b13 = new JButton("*");
		b14 = new JButton("/");
		b15 = new JButton("=");
		b16 = new JButton("AC");
		b17 = new JButton(".");
		b18 = new JButton("Delete");
		b19 = new JButton("+/-");

		setLayout(null);

		screen.setBounds(10, 20, 430, 140);
		l1.setBounds(70, 159, 80, 50);
		l2.setBounds(70, 190, 80, 50);
		r1.setBounds(20, 159, 50, 50);
		r2.setBounds(20, 190, 50, 50);
		b1.setBounds(10, 240, 100, 60);
		b2.setBounds(120, 240, 100, 60);
		b3.setBounds(230, 240, 100, 60);
		b4.setBounds(10, 310, 100, 60);
		b5.setBounds(120, 310, 100, 60);
		b6.setBounds(230, 310, 100, 60);
		b7.setBounds(10, 380, 100, 60);
		b8.setBounds(120, 380, 100, 60);
		b9.setBounds(230, 380, 100, 60);
		b10.setBounds(120, 450, 100, 60);
		b11.setBounds(340, 380, 100, 60);
		b12.setBounds(340, 310, 100, 60);
		b13.setBounds(340, 240, 100, 60);
		b14.setBounds(340, 170, 100, 60);
		b15.setBounds(340, 450, 100, 60);
		b16.setBounds(230, 170, 100, 60);
		b17.setBounds(10, 450, 100, 60);
		b18.setBounds(120, 170, 100, 60);
		b19.setBounds(230, 450, 100, 60);

		Font f1 = new Font("Dialog", Font.ITALIC, 28);
		Font f2 = new Font("Dialog", Font.PLAIN, 32);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);
		b7.setFont(f1);
		b8.setFont(f1);
		b9.setFont(f1);
		b10.setFont(f1);
		b11.setFont(f2);
		b12.setFont(f2);
		b13.setFont(f2);
		b14.setFont(f2);
		b15.setFont(f2);
		b16.setFont(f1);
		b17.setFont(f2);
		b18.setFont(new Font("Dialog", Font.ITALIC, 22));
		b19.setFont(f2);
		screen.setFont(new Font("Dialog", Font.ITALIC, 40));

		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.CYAN);
		b3.setBackground(Color.CYAN);
		b4.setBackground(Color.CYAN);
		b5.setBackground(Color.CYAN);
		b6.setBackground(Color.CYAN);
		b7.setBackground(Color.CYAN);
		b8.setBackground(Color.CYAN);
		b9.setBackground(Color.CYAN);
		b10.setBackground(Color.CYAN);
		b11.setBackground(Color.ORANGE);
		b12.setBackground(Color.ORANGE);
		b13.setBackground(Color.ORANGE);
		b14.setBackground(Color.ORANGE);
		b15.setBackground(Color.ORANGE);
		b16.setBackground(Color.GREEN);
		b17.setBackground(Color.CYAN);
		b18.setBackground(Color.RED);
		b19.setBackground(Color.CYAN);

		r1.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		b1.addActionListener(new B1());
		b2.addActionListener(new B2());
		b3.addActionListener(new B3());
		b4.addActionListener(new B4());
		b5.addActionListener(new B5());
		b6.addActionListener(new B6());
		b7.addActionListener(new B7());
		b8.addActionListener(new B8());
		b9.addActionListener(new B9());
		b10.addActionListener(new B10());
		b11.addActionListener(new B11());
		b12.addActionListener(new B12());
		b13.addActionListener(new B13());
		b14.addActionListener(new B14());
		b15.addActionListener(new B15());
		b16.addActionListener(new B16());
		b17.addActionListener(new B17());
		b18.addActionListener(new B18());
		b19.addActionListener(new B19());

		r1.addActionListener(new R1());
		r2.addActionListener(new R2());

		add(screen);
		add(l1);
		add(l2);
		add(r1);
		add(r2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
	}

	public void disable() {
		screen.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		b11.setEnabled(false);
		b12.setEnabled(false);
		b13.setEnabled(false);
		b14.setEnabled(false);
		b15.setEnabled(false);
		b16.setEnabled(false);
		b17.setEnabled(false);
		b18.setEnabled(false);
		b19.setEnabled(false);

		r2.setEnabled(false);
		r1.setEnabled(true);
	}

	public void enable() {
		screen.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b10.setEnabled(true);
		b11.setEnabled(true);
		b12.setEnabled(true);
		b13.setEnabled(true);
		b14.setEnabled(true);
		b15.setEnabled(true);
		b16.setEnabled(true);
		b17.setEnabled(true);
		b18.setEnabled(true);
		b19.setEnabled(true);

		r1.setEnabled(false);
		r2.setEnabled(true);
	}

	class R1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			enable();
		}
	}

	class R2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			disable();
		}
	}

	class B1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "1");
		}
	}

	class B2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "2");
		}
	}

	class B3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "3");
		}
	}

	class B4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "4");
		}
	}

	class B5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "5");
		}
	}

	class B6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "6");
		}
	}

	class B7 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "7");
		}
	}

	class B8 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "8");
		}
	}

	class B9 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "9");
		}
	}

	class B10 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + "0");
		}
	}

	class B11 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			a = Double.parseDouble(screen.getText());
			operator = 1;
			screen.setText("");
		}
	}

	class B12 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			a = Double.parseDouble(screen.getText());
			operator = 2;
			screen.setText("");
		}
	}

	class B13 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			a = Double.parseDouble(screen.getText());
			operator = 3;
			screen.setText("");
		}
	}

	class B14 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			a = Double.parseDouble(screen.getText());
			operator = 4;
			screen.setText("");
		}
	}

	class B15 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			b = Double.parseDouble(screen.getText());
			switch (operator) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
			case 4:
				result = a / b;
				break;
			default:
				result = 0;
			}

			screen.setText("" + result);
		}
	}

	class B16 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText("");
		}
	}

	class B17 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText(screen.getText() + ".");
		}
	}

	class B18 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = screen.getText();
			screen.setText("");
			for (int i = 0; i < s.length() - 1; i++) {
				screen.setText(screen.getText() + s.charAt(i));
			}
		}
	}

	class B19 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			screen.setText("-" + screen.getText());
		}
	}

	public Calculator(String s) {
		super(s);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator("Calculator");
		cal.setComponents();
		cal.setVisible(true);
		cal.setSize(465, 560);
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setResizable(false);
	}
}