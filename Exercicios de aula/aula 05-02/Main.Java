import java.util.Scanner;
import java.util.ArrayList;
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
                    System.out.println("Itens List");
                    productsList.forEach(item -> {
                    System.out.println(item);
                    });
                }
                break;
            case 3:
            case 4:
                break;
            };
        }
    }
}