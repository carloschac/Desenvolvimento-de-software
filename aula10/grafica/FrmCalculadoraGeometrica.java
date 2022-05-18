package aula10.grafica;

import java.awt.*;

import javax.swing.*;

public class FrmCalculadoraGeometrica extends JFrame{
    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JTextField txtTrianguloBase;
    private JTextField txtTrianguloAltura;
    private JTextField txtTrianguloArea;
    private JButton btnCircunferenciaCalcularArea;
    private JButton btnRetanguloCalcularArea;
    private JButton btnTrianguloCalcularArea;
    public FrmCalculadoraGeometrica() {
        setSize(new Dimension(720, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));

        JPanel pnl = new JPanel();
    
        pnl.setBorder(BorderFactory.createTitledBorder("Circulo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        pnl.add(new JLabel("Raio:"));
        txtRetanguloAltura = new JTextField(10);
        pnl.add(txtRetanguloAltura);
        pnl.add(btnRetanguloCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Area"));
        txtRetanguloArea = new JTextField(10);
        pnl.add(txtRetanguloArea);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retangulo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        pnl.add(new JLabel("Area:")); 
        txtCircunferenciaRaio = new JTextField(10);
        pnl.add(txtCircunferenciaRaio);
        pnl.add(btnCircunferenciaCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Area"));
        txtCircunferenciaArea = new JTextField(10);
        pnl.add(txtCircunferenciaArea);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triangulo"));
        add(pnl);
        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        pnl.add(new JLabel("Raio:"));
        txtTrianguloAltura = new JTextField(10);
        pnl.add(txtTrianguloAltura);
        pnl.add(btnTrianguloCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Area"));
        txtTrianguloArea = new JTextField(10);
        pnl.add(txtTrianguloArea);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triangulo"));
        add(pnl);
    }
}
