import java.util.Arrays;
import java.util.Scanner;
public class ArrayListAlignment {


    public static void GetArrayItem(int[] ArrayList, int size){
        Scanner input = new Scanner(System.in);

        for (int j = 0; j < size; j++) {
            System.out.print(j + " . Enter Item:  ");
            ArrayList[j] = input.nextInt();
        }
        System.out.println("Your ArrayList: " + Arrays.toString(ArrayList));
    }

    public static void AlignArrayList(int[] ArrayList, int ArrayItemSize) {
        int a = 0;
        for (int i = 0; i < ArrayItemSize; i++) {
            for (int j = i + 1; j < ArrayItemSize; j++) {
                if (ArrayList[i] > ArrayList[j]) {
                    a = ArrayList[i];
                    ArrayList[i] = ArrayList[j];
                    ArrayList[j] = a;
                }
            }
        }
        System.out.println("Aligned ArrayList:  " + Arrays.toString(ArrayList));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many Array Item:  ");
        int ArrayItemSize = input.nextInt();

        if (ArrayItemSize > 0){
            int[] MyArrayList = new int[ArrayItemSize];

            GetArrayItem(MyArrayList, ArrayItemSize);
            AlignArrayList(MyArrayList,ArrayItemSize);

        }else{
            System.out.println("Oops!  Wrong Input!\n Please Try Again!");
            System.exit(0);
        }


    }
}