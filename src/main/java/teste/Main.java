package teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        JMenuBar menubar;

        menubar = new JMenuBar();

        JMenu menu = new JMenu("File");

        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("This is a menu");

        JMenuItem teste = new JMenuItem("Teste Rápido");

        menubar.add(menu);
        menu.add(teste);

        teste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Teste Rápido");
            }
        });

        JTextArea TextArea = new JTextArea();


        JFrame frame = new JFrame();

        frame.setSize(500,500);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setJMenuBar(menubar);
        frame.add(TextArea);

    }
}
