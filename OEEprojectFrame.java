import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OEEprojectFrame implements ActionListener{
	
	JTextField vardiyaAdet; 
	JTextField vardiyaSaat;
	JTextField molaAdet; 
	JTextField molaSaat; 
	JTextField parcaBas�Sure; 
	JTextField plans�zDurma; 
	JTextField uretilenUrun; 
	JTextField kaliteliUrun; 
	JButton button; 
	JFrame frame; 

	double e4;
	double e5;
	double e6;
	double e8;
	double d9;
	double e9;
	double e16;
	double e17;
	
	int vardiyaAdetNum;
	int vardiyaSaatNum;
	int molaAdetNum;
	int molaSaatNum;
	int parcaBas�SureNum; 	
	int plans�zDurmaNum;
	
	public OEEprojectFrame(){
	
	frame = new JFrame("OEE HESAPLAMA");
	button = new JButton("HESAPLA");
	button.setFocusable(false);
	button.addActionListener(this);
	
	JLabel label1 = new JLabel("Vardiya Adet:");	
	vardiyaAdet = new JTextField("0"); 
	
	JLabel label2 = new JLabel("Vardiya Saat:");
	vardiyaSaat = new JTextField("0");
	
	JLabel label3 = new JLabel("Mola Adet:");
	molaAdet = new JTextField("0");
	
	JLabel label4 = new JLabel("Mola Saat:");
	molaSaat = new JTextField("0");

	JLabel label5 = new JLabel("Par�a Ba�� S�re:(sn)");
	parcaBas�Sure = new JTextField("0");
	
	JLabel label6 = new JLabel("Plans�z Durma:(saat)");
	plans�zDurma = new JTextField("0"); // saat cinsinden
	
	//JLabel label7 = new JLabel("�retilen �r�n:");
	//uretilenUrun = new JTextField("0"); // adet cinsinden
	
	//JLabel label8 = new JLabel("Kaliteli �r�n:");
	//kaliteliUrun = new JTextField("0"); // adet cinsinden 
	
	JPanel panel1 = new JPanel();
	panel1.add(label1);
	panel1.add(vardiyaAdet);
//  panel1.setBounds(50,50,150,40);
	
	JPanel panel2 = new JPanel();
	panel2.add(label2);
	panel2.add(vardiyaSaat);
//	panel2.setBounds(100,50,150,40);
	
	JPanel panel3 = new JPanel();
	panel3.add(label3);
	panel3.add(molaAdet);
//	panel3.setBounds(50,100,150,40);
	
	JPanel panel4 = new JPanel();
	panel4.add(label4);
	panel4.add(molaSaat);
//	panel4.setBounds(100,100,150,40);
		
	JPanel panel5 = new JPanel();
	panel5.add(label5);
	panel5.add(parcaBas�Sure);
//	panel5.setBounds(50,150,150,40);
		
	JPanel panel6 = new JPanel();
	panel6.add(label6);
	panel6.add(plans�zDurma);
//	panel6.setBounds(100,150,150,40);
	
	//JPanel panel7 = new JPanel();
	//panel7.add(label2);
	//panel7.add(uretilenUrun);
//	panel7.setBounds(50,200,150,40);

	//JPanel panel8 = new JPanel();
	//panel8.add(label2);
	//panel8.add(kaliteliUrun);
//	panel8.setBounds(100,200,150,40);

	JPanel panel9 = new JPanel();
	panel9.add(button);
    panel9.setBounds(100,200,150,60);
	
	vardiyaAdet.setPreferredSize(new Dimension(80,30));
	vardiyaSaat.setPreferredSize(new Dimension(80,30));
	molaAdet.setPreferredSize(new Dimension(80,30));
	molaSaat.setPreferredSize(new Dimension(80,30));
	parcaBas�Sure.setPreferredSize(new Dimension(80,30));
	plans�zDurma.setPreferredSize(new Dimension(80,30));
	
	//uretilenUrun.setPreferredSize(new Dimension(80,30));
	//kaliteliUrun.setPreferredSize(new Dimension(80,30));
		
	
	// int g =Integer.valueOf(uretilenUrun.getText());
	// int h =Integer.valueOf(kaliteliUrun.getText());
		
	frame.add(panel1);
	frame.add(panel2);
	frame.add(panel3);
	frame.add(panel4);
	frame.add(panel5);
	frame.add(panel6);
	//frame.add(panel7);
	//frame.add(panel8);
	frame.add(panel9);
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600,500);
	frame.setLayout(new GridLayout(2,4,10,10));
	frame.setVisible(true);
		
	/*
	e4 = vardiyaAdetNum*vardiyaSaatNum;
	e5 = molaAdetNum*molaSaatNum;
	e6 = e4-e5;
	e8 = plans�zDurmaNum;
	d9 = parcaBas�SureNum;
	e9 = d9*3600;
	e16 = 444; // �retilen �r�n Say�s�
	e17 = 333; // Kaliteli �r�n Say�s�
	
	
	System.out.println("e4: " + e4 + "e5: " + e5 + "e6: " + "e8: " + e8 + "d9: " + d9 + "e9: " + e9 + "e16: " + e16 + "e17: " + e17  );
	*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			vardiyaAdetNum = Integer.valueOf(vardiyaAdet.getText());
			vardiyaSaatNum = Integer.valueOf(vardiyaSaat.getText());
			molaAdetNum = Integer.valueOf(molaAdet.getText());
			molaSaatNum = Integer.valueOf(molaSaat.getText());
			parcaBas�SureNum =Integer.valueOf(parcaBas�Sure.getText());
			plans�zDurmaNum =Integer.valueOf(plans�zDurma.getText());
			
			OEEprojectResults resultWindow = new OEEprojectResults (vardiyaAdetNum,
																	vardiyaSaatNum,
																	molaAdetNum,
																	molaSaatNum,
																	parcaBas�SureNum,
																	plans�zDurmaNum);
			frame.dispose();
		}
	}
	
	
	
}