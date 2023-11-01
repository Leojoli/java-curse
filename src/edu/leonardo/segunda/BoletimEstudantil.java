package edu.leonardo.segunda;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
            if (mediaFinal < 6) {
                System.err.println("Reprovado");
            } else if (mediaFinal == 6) {
                System.err.println("Recuperação");
            } else {
                System.err.println("Aprovado");
            }
    }
}
