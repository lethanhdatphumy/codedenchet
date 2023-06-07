import java.util.Scanner;

public class code {
    static void sum(int first_num, int second_num) {
        System.out.println("this is result: " + (first_num + second_num));

    }

    static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of your array: ");
        int len = sc.nextInt();
        int[] my_array = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Element " + (i + 1));
            my_array[i] = sc.nextInt();
        }
        bubble_sort(my_array, len);
        selection_sort(my_array, len);
    }

    static void bubble_sort(int[] my_array, int len) {
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (my_array[i] > my_array[j]) {
                    temp = my_array[i];
                    my_array[i] = my_array[j]; 
                    my_array[j] = temp;
                }
            }
        }
        System.out.println("this is the result after applying bubble sort: " + my_array[len - 1]);

    }
    static void selection_sort(int [] my_array, int len){
        int min_index;
        for (int i =0;i<len;i++){
            min_index=i;
            for(int j =i+1;j<len;j++){
                if (my_array[j]<my_array[min_index]){
                    min_index = j;
                }

            }
            int temp = my_array[i];
            my_array[i]=my_array[min_index];
            my_array[min_index]=temp;
            
        }
        System.out.println("this is the result after applying selection sort: " + my_array[len - 1]);

    }
    static void sub(int first_num, int second_num){
        System.out.println("Sub: "+ (first_num-second_num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        sum(first_num, second_num);
        array();

    }

}
