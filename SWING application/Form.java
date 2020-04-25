package zaj4;

import org.mariuszgromada.math.mxparser.Expression;
import javax.swing.*;
import java.awt.event.*;
import java.text.MessageFormat;

class listOfFunctions{
    private String printableName;
    private String functionName;

    public listOfFunctions(String pN, String fN){
        printableName=pN;
        functionName=fN;
    }

    public String getFunctionName(){
        return functionName;
    }

    @Override
    public String toString() {
        return printableName;
    }
}

public class Form extends JFrame implements ActionListener{
    private JPanel panel1;
    private JTextField InputArea;
    private JScrollPane ScrollPanel;
    private JTextArea historyTextArea;
    private JButton evaluateButton;
   // private JList functionsList;
    private JList<listOfFunctions> functionsList;

    JMenu menu;
    JMenuItem Reset, Exit;

    public Form() {

        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        Reset = new JMenuItem("Reset");
        Exit = new JMenuItem("Exit ");

        menu.add(Reset);
        menu.add(Exit);
        mb.add(menu);
        setJMenuBar(mb);
        setSize(700,500);
        setVisible(true);

        Reset.addActionListener(this);
        Exit.addActionListener(this);
        evaluateButton.addActionListener(this);
        InputArea.addActionListener(this);
        historyTextArea.setEditable(false);

        DefaultListModel<listOfFunctions> listModel = new DefaultListModel<>();
        listModel.addElement(new listOfFunctions("Sinus", "sin"));
        listModel.addElement(new listOfFunctions("Cosinus", "cos"));
        listModel.addElement(new listOfFunctions("Tangens", "tan"));
        listModel.addElement(new listOfFunctions("Cotangens", "ctan"));
        listModel.addElement(new listOfFunctions("Logarytm", "ln"));
        listModel.addElement(new listOfFunctions("Liczba pi", "pi"));
        listModel.addElement(new listOfFunctions("Liczba Eulera", "e"));
        listModel.addElement(new listOfFunctions("Omega", "[Om]"));
        listModel.addElement(new listOfFunctions("Dodawanie", "+"));
        listModel.addElement(new listOfFunctions("Odejmowanie", "-"));
        listModel.addElement(new listOfFunctions("Mnozenie", "*"));
        listModel.addElement(new listOfFunctions("Dzielenie", "/"));
        listModel.addElement(new listOfFunctions("Last result", "Last result"));
        functionsList.setModel(listModel);


        InputArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    String s = historyTextArea.getText();
                    String[] lines = s.split("\n");
                    s = lines[lines.length - 3];
                    InputArea.setText(s);
                }
            }
        });

        functionsList.addMouseListener(new MouseAdapter() {
           // @Override
            public void mouseClicked(MouseEvent e) {

                String item = (String) functionsList.getSelectedValue().getFunctionName();
                if (item == "sin" || item == "cos" || item == "tan" || item == "ctan") {
                    InputArea.setText(InputArea.getText() + item + "()");
                    InputArea.requestFocus();
                    InputArea.setCaretPosition(InputArea.getText().length() - 1);
                } else if (item == "Last result") {
                    String s = historyTextArea.getText();
                    String[] lines = s.split("\n");
                    s = lines[lines.length - 2];
                    String[] nLines = s.split(" ");
                    s = nLines[nLines.length - 1];
                    InputArea.setText(s);
                } else {
                    InputArea.setText(InputArea.getText() + item);
                    InputArea.requestFocus();
                    InputArea.setCaretPosition(InputArea.getText().length());
                }

            }
        });

    }

    public static void main(String[] args){
        JFrame f = new Form();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==Reset){
            historyTextArea.setText("");
        }
        if(actionEvent.getSource()==Exit)
            System.exit(0);

        Object z = actionEvent.getSource();
        System.out.println(z);

        if (z == evaluateButton || z == InputArea) {
            String eq = InputArea.getText();
            char[] t = eq.toCharArray();
            for (int i = 0; i < t.length; i++) {
                if (t[i] > 65) {
                    if (!eq.contains("sin") && !eq.contains("cos") && !eq.contains("tan") && !eq.contains("pi") && !eq.contains("e") && !eq.contains("ln") && !eq.contains("Om")) {
                        JOptionPane.showMessageDialog(null, "You must fill in with number or function!", "Warning", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            Expression expression = new Expression(eq);
            double res = expression.calculate();
            if (Double.isNaN(res)) {
                JOptionPane.showMessageDialog(null, "Result must be a number", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            String entry = MessageFormat.format("{0}\n \t\t\t = {1}\n--------------\n", eq, res);
            historyTextArea.setText(historyTextArea.getText() + entry);
            InputArea.setText(null);

        }
    }
}
