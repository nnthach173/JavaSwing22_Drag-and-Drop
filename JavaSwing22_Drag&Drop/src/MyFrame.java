
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	DragPanel dragPanel = new DragPanel();
	
	MyFrame(){
		
		this.add(dragPanel);
		this.setTitle("DragDrop");
		this.setSize(1600,1600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
