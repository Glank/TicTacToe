package ttt.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;


public class HTMLDisplayDialog extends JDialog{
	private static final long serialVersionUID = 4439586068254898442L;
	private JEditorPane jep;
	public HTMLDisplayDialog(File file, String title){
		initJEP(file);
		JScrollPane scroll = new JScrollPane(jep);
		scroll.setPreferredSize(new Dimension(400,300));
		add(scroll, BorderLayout.CENTER);
		pack();
		setModal(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null); //center
		setTitle(title);
	}
	
	private void initJEP(File file){
		jep = new JEditorPane();
		jep.setContentType("text/html");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			StringBuilder builder = new StringBuilder();
			Scanner in = new Scanner(fis);
			while(in.hasNextLine())
				builder.append(in.nextLine()+"\n");
			jep.setText(builder.toString());
		} catch (FileNotFoundException e) {
			jep.setText("<FONT COLOR=\"FF0000\">Error loading file: "
					+file.getAbsolutePath()+"</FONT>");
		}
		jep.setEditable(false);
	}
}