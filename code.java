import java.time.temporal.TemporalUnit;
import java.util.Scanner;
public class code{
    static void sum( int first_num, int second_num){
        System.out.println(first_num+second_num);
        
    }
    static void array(){
        int [] my_array= {1,2,3,4,5,6,7,8};
        int len = my_array.length;
        for(int i =0; i<len; i++){
            System.out.println(my_array[i]);
        }
        System.out.print("This is bubble sort: ");
        int temp; 
        for (int i =0; i<len; i++){
            for (int j =i+1; j<len;j++){
                if (my_array[i]>my_array[j]){
                    temp=my_array[i];
                    my_array[i]=my_array[j];
                    my_array[j]=temp;
                }
            }
        }
        System.out.println(my_array[len-1] );
    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        sum(first_num,second_num);
        array();

    }

}