import java.util.ArrayList;;
public class Criature {
    private byte STURCTURAL_INTEGRITY = 100;
    private byte ATP_ENERGY = 100;
    private byte INTERNAL_CAPACITY = 100;
    private boolean SEXUAL_DISPONIBILITY = false;
    private int[] POSITION_2D={0,0};
    private float[] SPEED_2D = {0,0};
    private ArrayList<ArrayList> DIGDNA = Genetics.setDIGDNA(); 

    public void initPOSITION_2D(int MAX_POSITION, int MIN_POSITION) {
        this.POSITION_2D[0]=(int)Math.floor(Math.random() * (MAX_POSITION - MIN_POSITION + 1) + MIN_POSITION);
        this.POSITION_2D[1]=(int)Math.floor(Math.random() * (MAX_POSITION - MIN_POSITION + 1) + MIN_POSITION);
    }
    public void initSPEED_2D(int MAX_SPEED, int MIN_SPEED) {
        this.SPEED_2D[0]=(int)Math.floor(Math.random() * (MAX_SPEED - MIN_SPEED + 1) + MIN_SPEED);
        this.SPEED_2D[1]=(int)Math.floor(Math.random() * (MAX_SPEED - MIN_SPEED + 1) + MIN_SPEED);
    }
    public int getSTURCTURAL_INTEGRITY() {
        return this.STURCTURAL_INTEGRITY;
    }    
    public int getATP_ENERGY() {
        return this.ATP_ENERGY;
    }
    public int getINTERNAL_CAPACITY() {
        return this.INTERNAL_CAPACITY;
    }
    public boolean getSEXUAL_DISPONIBILITY() {
        return this.SEXUAL_DISPONIBILITY;
    }
    public int[] getPOSITION_2D() {
        return this.POSITION_2D;
    }
    public float[] getSPEED_2D() {
        return this.SPEED_2D;
    }
    public ArrayList getDIGDNA() {
        return this.DIGDNA;
    }

    public void setSTURCTURAL_INTEGRITY(byte tmpVAR) {
        this.STURCTURAL_INTEGRITY=tmpVAR;
    }
    public void setATP_ENERGY(byte tmpVAR) {
        this.ATP_ENERGY=tmpVAR;
    }
    public void setINTERNAL_CAPACITY(byte tmpVAR) {
        this.INTERNAL_CAPACITY=tmpVAR;
    }
    public void setSEXUAL_DISPONIBILITY(boolean tmpVAR) {
        this.SEXUAL_DISPONIBILITY=tmpVAR;
    }
    public void setPOSITION_2D(int[] tmpVAR) {
        this.POSITION_2D=tmpVAR;
    }
    public void setSPEED_2D(float[] tmpVAR) {
        this.SPEED_2D=tmpVAR;
    }
    public void mutateRANDOM_GEN(double MUTATION_RATE){//MUTATION_RATE is a number between 0 and 1
        int MIN_NUMBER_OF_CHROMOSOMES = 0;
        int MIN_INDEX = 0;
        int MAX_NUMBER_OF_CHROMOSOMES = this.DIGDNA.size()-1;
        int MAX_INDEX;
        int RANDOM_INDEX_OF_CHROMOSOMES;
        int RANDOM_INDEX;

        for(int i=0;i<(int)Math.floor(MUTATION_RATE*100);i++){
            RANDOM_INDEX_OF_CHROMOSOMES = (int)Math.floor(Math.random() * (MAX_NUMBER_OF_CHROMOSOMES - MIN_NUMBER_OF_CHROMOSOMES + 1) + MIN_NUMBER_OF_CHROMOSOMES);
            MAX_INDEX = this.DIGDNA.get(RANDOM_INDEX_OF_CHROMOSOMES).size()-1;
            RANDOM_INDEX = (int)Math.floor(Math.random() * (MAX_INDEX - MIN_INDEX + 1) + MIN_INDEX);
            this.DIGDNA.get(RANDOM_INDEX_OF_CHROMOSOMES).set(RANDOM_INDEX,!(boolean)(this.DIGDNA.get(RANDOM_INDEX_OF_CHROMOSOMES).get(RANDOM_INDEX)));
        }//(boolean)(tmpOBJ.DIGDNA.get(RANDOM_INDEX_OF_CHROMOSOMES).get(RANDOM_INDEX))

    }
    //static void addCHROMOSOME(boolean[][] NEW_CHROMOSOME){
    //    Criature tmpOBJ = new Criature();
    //    int NUMBER_OF_CHROMOSOMES = tmpOBJ.DIGDNA.length;
    //    int NUMBER_OF_ROWS = tmpOBJ.DIGDNA[0].length;
    //    int NUMBER_OF_COLUMNS = tmpOBJ.DIGDNA[0][0].length;
    //    boolean[][][] tmpARRAY = new boolean[NUMBER_OF_CHROMOSOMES][NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
    //    tmpOBJ.DIGDNA = new 
    // }
}
