package one.digitalinnovation.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExerciseList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new LinkedList<>();
        System.out.println("Informe a temperatura média dos 6 primeiros meses do ano: ");
        int i = 0;
        int total = 0;
        do {
            System.out.println("Mês " + (i + 1) + " = ");
            temperaturas.add(scan.nextDouble());
            total += temperaturas.get(i);
            i++;
        } while(i < 6);
        double media = total / temperaturas.size();
        System.out.println("Média semestral:");
        i = 1;
        String msg = "";
        for (Double temp : temperaturas) {
            if (temp > media) {
                switch(i) {
                    case 1:
                        msg += "\nJaneiro: " + temp + "graus";
                        break;
                    case 2:
                        msg += "\nFevereiro: " + temp + "graus";
                        break;
                    case 3:
                        msg += "\nMarço: " + temp + "graus";
                        break;
                    case 4:
                        msg += "\nAbril: " + temp + "graus";
                        break;
                    case 5:
                        msg += "\nMaio: " + temp + "graus";
                        break;
                    case 6:
                        msg += "\nJunho " + temp + "graus";
                        break;
                }
            }
            i++;
        }
        if (!msg.equals("")) {
            System.out.println("Temperaturas acima da média e respectivos meses:" + msg);
        }

    }
}
