import java.util.Arrays;


public class Bubble_Selection_Insertion {
    public static void main(String[] args) {
        int [] array={9,8,6,1,5,4,3,2};
//        Bubble_sort(array);
//            Selection_sort(array);
        Insertion_sort(array);
    }

    // -------------BUBBLE SORT  ⬇️⬇️----------------------------------
    public static void Bubble_sort(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-1 ; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
//    ---------------------SELECTION SORT⬇️⬇️ ----------------------------
    public static void Selection_sort(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            int selection=i;
            for (int j = i+1; j <array.length ; j++) {
                if (array[j]<array[selection]){
                    selection=j;
                }
            }
            int temp=array[i];
            array[i]=array[selection];
            array[selection]=temp;

        }
        System.out.println(Arrays.toString(array));

    }

//    --------------------------INSERTION SORT----------------------------

// int[] arr={5,4,3,2,1}

    public static void Insertion_sort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int current=array[i];
            int j=i-1;
            while(j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
        System.out.println(Arrays.toString(array));
    }

}
