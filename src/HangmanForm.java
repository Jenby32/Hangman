import javax.swing.*;

public class HangmanForm {
    private JPanel MainWindow;
    private JTextField charInputTextField;
    private JLabel underlineLabel;
    private JLabel failcountLabel;

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Hangman");
        HangmanForm hangmanForm = new HangmanForm();
        mainFrame.setContentPane(hangmanForm.MainWindow);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(900, 400);
        mainFrame.setVisible(true);
    }

}
