import javax.swing.*;
import java.awt.*;

class Notepad extends JFrame{
	private JTextArea textArea;
	
	private JMenuBar mainManu;
	
	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu viewMenu;
	
	private JMenuItem openMenuItem;
	private JMenuItem newMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem saveAsMenuItem;

	private JMenuItem copyMenuItem;
	private JMenuItem cutMenuItem;
	private JMenuItem pasteMenuItem;

	
	Notepad(){
		setSize(600,400);
		setTitle("Notepad");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		mainManu = new JMenuBar();
		
		
		fileMenu = new JMenu("File");	
		
		openMenuItem = new JMenuItem("Open");
		fileMenu.add(openMenuItem);
		newMenuItem = new JMenuItem("New");
		fileMenu.add(newMenuItem);
		saveMenuItem = new JMenuItem("Save");
		fileMenu.add(saveMenuItem);
		saveAsMenuItem = new JMenuItem("Save As");
		fileMenu.add(saveAsMenuItem);
		
		mainManu.add(fileMenu);
		
		
		editMenu = new JMenu("Edit");
		
		copyMenuItem = new JMenuItem("Copy");
		editMenu.add(openMenuItem);
		cutMenuItem = new JMenuItem("Cut");
		editMenu.add(cutMenuItem);
		pasteMenuItem = new JMenuItem("Paste");
		editMenu.add(pasteMenuItem);
		
		mainManu.add(editMenu);
		
		
		setJMenuBar(mainManu);
		
	}
}
class Demo{
	public static void main(String args[]){
		new Notepad().setVisible(true);
	}
}
