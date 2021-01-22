class Rows{
    public static int minAvgRow(int[][] a) {
        return 0;
    }

    public static int minAvgRow(int[][] array, int tempAvarage, int tempIndex){
        // stop condition, the array has only one raw
        if(array.length == 1)
            return 1;
        else{
            // compute the avarage of the last line of the array
            int avarage = 0;
            for(int i=0;i<array[array.length-1].length;i++){
                avarage += array[array.length-1][i];
            }
            return 0;
        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3}};
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1].length);
        System.out.println(minAvgRow(arr,1,1));
    }
}