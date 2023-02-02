/*Codifyied Neural Network of each chromosome:

int in = first 4 bits are the number of inputs
int l1 = next 3 bits are the number of neurons in the first layer
int l2 = next 3 bits are the number of neurons in the second layer
int out = next 4 bits are the number of neurons in the output layer
_______________________________________________
14 bits total

After that the following 3*2^{in}*2^{l1} are the strong of the non zero conections
The next 3*2^{l1}*2^{l2} are the strong of the conections between layers
The last 3*2^{l2}*2^{out} are the conections betwen layer 3 and output

giving a maximum total of 14+3*2^{in}*2^{l1} +3*2^{in}*2^{l1} +3*2^{l2}*2^{out} = 974 bits for each chromosome that has this shape. (approximatly 122 bytes for chromosome)
So each craiture will have near 488 bytes of information, then 10000 of them will need around 4,88MB */

import java.util.Random;
import java.util.ArrayList;
public class Genetics {//code to work with genetics of digdna

    static ArrayList<ArrayList> setDIGDNA(){
        ArrayList<ArrayList> tmpVAR = new ArrayList<ArrayList>();
        Random tmpOBJ = new Random();

        for(int j=0;j<4;j++){
            tmpVAR.add(new ArrayList<Boolean>());
            //ArrayList<Boolean> tmpVAR = new ArrayList<Boolean>();
            String BINARY_INPUT_LAYER=""; 
            String BINARY_FIRST_LAYER="";
            String BINARY_SECOND_LAYER="";
            String BINARY_OUTPUT_LAYER="";
            byte INTEGER_INPUT_LAYER = 0;
            byte INTEGER_FIRST_LAYER = 0;
            byte INTEGER_SECOND_LAYER = 0;
            byte INTEGER_OUTPUT_LAYER = 0;

            for (int i=0;i<14;i++){
                tmpVAR.get(j).add(tmpOBJ.nextBoolean());
            }
            for(int i = 0; i<4;i++){
                //int tmp = ((boolean)tmpVAR.get(j).get(i))?1:0;
                BINARY_INPUT_LAYER += Integer.toString(((boolean)tmpVAR.get(j).get(i))?1:0);
            }
            for(int i=4;i<7;i++){
                BINARY_FIRST_LAYER += Integer.toString(((boolean)tmpVAR.get(j).get(i))?1:0);
            }
            for(int i=7;i<10;i++){
                BINARY_SECOND_LAYER += Integer.toString(((boolean)tmpVAR.get(j).get(i))?1:0);
            }
            for(int i=10;i<14;i++){
                BINARY_OUTPUT_LAYER += Integer.toString(((boolean)tmpVAR.get(j).get(i))?1:0);
            }
            INTEGER_INPUT_LAYER = Byte.parseByte(BINARY_INPUT_LAYER,2);
            INTEGER_FIRST_LAYER = Byte.parseByte(BINARY_FIRST_LAYER,2);
            INTEGER_SECOND_LAYER = Byte.parseByte(BINARY_SECOND_LAYER,2);
            INTEGER_OUTPUT_LAYER = Byte.parseByte(BINARY_OUTPUT_LAYER,2);
            int ARRAY_SIZE = 13;

            for(int i = 14;i < 3*INTEGER_INPUT_LAYER*INTEGER_FIRST_LAYER+14; i++){
                tmpVAR.get(j).add(tmpOBJ.nextBoolean());
                ++ARRAY_SIZE;
            }
            int NEW_ARRAY_SIZE=ARRAY_SIZE;
            for(int i = NEW_ARRAY_SIZE; i < NEW_ARRAY_SIZE + 3*INTEGER_FIRST_LAYER*INTEGER_SECOND_LAYER;i++){
                tmpVAR.get(j).add(tmpOBJ.nextBoolean());
                ++ARRAY_SIZE;
            }
            NEW_ARRAY_SIZE=ARRAY_SIZE;
            for(int i = NEW_ARRAY_SIZE;i < NEW_ARRAY_SIZE + 3*INTEGER_OUTPUT_LAYER*INTEGER_SECOND_LAYER;i++){
                tmpVAR.get(j).add(tmpOBJ.nextBoolean());
                ++ARRAY_SIZE;
            }
        }
        tmpVAR.add(new ArrayList<>());
        for(int i=0;i<200;i++){
            for(int jj=0;jj<6;jj++){
                tmpVAR.get(4).add(tmpOBJ.nextBoolean());
            }
        }
        return tmpVAR;
    }
    //public int[] {INTEGER_INPUT_LAYER, INTEGER_FIRST_LAYER, INTEGER_SECOND_LAYER, INTEGER_OUTPUT_LAYER} readDIGDNA_header(){

    //}

    public void readC1(ArrayList<ArrayList> DIGDNA) {
        ArrayList<Boolean> CHROMOSOME = DIGDNA.get(0);
        
    }
    public void readC2(ArrayList<ArrayList> DIGDNA) {
        ArrayList<Boolean> CHROMOSOME = DIGDNA.get(1);
        
    }
    public void readC3(ArrayList<ArrayList> DIGDNA) {
        ArrayList<Boolean> CHROMOSOME = DIGDNA.get(2);
        
    }
    public void readC4(ArrayList<ArrayList> DIGDNA) {
        ArrayList<Boolean> CHROMOSOME = DIGDNA.get(3);
        
    }
    public void readC5(ArrayList<ArrayList> DIGDNA) {
        ArrayList<Boolean> CHROMOSOME = DIGDNA.get(4);
        
    }

//static boolean[][][] mutateCHROMOSOME(double MUTATION_RATE){

//}
//static boolean[][][] mutateGEN(double MUTATION_RATE){

//}
//static boolean[][][] mixDIGDNA(double MUTATION_RATE, boolean[][][] FIRST_PARENT, boolean[][][] SECOND_PARENT){

//}

}
