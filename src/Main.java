import java.util.Scanner;

public class Main {

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        int choice = 0, size = 0;
        boolean isContinue = true;
        boolean isAcceptableChoice;

        System.out.println("Menu\n" +
                "1->Draw the triangle\n" +
                "2->Draw the square\n" +
                "3->Draw the rectangle\n"+
                "0->Exit\n");
        while (isContinue){
            do{
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                isAcceptableChoice = choice>=0&&choice<4?true:false;
                if(!isAcceptableChoice){
                    System.out.println("Your choice is not true, please enter again\n");
                }
            }while (!isAcceptableChoice);
            switch (choice){
                case ONE:
                    System.out.print("Enter size: ");
                    size = scanner.nextInt();
                    for(int i = 0; i < size; i++){
                        for(int j = size; j >i; j--){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case TWO:
                    System.out.print("Enter size: ");
                    size = scanner.nextInt();
                    for(int i = 0; i < size; i++){
                        for(int j = size; j > 0; j--){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case THREE:
                    System.out.print("Enter size: ");
                    size = scanner.nextInt();
                    for(int i = 0; i < size; i++){
                        for(int j = size + (size/2); j > 0; j--){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    isContinue = false;
            }
        }
    }
}
