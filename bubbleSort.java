 public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,56,987,2,65,76,-435,765,-877};
        int []arr2 = {82,54,653,674,345,123,342,523,4234,43};
        bubble(arr);
        bubble(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }



    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i< arr.length; i++) {
            swapped = false;
            for(int j=1;j<arr.length - i; j++){
            if (arr[j] < arr[j-1]) {

            int temp = arr[j];
            arr[j] = arr [j-1];
            arr[j-1] = temp;
            swapped = true;
            }
            
        }

        if(!swapped) {
            break;
        }
    }
    
