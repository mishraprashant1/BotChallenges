boolean parkingSpot(int[] carDimensions, int[][] parkingLot, int[] luckySpot) {
    int x1=luckySpot[0];
    int x2=luckySpot[1];
    int y1=luckySpot[2];
    int y2=luckySpot[3];
    
    for(int i=x1;i<=y1;i++){
        for(int j=x2;j<=y2;j++){
            if(parkingLot[i][j]==1){
                return false;
            }
        }
    }
    int x=carDimensions[0];
    int y=carDimensions[1];
    
    if((y1-x1+1)<(y2-x2+1)){
        boolean flag=false;
        for(int i=x1;i<=y1;i++){
            for(int j=0;j<x2;j++){
                if(parkingLot[i][j]==1){
                    flag=true;
                    break;
                }
            }
        }
        if(flag){
            //return false;
            for(int i=x1;i<=y1;i++){
                for(int j=y2+1;j<parkingLot[0].length;j++){
                    if(parkingLot[i][j]==1){
                        return false;
                    }
                }
            }
        }else{
            return true;
        }
        
    }else{
        
    }
    return true;
}
