package CalculadoraImc;
import java.util.Scanner;

public class Calcimc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE IMC");

        System.out.println("Insira seu peso (KG):");
        double peso = s.nextDouble();

        System.out.println("Insira sua altura (M):");
        double altura = s.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.printf("Seu IMC é de: %.2f. Você está abaixo do peso.\n", imc);
        } else if(imc <= 24.9){
            System.out.printf("Seu IMC é de: %.2f. Você está no peso ideal.\n", imc);
        } else if(imc < 29.9){
            System.out.printf("Seu IMC é de: %.2f. Você está com sobrepeso.\n", imc);
        } else {
            System.out.printf("Seu IMC é de: %.2f. Você está com obesidade.\n", imc);
        }
        
        
    }
}
