import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeCheckerGUI extends JFrame {

    // Constructor to initialize the GUI
    public PalindromeCheckerGUI() {
        super("Palindrome Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null); // Center the window on the screen

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        JLabel enterLabel = new JLabel("Enter a number:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(enterLabel, constraints);

        JTextField numberField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(numberField, constraints);

        JButton checkButton = new JButton("Check Palindrome");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = numberField.getText().trim();
                if (isPalindrome(input)) {
                    JOptionPane.showMessageDialog(PalindromeCheckerGUI.this,
                            input + " is a palindrome.",
                            "Palindrome Check",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(PalindromeCheckerGUI.this,
                            input + " is not a palindrome.",
                            "Palindrome Check",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(checkButton, constraints);

        add(panel);
        setVisible(true);
    }

    // Non-static method to check if a number is palindrome
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Static method to launch the GUI
    public static void launchGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PalindromeCheckerGUI();
            }
        });
    }

    // Main method to start the program
    public static void main(String[] args) {
        launchGUI();
    }
}
