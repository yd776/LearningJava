class Main {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        System.out.println(arr1[1]);
        arr1[1]=6; // changing the memory of the array
        // dynamic arrays
        int arr2[]= new int[4];
        System.out.println(arr2[1]); // by default the values of a new array will be 0
        
        // printing all elemnts of an array
        //System.out.println(arr1.length);
        
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
