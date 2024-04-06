
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tela2 {

  static JLabel Label = new JLabel(" ESCOLHA ALGUMA DAS OPÇÕES. ", JLabel.CENTER);
  Font setFont = new Font("Arial", Font.BOLD, 200);

  public static void main(String args[]) {

    // janela

    JFrame janela = new JFrame();

    JButton Button = new JButton("BILHETE UNICO");
    JButton Button2 = new JButton("Dinheiro");

    janela.setVisible(true);

    janela.setSize(500, 500);

    janela.setTitle(" CHARGECARD ");

    janela.getContentPane().setBackground(new Color(10, 10, 10));
    janela.getContentPane().setLayout(null);

    janela.getContentPane().add(Label);
    janela.getContentPane().add(Button);
    janela.getContentPane().add(Button2);
    // janela.add(Label);

    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    janela.setResizable(false);

    janela.setLocationRelativeTo(null);

    // Botão

    // Button.add(Button);z

    Button.setSize(100, 100);

    Button.setVisible(true);

    Button.setBounds(100, 250, 150, 50);

    Button.setFont(new Font("Arial", Font.BOLD, 20));

    Button.setForeground(new Color(10, 10, 10));

    Button.setBackground(new Color(245, 250, 250));


    //Botão 2

    Button2.setSize(100, 100);

    Button2.setVisible(true);

    Button2.setBounds(200, 250, 200, 50);

    Button2.setFont(new Font("Arial", Font.BOLD, 20));

    Button2.setForeground(new Color(10, 10, 10));

    Button2.setBackground(new Color(245, 250, 250));
  


  }

}
