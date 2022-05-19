package aula11.grafica;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;

public class FrmCalculadoraSimples extends JFrame{
    private JTextField txtX;
    private JTextField txtY;
    private JComboBox<String> cbxOperacao;
    private JButton btnCalcular;

    public FrmCalculadoraSimples() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(320, 120));

        add(new JLabel("x:"));
        add(txtX = new JTextField(10));

        add(new JLabel("y:"));
        add(txtY = new JTextField(10));

        String operacao[] = {"Soma", "Substração", "Multiplicação", "Divisão"};
        add(new JLabel("Operação"));
        add(cbxOperacao = new JComboBox<String>(operacao));
        add(btnCalcular = new JButton("Calcular"));
    }
}
