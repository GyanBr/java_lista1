//
//7. Triângulo
//Crie uma classe chamada “Triângulo” com atributos para armazenar os três lados do triângulo.
//Implemente métodos para verificar se é um triângulo válido e calcular sua área.
//

package Model;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private boolean eValido;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public void eTrianguloValido(){
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1){
            System.out.println("É um triangulo valido");
            eValido = true;
        }
        else{
            System.out.println("Não é um triangulo valido");
            eValido = false;
        }
    }
    //Utilizando a formula de Herão:
    public void calcularArea(){
        if (eValido){
            //semiPerimetro é a metade do perímetro total do triângulo p/ simplificar o cálculo da área.
            double semiPerimetro = (lado1 + lado2 + lado3) / 2;

            double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1)
                    * (semiPerimetro - lado2)
                    * (semiPerimetro - lado3));
            System.out.println("Area do triangulo: = " + area);
        }
        else{
            System.out.println("Não foi possivel calcular o area do triangulo, ja que não é um triangulo válido");
        }

    }



}
