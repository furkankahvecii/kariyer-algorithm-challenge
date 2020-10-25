 static int hourglassSum(int[][] arr) {
    int rows = arr.length;
    int columns = arr[0].length;
    
    int MAX_HOURGLASS_SUM = Integer.MIN_VALUE;	    
    
    for(int i=0; i< rows-2; i++){
        for(int j=0; j<columns-2; j++) {
            int current_hourglass_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            MAX_HOURGLASS_SUM = Math.max(MAX_HOURGLASS_SUM, current_hourglass_sum);
        }
    }
    
    return MAX_HOURGLASS_SUM;

}