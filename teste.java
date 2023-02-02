import java.util.ArrayList;
//import java.util.List;

//import java.io.*;
public class teste {
    public static void main(String[] args) { 
        Criature newCRIATURE = new Criature();
        System.out.print("CRIATURE ATP ENERGY: ");
        System.out.println(newCRIATURE.getATP_ENERGY());
        System.out.print("CRIATURE INTERNAL CAPACITY: ");
        System.out.println(newCRIATURE.getINTERNAL_CAPACITY());        
        System.out.print("CRIATURE SEXUAL DISPONIBLE? ");
        System.out.println(newCRIATURE.getSEXUAL_DISPONIBILITY());
        System.out.print("CRIATURE STURCTURAL INTEGRITY: ");
        System.out.println(newCRIATURE.getSTURCTURAL_INTEGRITY());
        System.out.print("X POSITION IS: ");
        System.out.println(newCRIATURE.getPOSITION_2D()[0]);
        System.out.print("Y POSITION IS: ");
        System.out.println(newCRIATURE.getPOSITION_2D()[1]);

        System.out.print("FIRST 4 ROWS OF DIGDNA ");      
        ArrayList<ArrayList> tmpVAR = newCRIATURE.getDIGDNA();
        int NUMBER_OF_CHROMOSOMES = tmpVAR.size();
        int CHROMOSOME_INDEX_VALUE = tmpVAR.get(4).size();
        System.out.print("(NUMBER_OF_CHROMOSOMES: ");
        System.out.print(NUMBER_OF_CHROMOSOMES);
        System.out.print(", CHROMOSOME_INDEX_VALUE: ");
        System.out.println(CHROMOSOME_INDEX_VALUE+"):");
        System.out.println(tmpVAR.get(0).get(0));

        //byte tmp;
        //for(int i = 0;i<4;i++){
        //    for(int ii=0;ii<CHROMOSOME_INDEX_VALUE;ii++){
        //        tmp = (tmpVAR.get(i).get(ii))?(byte)1:0;
        //        System.out.print("["+tmp+"]");
        //    }System.out.println();
        //}


        ArrayList<Criature> LIST_OF_CRIATURES = new ArrayList<>();
        for (int i=0;i<10;i++){
            LIST_OF_CRIATURES.add(new Criature());
            LIST_OF_CRIATURES.get(i).initPOSITION_2D(500, -500);
        }
        System.out.println(LIST_OF_CRIATURES);
        LIST_OF_CRIATURES.get(0).mutateRANDOM_GEN(0.5); 
        System.out.println("algo");
    }
}
