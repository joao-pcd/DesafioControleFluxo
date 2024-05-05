import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        boolean reiniciar = true;
        while (reiniciar) {
            reiniciar = false;
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro." +
                        " \n Deseja reiniciar o programa? (y/n) ");
                String resposta = terminal.next();

                if (resposta.equalsIgnoreCase("y")) {
                    reiniciar = true;
                }
            }
        }
        System.out.println("Programa finalizado");
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
