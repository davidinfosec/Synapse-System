import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LovePoemGeneratorGUI {

    private JFrame frame;
    private JPanel panel;
    private JTextArea poemArea;
    private JButton generateButton;

    private String[] nouns = {"love", "heart", "soul", "passion", "desire"};
    private String[] adjectives = {"tender", "sweet", "gentle", "pure", "true"};
    private String[] verbs = {"beats", "longs", "aches", "burns", "yearns"};

    public LovePoemGeneratorGUI() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Love Poem Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        panel = new JPanel(new BorderLayout());

        poemArea = new JTextArea(10, 20);
        poemArea.setEditable(false);
        panel.add(poemArea, BorderLayout.CENTER);

        generateButton = new JButton("Generate Poem");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generatePoem();
            }
        });
        panel.add(generateButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void generatePoem() {
        String noun = getRandomElement(nouns);
        String adjective = getRandomElement(adjectives);
        String verb = getRandomElement(verbs);

        String poem = "My " + adjective + " " + noun + " " + verb + " for you,\n"
                + "With every breath I take and every beat of my heart.\n"
                + "You are the one I long for, the one I adore,\n"
                + "My heart and soul, forevermore.\n"
                + "I will love you always and forever,\n"
                + "For you are the one I cherish, the one I treasure.";

        poemArea.setText(poem);
    }

    private String getRandomElement(String[] array) {
        int index = (int) (Math.random() * array.length);
        return array[index];
    }

    public static void main(String[] args) {
        new LovePoemGeneratorGUI();
    }
}
