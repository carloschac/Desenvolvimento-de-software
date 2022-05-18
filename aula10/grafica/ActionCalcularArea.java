package aula10.grafica;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import aula10.logica.Circulo;

public class ActionCalcularArea extends AbstractAction{
    public enum OpcaoForma {
        CIRCULO,
        RETANGULO,
        TRIANGULO
    }

    private JTextField txtRaio;
    private JTextField txtBase;
    private JTextField txtAltura;
    private OpcaoForma opcaoForma;

    public ActionCalcularArea(JTextField txtRaio, OpcaoForma opcaoForma) {
            this.txtRaio = txtRaio;
            this.opcaoForma = opcaoForma;
    }
    public ActionCalcularArea(JTextField txtBase, JTextField txtAltura, OpcaoForma opcaoForma, JTextField txtArea) {
        this.txtBase = txtBase;
        this.txtAltura = txtAltura;
    }
    @Override
    public void actionPerfomed(ActionEvent e) {
        switch (this.opcaoForma) {
            case CIRCULO:
                double raio = Double.parseDouble(txtRaio.getText());
                Circulo circulo = new Circulo(raio);
                double area = circulo.calcularArea();
                txtArea.setText(String.format("%f", area));
                break;
        }
    }

}
