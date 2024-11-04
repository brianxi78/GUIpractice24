import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleBorder implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JTextField ta;
    private JButton stopButton;
    private JButton goButton;

    public static void main(String[] args) {
        ExampleBorder E = new ExampleBorder();
    }

    public ExampleBorder(){
        frame = new JFrame("Example with Border Layout");
        panel = new JPanel(new BorderLayout());
        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        goButton = new JButton("Go");
        goButton.addActionListener(this);
        ta = new JTextField("Type here...");

        panel.add(goButton, BorderLayout.EAST);
        panel.add(stopButton, BorderLayout.SOUTH);
        panel.add(ta, BorderLayout.CENTER);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300); //OR (frame.pack();) --> put everything as close as possible and only makes the frame as big as necessary
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Go"){
            System.out.println("Go Button clicked!");
        }
        else if (e.getActionCommand() == "Stop"){
            System.out.println("Stop Button clicked!");
        }
    }
}
