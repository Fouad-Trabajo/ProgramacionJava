package cola;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuInterfazGrafica {
	 public static void main(String[] args) {
	        // Crear una ventana
	        JFrame frame = new JFrame("Menú de Colores");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 200);

	        // Crear una barra de menú
	        JMenuBar menuBar = new JMenuBar();

	        // Crear un menú
	        JMenu menu = new JMenu("Colores");

	        // Crear elementos del menú
	        JMenuItem menuItem1 = new JMenuItem("Rojo");
	        JMenuItem menuItem2 = new JMenuItem("Verde");
	        JMenuItem menuItem3 = new JMenuItem("Azul");

	        // Añadir manejadores de eventos a los elementos del menú
	        menuItem1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                frame.getContentPane().setBackground(Color.RED);
	            }
	        });

	        menuItem2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                frame.getContentPane().setBackground(Color.GREEN);
	            }
	        });

	        menuItem3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                frame.getContentPane().setBackground(Color.BLUE);
	            }
	        });

	        // Añadir elementos al menú
	        menu.add(menuItem1);
	        menu.add(menuItem2);
	        menu.add(menuItem3);

	        // Añadir menú a la barra de menú
	        menuBar.add(menu);

	        // Añadir la barra de menú a la ventana
	        frame.setJMenuBar(menuBar);

	        // Hacer visible la ventana
	        frame.setVisible(true);
	    }
	
}
