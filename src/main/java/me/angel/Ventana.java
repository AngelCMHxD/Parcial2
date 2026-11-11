package me.angel;


import me.angel.logica.Parcial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    private final JTextField textFieldA = new JTextField();
    private final JTextField textFieldB = new JTextField();
    private final JTextField textFieldC = new JTextField();
    private final JButton buttonCalcular = new JButton("Calcular");
    private final JLabel labelResultado = new JLabel();

    public Ventana() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel labelA = new JLabel("a:");
        labelA.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel labelB = new JLabel("b:");
        labelB.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel labelC = new JLabel("c:");
        labelC.setHorizontalAlignment(SwingConstants.RIGHT);

        labelResultado.setHorizontalAlignment(SwingConstants.LEFT);

        add(labelA);
        add(textFieldA);
        add(labelB);
        add(textFieldB);
        add(labelC);
        add(textFieldC);
        add(buttonCalcular);
        add(labelResultado);

        buttonCalcular.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonCalcular) {

            double a;
            double b;
            double c;
            try {
                a = Double.parseDouble(textFieldA.getText());
                b = Double.parseDouble(textFieldB.getText());
                c = Double.parseDouble(textFieldC.getText());
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "ingresa numeros validos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                String resultado = Parcial.calcularRaices(a, b, c);
                labelResultado.setText(resultado);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}