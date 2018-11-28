package thema1o;

import java.util.Scanner;

public class Thema1o {

    public static void main(String[] args) {
        
        double baros;
        double ypsos;
        double bmi;
        double minBaros;
        double maxBaros;
        
        Scanner user_input = new Scanner(System.in);
        System.out.println("Παρακαλώ εισάγετε το βάρος σας σε κιλά: ");
        baros = Double.valueOf(user_input.next());
        System.out.println("Παρακαλώ εισάγετε το ύψος σας σε μέτρα: ");
        ypsos = Double.valueOf(user_input.next());
        bmi = baros/(ypsos*ypsos);
        System.out.println("Ο δείκτης μάζας σώματος σας είναι: " + Math.round(bmi*100.0)/100.0);
        
        if (bmi < 18.5){
            System.out.println("Είστε άτομο ελλιποβαρές.");
            minBaros = 18.5*ypsos*ypsos;
            maxBaros = 25*ypsos*ypsos;
            System.out.println("Για να γίνετε άτομο με φυσιολογικό βάρος θα πρέπει να πάρετε απο " + Math.round((minBaros-baros)*100.0/100.0) + " κιλά το ελάχιστο, έως και " + Math.round((maxBaros-baros)*100.0/100.0) + " κιλά το μέγιστο.");
        }
        else if (bmi >= 18.5 && bmi < 25){
            System.out.println("Είστε άτομο με φυσιολογικό βάρος.");
            minBaros = 18.5*ypsos*ypsos;
            maxBaros = 25*ypsos*ypsos;
            System.out.println("Για να παραμείνετε άτομο με φυσιολογικό βάρος μπορείτε να χάσετε " + Math.round((baros-minBaros)*100.0/100.0) + " κιλά, ή να πάρετε έως και " + Math.round((maxBaros-baros)*100.0/100.0) + " κιλά το μέγιστο.");
        }
        else if (bmi >= 25 && bmi < 30){
            System.out.println("Είστε άτομο υπέρβαρο.");
            minBaros = 18.5*ypsos*ypsos;
            maxBaros = 25*ypsos*ypsos;
            System.out.println("Για να γίνετε άτομο με φυσιολογικό βάρος θα πρέπει να χάσετε απο " + Math.round((baros-maxBaros)*100.0/100.0) + " κιλά το ελάχιστο, έως και " + Math.round((baros-minBaros)*100.0/100.0) + " κιλά το μέγιστο.");
        }
        else if (bmi >= 30){
            System.out.println("Είστε άτομο παχύσαρκο.");
            minBaros = 18.5*ypsos*ypsos;
            maxBaros = 25*ypsos*ypsos;
            System.out.println("Για να γίνετε άτομο με φυσιολογικό βάρος θα πρέπει να χάσετε απο " + Math.round((baros-maxBaros)*100.0/100.0) + " κιλά το ελάχιστο, έως και " + Math.round((baros-minBaros)*100.0/100.0) + " κιλά το μέγιστο.");
        }
        
    }
    
}
