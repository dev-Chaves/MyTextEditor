package teste;

import javax.swing.*;
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

        JMenuItem newFile = new JMenuItem("New");
        JMenuItem openFile = new JMenuItem("Open");
        JMenuItem closeFile = new JMenuItem("Close");
        JMenuItem testes = new JMenuItem("Testes");

        menubar.add(menu);
        menu.add(newFile);
        menu.add(openFile);
        menu.add(closeFile);
        menu.add(testes);

        newFile.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Novo arquivo!");
            }
        });

        JTextArea textArea = new JTextArea();

        textArea.setLineWrap(true);

        testes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var lines = textArea.getLineCount();
                System.out.println("Total de linhas: " + lines);
            }
        });

        JFrame frame = new JFrame();

        frame.setSize(500,500);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menubar);
        frame.add(textArea);

    }
}
