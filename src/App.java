import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
