package Aula8;


public class ProgramaPrincipal {
    public static void main(String[] args) {
        Ponto pt1 = new Ponto();
        Ponto pt2 = new Ponto(5, 10);
        Ponto pt3 = new Ponto(7, 10);

        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        System.out.println(pt3.toString());

        System.out.println("Distancia pt1 -> origem = %f", pt1.distancia());
    }
}
