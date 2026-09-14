public class Algoritmo4 {
    public static void main(String[] args) {

        int diaDaSemana = 3;
        String nomeDoDia;

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Segunda-feira";
                break;
            case 2:
                nomeDoDia = "Terça-feira";
                break;
            case 3:
                nomeDoDia = "Quarta-feira";
                break;
            default:
                nomeDoDia = "Dia inválido";
        }

        System.out.println(nomeDoDia); // 3 = Quarta-feira

        int mes = Integer.parseInt(IO.readln("\nDigite o mês atual(1 a 12): "));
        IO.println("O mês atual é: " + mes);

        switch (mes) {
            case 1:
                IO.println("Janeiro");
                break;
            case 2:
                IO.println("Fevereiro");
                break;
            case 3:
                IO.println("Março");
                break;
            case 4:
                IO.println("Abril");
                break;
            case 5:
                IO.println("Maio");
                break;
            case 6:
                IO.println("Junho");
                break;
            case 7:
                IO.println("Julho");
                break;
            case 8:
                IO.println("Agosto");
                break;
            case 9:
                IO.println("Setembro");
                break;
            case 10:
                IO.println("Outubro");
                break;
            case 11:
                IO.println("Novembro");
                break;
            case 12:
                IO.println("Dezembro");
                break;
            default:
                IO.println("Mês inválido!");
        }

    }
}
