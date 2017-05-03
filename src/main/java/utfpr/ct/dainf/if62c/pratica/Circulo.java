/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Ayrton
 */
public class Circulo extends Elipse {

    private double raio;

    public Circulo() {
        // obrigatório pois a classe Pessoa não
        // implementa o construtor padrão Pessoa()
        super(0, 0);
    }

    public Circulo(double raio, double r, double s) {
        super(r, s); // chama o construtor Pessoa(String)
        this.raio = raio;
    }
    @Override
    public double getArea() {
        double area;
        area = Math.PI*raio*raio;
        return area;
    }
    
    @Override
    public double getPerimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
   
}
