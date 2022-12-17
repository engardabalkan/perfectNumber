import java.util.Scanner;
public class mukkemmelSayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Please enter a number:");
        int total=0;
        int number=inp.nextInt();
        for (int i=1;i<number;i++){
            if (number%i==0){
                total+=i;
            }
        }if (total==number){
            System.out.println(number+" is a perfect number.");
        }else {
            System.out.println(number+" is not a perfect number.");
        }
    }
}
