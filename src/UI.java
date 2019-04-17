import javax.swing.*;
import java.awt.event.*;

public class UI extends JDialog {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textFieldIp;
    private JTextField textFieldUser;
    private JTextField textFieldPassword;
    private JTextField textFieldDatabase;
    private JTextField textFieldTableName;

    public UI() {



        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        this.setLocationRelativeTo(null);
        buttonOK.addActionListener(e -> onOK());
        buttonCancel.addActionListener(e -> onCancel());

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(e -> onCancel(),
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        System.out.println(textFieldDatabase.getText());
        System.out.println(textFieldTableName.getText());
        System.out.println(textFieldUser.getText());
        System.out.println(textFieldPassword.getText());
        System.out.println(textFieldIp.getText());
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        UI dialog = new UI();
        dialog.pack();
        dialog.setVisible(true);
    }
}
