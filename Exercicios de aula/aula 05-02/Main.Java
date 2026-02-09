import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice=0;
        ArrayList<String> productsList = new ArrayList<String>();

        while (choice!=4){
            System.out.println("Chose what you wnat do.");
            System.out.println("1- Add \n 2-List \n 3-Remove \n 4-Out ");
            choice= sc.nextInt();
            sc.nextLine();
            switch(choice){

            case 1:
                System.out.println("Enter the name of the product.");
                String product = sc.nextLine();
                productsList.add(product);
            break;
            case 2:
                if (productsList.isEmpty()){ 
                    System.out.println("There is no itens yet.");
                } else{
                    /*System.out.println("Itens List");
                    AtomicInteger indice = new AtomicInteger(1);
                    productsList.forEach(item -> {
                    System.out.println(indice.getAndIncrement() + " - " + item);
                    });*/
                
                    System.out.println("Itens List");

                    IntStream.range(0, productsList.size())
                    .forEach(i -> {
                    System.out.println((i + 1) + " - " + productsList.get(i));
                    });
                }
                
                break;
            case 3:
                if (productsList.isEmpty()){ 
                    System.out.println("There is no itens yet.");
                } else{
                    System.out.println("Inform the profuct name.");
                    product  = sc.nextLine();
                    productsList.remove(product);
                    
                    System.out.printf("Item removed: %s \n",product);
                };
                break;
            case 4:
                break;
            };
        }
    }
}
            