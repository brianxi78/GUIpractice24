import javax.swing.*;
import java.awt.*;

public class GridInsideBorder {
    private JFrame frame;
    private JPanel panel;
    private JPanel grid;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label1;
    private JLabel label2;

    public static void main(String[] args) {
        GridInsideBorder g = new GridInsideBorder();
    }
    public GridInsideBorder(){
        frame = new JFrame("Xi, Brian - Grid Inside Border Layout");
        panel = new JPanel(new BorderLayout());
        grid = new JPanel(new GridLayout(2,3));
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        label1 = new JLabel("Label 1");
        label2 = new JLabel("Label 2");

        panel.add(button1, BorderLayout.NORTH);
        panel.add(button3, BorderLayout.SOUTH);
        panel.add(grid);
        grid.add(button2);
        grid.add(label1);
        grid.add(button4);
        grid.add(label2);
        grid.add(button5);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
