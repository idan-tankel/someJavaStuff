class Rows{
    public static int minAvgRow(int[][] a) {
        return 0;
    }

    public static int minAvgRow(int[][] array, int tempavarage, int startIndex){
        // stop condition, the array has only one raw
        if(array.length == 1)
            return 1;
        else{
            // compute the avarageOnLastLine of the first line of the subarray
            //the start index is the beginning of the subarray
            double avarageOnLastLine = 0;
            for(int i=0;i<array[array.length-1].length;i++){
                avarageOnLastLine += array[array.length-1][i];
            }
            avarageOnLastLine = avarageOnLastLine/(array[array.length-1].length);
            // get the most minimum avarageOnLastLine raw from the rest of the array
            // to prevent array being manipulated, pass the last line of the test by an argument
            // if the avarage on last line is lower than avarage on rest of the array -
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