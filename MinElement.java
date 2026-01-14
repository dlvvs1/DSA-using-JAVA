class MinElement {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50 };
        int min = arr[4];

        for(int i = arr.length ; i < arr.length ; i--)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("The Minimum Element is: " + min);
    }
}