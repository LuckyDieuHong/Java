package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CaculatorAction;
import model.CalculatorModel;

public class CalculatorView  extends JFrame{
	private CalculatorModel calculatorModel;
	private JTextField field_firstValue;
	private JTextField field_secondValue;
	private JTextField field_answer;

	public CalculatorView() {
		this.calculatorModel = new CalculatorModel();
		this.init();
	}
	
	public void init()
	{
		this.setTitle("Mini caculator");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial",Font.BOLD,40);
		JLabel jLabel_firstValue = new JLabel("1st Value");
		jLabel_firstValue.setFont(font);
		
		JLabel jLabel_secondValue = new JLabel("2st Value");
		jLabel_secondValue.setFont(font);
	
		JLabel jLabel_answer = new JLabel("Answer");
		jLabel_answer.setFont(font);
		
		//Do rong 50 ky tu
		//Do khai bao kieu JTextField la khai bao cuc bo nen phai dem JTextField 
		//ra ngoai de khai bao toan cuc 
		field_firstValue = new JTextField(50);
		field_firstValue.setFont(font);
		field_secondValue = new JTextField(50);
		field_secondValue.setFont(font);
		field_answer = new JTextField(50);
		field_answer.setFont(font);

		
		JPanel jPanel_IO = new JPanel();
		jPanel_IO.setLayout(new GridLayout(3,2,10,10));
		
		jPanel_IO.add(jLabel_firstValue);
		jPanel_IO.add(field_firstValue);
		jPanel_IO.add(jLabel_secondValue);
		jPanel_IO.add(field_secondValue);
		jPanel_IO.add(jLabel_answer);
		jPanel_IO.add(field_answer);

		JPanel jPanel_funtion = new JPanel();
		jPanel_funtion.setLayout(new GridLayout(3,3));
		CaculatorAction action = new CaculatorAction(this);

		JButton jButton_plus = new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(action);
		jPanel_funtion.add(jButton_plus);
		
		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(action);
		jPanel_funtion.add(jButton_minus);

		
		JButton jButton_multiply = new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(action);
		jPanel_funtion.add(jButton_multiply);
		
		JButton jButton_divine = new JButton("/");
		jButton_divine.setFont(font);
		jButton_divine.addActionListener(action);
		jPanel_funtion.add(jButton_divine);

		
		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(action);
		jPanel_funtion.add(jButton_pow);

		
		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(action);
		jPanel_funtion.add(jButton_mod);
		
		
		
		
		
		this.setLayout(new BorderLayout(10,10));
		this.add(jPanel_IO,BorderLayout.CENTER);
		this.add(jPanel_funtion, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void plus() {
		double firstValue =  Double.valueOf(field_firstValue.getText());
		double secondValue = Double.valueOf(field_secondValue.getText());
		this.calculatorModel.setFirstValue(firstValue);
		this.calculatorModel.setSecondValue(secondValue);
		this.calculatorModel.plus();
		//this.field_answer.setText(this.calculatorModel.getAnswer()+"");
		this.field_answer.setText("3");	
	}

	public void minus() {
		double firstValue = Double.valueOf(field_firstValue.getText());
		double secondValue = Double.valueOf(field_secondValue.getText());
		this.calculatorModel.setFirstValue(firstValue);
		this.calculatorModel.setSecondValue(secondValue);
		this.calculatorModel.minus();
		this.field_answer.setText(this.calculatorModel.getAnswer()+"");
	}
	
	public void multiply() {
		double firstValue = Double.valueOf(field_firstValue.getText());
		double secondValue = Double.valueOf(field_secondValue.getText());
		this.calculatorModel.setFirstValue(firstValue);
		this.calculatorModel.setSecondValue(secondValue);
		this.calculatorModel.multiply();
		this.field_answer.setText(this.calculatorModel.getAnswer()+"");	
		}
	
	public void divide()
	{
		double firstValue = Double.valueOf(field_firstValue.getText());
		double secondValue = Double.valueOf(field_secondValue.getText());
		if(secondValue==0)
		{
			this.field_answer.setText("/0 ???");
		}
		else
		{
			this.calculatorModel.setFirstValue(firstValue);
			this.calculatorModel.setSecondValue(secondValue);
			this.calculatorModel.divide();
			this.field_answer.setText(this.calculatorModel.getAnswer()+"");
		}

	}
	
	public void pow() {
		double firstValue = Double.valueOf(field_firstValue.getText());
		double secondValue = Double.valueOf(field_secondValue.getText());
		this.calculatorModel.setFirstValue(firstValue);
		this.calculatorModel.setSecondValue(secondValue);
		this.calculatorModel.pow();
		this.field_answer.setText(this.calculatorModel.getAnswer()+"");	

}
	
	public void mod() {
		double firstValue = Double.valueOf(field_firstValue.getText());
		double secondValue = Double.valueOf(field_secondValue.getText());
		this.calculatorModel.setFirstValue(firstValue);
		this.calculatorModel.setSecondValue(secondValue);
		this.calculatorModel.mod();
		this.field_answer.setText(this.calculatorModel.getAnswer()+"");		}
	
}
