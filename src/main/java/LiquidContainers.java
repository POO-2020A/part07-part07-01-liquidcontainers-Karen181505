
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Containers containers = new Containers();
        while (true) {
            System.out.println(containers);
             System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else{
            String [] parts = input.split(" ");
            String comando = parts [0];
            int value = Integer.valueOf(parts [1]);
            if(comando.equals("add")){
                containers.addAmount(value);
            }else if(comando.equals("move")){
                containers.moveAmount(value);
            }else if(comando.equals("remove")){
                containers.removeAmount(value);
            }
            }

        }
    }
    


}
