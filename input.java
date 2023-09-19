package work;
import work.bjrorv;
import java.awt.*;
import javax.swing.*;


public class input {

	public static void main(String[] args) {
		System.out.println("Loading...");	
		
	JFrame frame = new JFrame("SAV");

	JTextField text1 = new JTextField("Nom");
    text1.setBounds(20,40,200,28);
    

    
    JTextField text2 = new JTextField("Prénom");
    text2.setBounds(20,80,200,28);
    
    JTextField text3 = new JTextField("Téléphone");
    text3.setBounds(20,120,200,28);
    
    JTextField text4 = new JTextField("Réclamation");
    text4.setBounds(20,160,200,28);
    
    
    String[] columnNames = {"Nom", "Prenom", "Téléphone", "Réclamation"};
    
    Object[][] data = {
     {"Jemapel", "Tom", "0606060606", "Marche pas"},
     {"Jesuis", "Dom", "0606060606", "Bug"},
     {"Etre", "Carl", "0606060606", "Cassé"},
     {"Avoir", "Yan", "0606060606", "Unknown"},
     {"Ok", "Joseph", "0606060606", "Oubliez"}
 };
    
    JTable table = new JTable (data, columnNames);
    table.setBounds(20, 240, 240, 100);
 

    
    JButton btn = new JButton("Ajout cliquez");
    btn.setBounds(20,200,200,28);
    btn.setBackground(Color.BLUE);
    btn.setForeground(Color.BLUE);

   
   
    
    frame.add(text1);
    frame.add(text2);
    frame.add(text3);
    frame.add(text4);
    frame.add(btn);
    frame.add(table);  
    frame.setSize(850,250);
    frame.setLayout(null);
    frame.setVisible(true);
		
}

}
