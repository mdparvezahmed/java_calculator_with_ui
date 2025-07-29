import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator {
    private JPanel body;
    private JTextField display;
    private JTextField display2;
    private JButton two;
    private JButton equal;
    private JButton one;
    private JButton plus;
    private JButton five;
    private JButton three;
    private JButton six;
    private JButton eight;
    private JButton nine;
    private JButton percent;
    private JButton devide;
    private JButton zero;
    private JButton four;
    private JButton minus;
    private JButton multiplication;
    private JButton seven;
    private JButton a1XButton;
    private JButton xButton;
    private JButton rButton;
    private JButton a00Button;
    private JButton button4;
    private JButton CEButton;
    private JButton cButton;
    private JButton delButton;



    double firstNumber;
    double secondNumber;
    double result;
    String operation;


    private void showing(){
        DecimalFormat df = new DecimalFormat("#.######");
        String res = df.format(result);
        display.setText(display.getText()+display2.getText()+"=");
        display2.setText(res);
    }

    public Calculator() {


        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber = Double.parseDouble(display2.getText());
                calculate();
                showing();

            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().isEmpty()){
                    secondNumber = Double.parseDouble(display2.getText());
                    calculate();
                    showing();

                }
                    firstNumber = Double.parseDouble(display2.getText());
                    operation = "+";
                    display.setText(display2.getText()+"+");
                    display2.setText("");

                }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"2");
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"1");

            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"3");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().isEmpty()){
                    secondNumber = Double.parseDouble(display2.getText());
                    calculate();
                    showing();

                }
                firstNumber = Double.parseDouble(display2.getText());
                operation = "-";
                display.setText(display2.getText()+"-");
                display2.setText("");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"9");
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().isEmpty()){
                    secondNumber = Double.parseDouble(display2.getText());
                    calculate();
                    showing();

                }
                firstNumber = Double.parseDouble(display2.getText());
                operation = "*";
                display.setText(display2.getText()+"*");
                display2.setText("");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText(display2.getText()+"0");
            }
        });
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().isEmpty()){
                    secondNumber = Double.parseDouble(display2.getText());
                    calculate();
                    showing();

                }
                firstNumber = Double.parseDouble(display2.getText());
                firstNumber = firstNumber/100;
                display2.setText(String.valueOf(firstNumber));

            }
        });
        devide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().isEmpty()){
                    secondNumber = Double.parseDouble(display2.getText());
                    calculate();
                    showing();

                }
                firstNumber = Double.parseDouble(display2.getText());
                operation = "/";
                display.setText(display2.getText()+"/");
                display2.setText("");
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!display2.getText().contains(".")){
                    display2.setText(display2.getText()+".");
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(display2.getText());
                x = x*(-1);
                display2.setText(String.valueOf(x));
            }
        });
        rButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(display2.getText());
                display.setText("sqrt("+display2.getText()+")");
                firstNumber = Math.sqrt(firstNumber);
                display2.setText(String.valueOf(firstNumber));

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(display2.getText());
                display.setText(display2.getText()+"^2");
                firstNumber = Math.pow(firstNumber,2);
                display2.setText(String.valueOf(firstNumber));
            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(display2.getText());
                display.setText("1/"+display2.getText());
                firstNumber = 1/firstNumber;
                display2.setText(String.valueOf(firstNumber));
            }
        });
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display2.getText().isEmpty()){
                    display2.setText(display2.getText().substring(0,display2.getText().length()-1));
                }
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText("");
                display.setText("");
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display2.setText("");
            }
        });
    }
    private void calculate(){

        if(operation.equals("/") && firstNumber != 0 && secondNumber != 0){
            result = firstNumber / secondNumber;
            }
        else if(!operation.isEmpty()){
            switch (operation){
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;

        }

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().body);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
