double perfectCity(double[] departure, double[] destination) {
    double res=0;
    double sx=departure[0];
    double dx=destination[0];
    double sy=departure[1];
    double dy=destination[1];
      
    int lsx=(int)sx;
    int ldx=(int)dx;
    int lsy=(int)sy;
    int ldy=(int)dy;
      
    int rosx=(int)lsx+1;
    int rodx=(int)ldx+1;
    int rosy=(int)lsy+1;
    int rody=(int)ldy+1;
    
    if(rosx==rodx&&lsx==ldx){
        double back=(sx-lsx)+(dx-ldx);
        double front=(rosx-sx)+(rodx-dx);
        res=res+(back<front?back:front);
        res=res+(departure[1]>destination[1]?departure[1]-destination[1]:destination[1]-departure[1]);
        return res;
    }else if(rosy==rody&&lsy==ldy){
        double back=(sy-lsy)+(dy-ldy);
        double front=(rosy-sy)+(rody-dy);
        res=res+(back<front?back:front);
        res=res+(departure[0]>destination[0]?departure[0]-destination[0]:destination[0]-departure[0]);
        return res;
    }
    if(dx>rosx){
        double back=(rosx-sx)+(dx-rosx);
        res=res+(departure[1]>destination[1]?departure[1]-destination[1]:destination[1]-departure[1]);
        res=res+back;
        return res;
    }
    return 0.0;
}
