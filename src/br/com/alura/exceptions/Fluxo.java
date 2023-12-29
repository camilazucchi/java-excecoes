package br.com.alura.exceptions;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Início do Main...");
        primeiroMetodo();
        System.out.println("Fim do Main!");
    }

    public static void primeiroMetodo() {
        System.out.println("Início do primeiro método...");
        try {
            segundoMetodo();
        } catch (ArithmeticException ex) {
            // String message = ex.getMessage();
            // System.out.println("Erro ao tentar dividir por 0: " + message);
            ex.printStackTrace();
        }

        System.out.println("Fim do primeiro método!");
    }

    public static void segundoMetodo() {
        System.out.println("Início do segundo método...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
                // Linha que lança a exceção ArithmeticException: int a = i / 0;

        }
        System.out.println("Fim do segundo método!");
    }
}
