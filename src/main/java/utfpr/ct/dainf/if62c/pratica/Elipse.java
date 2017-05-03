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
public class Elipse {

    // a matriz representada por esta classe
    private double r;
    private double s;

    /**
     * Construtor que aloca a matriz.
     *
     * @param x O número de linhas da matriz.
     * @param y O número de colunas da matriz.
     */
    public Elipse(double x, double y) {
        this.r = x;
        this.s = y;
    }

    public double getArea() {
        double area;
        area = Math.PI*r*s;
        return area;
    }
    
    public double getPerimetro() {
        double perimetro;
        perimetro = Math.PI * (3*(r+s) - Math.sqrt((3*r + s)*(r + 3*s)));
        return perimetro;
    }
}
