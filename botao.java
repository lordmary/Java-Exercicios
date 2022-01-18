
package pkginterface;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

    public class Interface extends JFrame{
        
        private JFrame f;
        private JPanel p;
        private JButton b1, b2, b3;
        private JLabel lab;
        
        public Interface(){
            gui();
        }
        public void gui(){
            f = new JFrame("ARKANOID");
            f.setVisible(true);
            f.setSize(600,400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            p = new JPanel(new GridBagLayout());
            p.setBackground(Color.BLACK);
            
            b1 = new JButton("SAIR");
            b2 = new JButton("INSERIR NOME");
            b3 = new JButton("INICIAR");
            
            lab = new JLabel();
            
            GridBagConstraints c = new GridBagConstraints();
           
            c.insets = new Insets(50,50,50,50);
            c.gridx = 0;
            c.gridy = 1;
            p.add(b1, c);
            c.insets = new Insets(50,50,50,50);
            c.gridx = 0;
            c.gridy = 2;
            p.add(b2,c);
            c.gridx = 0;
            c.gridy = 3;
            p.add(b3);
            p.add(lab);
            
            f.add(p);
        }
        public static void main(String[] args){
            new Interface();
        }
    }
    
