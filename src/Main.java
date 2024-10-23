import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // teklerin cemini  cemlerin hasilini tapan metod
        Scanner sc=new Scanner(System.in);
        System.out.print("Massivin ölçüsünü daxil edin: ");
        int n= sc.nextInt();
        System.out.println("Massivin elementlərini daxil edin: ");
        int [] arr= new int[n];
        for (int i=0; i< arr.length; i++){
        arr[i]= sc.nextInt();
            System.out.println("Massivin "+i+"-ci elementi: "+arr[i]);
    }
        System.out.println();
        for (int i=0; i< arr.length; i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }
        System.out.println();
        cemHasil(arr);
}
public static void cemHasil(int [] array){
        int cem=0;
        int hasil=1;
        for(int i=0; i<array.length; i++){
            if(array[i]%2!=0){
                cem+=array[i];
            } else if (array[i]%2==0 && array[i]!=0) {
                hasil*=array[i];
            }
        }
        System.out.println("Massivdə olan tək ədədlərin cəmi= "+cem);
    System.out.println("Massivdə olan cüt ədədlərin hasili= "+hasil);
}
}