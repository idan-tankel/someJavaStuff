class Rows {

    public static int minAvgRow(int[][] a) {
        return minAvgRow(a, Double.MAX_VALUE, a.length - 1, a.length - 1);
    }

    // solving the problem by passing to the method the avarage until now, and the
    // suspected line until now by an argument
    // the endIndex holds the last line that was not tested

    public static int minAvgRow(int[][] array, Double minimumTempAvarage, int minimumTempLine, int endIndex) {
        // stop condition, the array has only one raw
        // end index was in the beginning array.length - 1
        // the minimum line at the beginning was 0
        // the minimumTempAvarage in the beginning was the highest level of int
        if (endIndex < 0) // the array scan line by line was finished
            return minimumTempLine;
        else {
            // compute the avarageOnTempLine of the first line of the subarray
            // the start index is the beginning of the subarray
            double avarageOnTempLine = 0;
            for (int i = 0; i < array[endIndex].length; i++) {
                avarageOnTempLine += array[endIndex][i];
            }
            avarageOnTempLine = avarageOnTempLine / (array[endIndex].length);
            // get the most minimum avarageOnTempLine raw from the rest of the array
            // to prevent array being manipulated, pass the last line of the test by an
            // argument
            // if the avarage on temp line is lower than avarage on rest of the array
            if (avarageOnTempLine <= minimumTempAvarage)
                // run the method and update the minimum temp avarage and temp index
                // endindex is now the line that holds the minimum
                return minAvgRow(array, avarageOnTempLine, endIndex, endIndex - 1);
            else
                // the temp line avarage is higher than the avarage until now
                return minAvgRow(array, minimumTempAvarage, minimumTempLine, endIndex - 1);
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 3, 2, 1, 4 }, { 7, 6, 5, -8 } };
        System.out.println(arr.length);
        System.out.println(arr[arr.length - 1].length);
        System.out.println(minAvgRow(arr));
    }
}