 static int jumpingOnClouds(int[] c) {
		
    int step = 0;
    for(int i=0; i< c.length ; i++)
    {
        if(i < c.length-2 && c[i+2] != 1)
            i+=1;
        
        step++;
    }

    return step-1;
}