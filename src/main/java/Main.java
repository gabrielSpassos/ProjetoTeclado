import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Teclado keybord = new Teclado();
        System.out.println("** Projeto Teclado**");
        System.out.println("Digite o número do teclado: ");
        String numeros = ler.next();
        String retornoTeclado = null;
        retornoTeclado = keybord.alfabeto(numeros);
        System.out.println("Retorno: "+retornoTeclado);

    }
}
