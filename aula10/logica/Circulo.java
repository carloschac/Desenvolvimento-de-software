package aula10.logica;

public class Circulo extends FormaGeometrica {
    private double raio; 
    public Circulo(){

    } 

    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }
   public void setRaio(double raio) {
       this.raio = raio;
   }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }


    @Override
    public String preencherCor() {
        
        return "verde";
    }

}
