
import javax.swing.*;
public class gui {

    public JFrame fenster;

    public gui (){
        fenster = new JFrame();
        fenster.setSize(1000,750);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setLocationRelativeTo(null);
        fenster.setLayout(null);
        fenster.setTitle("Huber (erstellt von Magda, Ronja, Dani)");
        fenster.setResizable(false);
        fenster.requestFocus();
        fenster.setVisible(true);
        System.out.println("fenster initialized");
    }

}
