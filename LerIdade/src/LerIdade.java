import java.util.Scanner;

public class LerIdade {

    public static void main(String[] args) {
        int ano, mes, dia, somadias;
        Scanner entrada = new Scanner(System.in);

        // interação com o usuario
        System.out.println("Quantos anos você têm? ");
        ano = entrada.nextInt();

        System.out.println("Mes de nascimento: ");
        mes = entrada.nextInt();

        System.out.println("Dia de nascimento: ");
        dia = entrada.nextInt();

        somadias = (((mes*31)+ dia)+(ano*365));
        System.out.println("Sua idade em dias é: " + somadias);
    }

}