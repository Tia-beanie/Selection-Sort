public class SelectionSort {
    public static void main(String[] args){
        int[] list = {8,3,9,2,8,7,4,0,-3};
       
        selectionSort(list);

        System.out.println("Sorted list: ");
        for(int i = 0; i < list.length; i++){
            
            System.out.print(list[i] + " ");
        }
        
    }

    public static void selectionSort(int[] list){

        for(int i = 0; i < list.length; i++){

            int min = list[i];
            for(int j = i + 1; j < list.length; j++){
                
                if(list[j] < min){
                    min = list[j];
                    list[j] = list[i];
                    list[i] = min;
                }
            }
            
        }

    }
}
