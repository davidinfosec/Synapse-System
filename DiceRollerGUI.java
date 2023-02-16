import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceRollerGUI {
    private JFrame frame;
    private JPanel panel;
    private JLabel resultLabel;
    private JButton rollButton;

    public DiceRollerGUI() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Dice Roller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        panel = new JPanel(new BorderLayout());

        resultLabel = new JLabel("Roll the dice!");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel.setFont(new Font("Serif", Font.BOLD, 36));
        panel.add(resultLabel, BorderLayout.CENTER);

        rollButton = new JButton("Roll the Dice");
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = (int) (Math.random() * 100) + 1;
                resultLabel.setText(Integer.toString(result));
            }
        });
        panel.add(rollButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DiceRollerGUI();
    }
}
