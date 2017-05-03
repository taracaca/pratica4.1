
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayrton
 */
public class Pratica41 {

    public static void main(String[] args) {
        Elipse orig = new Elipse(3, 3);
        Circulo circ = new Circulo(3,3,3);
        
        double area = orig.getArea();
        double perimetro = orig.getPerimetro();

        double area_circ = circ.getArea();
        double perimetro_cir = circ.getPerimetro();

        System.out.println("Area da Elipse: " + area);
        System.out.println("Perimetro da Elipse: " + perimetro);
        System.out.println("\nArea do Circulo: " + area_circ);
        System.out.println("Perimetro do Circulo: " + perimetro_cir);


    }
}
