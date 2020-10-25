static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) 
{	
    int ust = c_q -1;
    int sag = n - r_q;
    int alt = n - c_q ;
    int sol = r_q - 1;
    
    int ustSol = Math.min(ust, sol);
    int ustSag = Math.min(ust, sag);
    int altSol = Math.min(alt, sol);
    int altSag = Math.min(alt, sag);
    
    for(int i=0; i<obstacles.length ; i++)
    {
        int engelSatir = obstacles[i][0];
        int engelSutun = obstacles[i][1];
        
        // ust
        if(engelSatir == r_q && engelSutun < c_q)
        {
            ust = Math.min(ust, c_q - engelSutun - 1);
        }
        
        // sag
        if(engelSutun == c_q && engelSatir > r_q)
        {
            sag = Math.min(sag, engelSatir - r_q - 1);
        }
        
        // alt
        if(engelSatir == r_q && engelSutun > c_q)
        {
            alt = Math.min(alt, engelSutun - c_q - 1);
        }
        
        // sol
        if(engelSutun == c_q && engelSatir < r_q)
        {
            sol = Math.min(sol, r_q - engelSatir - 1);
        }
        
        // ustSol
        if(engelSatir < r_q && engelSutun < c_q && r_q - engelSatir == c_q - engelSutun)
        {
            ustSol = Math.min(ustSol, r_q - engelSatir - 1);
        }
        
        // ustSag
        if(engelSatir > r_q && engelSutun < c_q && engelSatir - r_q == c_q - engelSutun)
        {
            ustSag = Math.min(ustSag, engelSatir - r_q - 1);
        }
        
        // altSag
        if(engelSatir > r_q && engelSutun > c_q && engelSatir - r_q == engelSutun - c_q)
        {
            altSag = Math.min(altSag, engelSatir - r_q - 1);
        }
        
        // altSol
        if(engelSatir < r_q && engelSutun > c_q && r_q - engelSatir == engelSutun - c_q)
        {
            altSol = Math.min(altSol, r_q - engelSatir - 1);
        }
    }

    return ust + sag + alt + sol + ustSol + ustSag + altSol + altSag;
}