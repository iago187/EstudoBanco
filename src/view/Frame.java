package view;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    
    public Frame(){
        super ("Meu Frame");
        JButton botao = new JButton("Clique");
        
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main (String [] args){

        new Frame();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("VC Clicou");
        
    }
}
