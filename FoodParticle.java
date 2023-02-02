public class FoodParticle {
    private boolean IS_MEAT = false;
    private short SIZE = 1;
    private short MASS = 1;
    private int[] POSITION_2D = {0,0};
    private float[] SPEED_2D = {0,0};
    public void initPOSITION_2D(int MAX_POSITION, int MIN_POSITION) {
        this.POSITION_2D[0]=(int)Math.floor(Math.random() * (MAX_POSITION - MIN_POSITION + 1) + MIN_POSITION);
        this.POSITION_2D[1]=(int)Math.floor(Math.random() * (MAX_POSITION - MIN_POSITION + 1) + MIN_POSITION);
    }
    public void initSPEED_2D(int MAX_SPEED, int MIN_SPEED) {
        this.SPEED_2D[0]=(int)Math.floor(Math.random() * (MAX_SPEED - MIN_SPEED + 1) + MIN_SPEED);
        this.SPEED_2D[1]=(int)Math.floor(Math.random() * (MAX_SPEED - MIN_SPEED + 1) + MIN_SPEED);
    }
    public int[] getPOSITION_2D() {
        return this.POSITION_2D;
    }
    public boolean getIS_MEAT() {
        return this.IS_MEAT;
        
    }
    public short getSIZE() {
        return this.SIZE;
        
    }
    public short getMASS() {
        return this.MASS;
        
    }
    public float[] getSPEED_2D() {
        return this.SPEED_2D;
        
    }
    public void setIS_MEAT(boolean tmpVAR) {
        this.IS_MEAT=tmpVAR;
        
    }
    public void setSIZE(short tmpVAR) {
        this.SIZE=tmpVAR;
        
    }
    public void setMASS(short tmpVAR) {
        this.MASS=tmpVAR;
        
    }
    public void setPOSITION_2D(int[] tmpVAR) {
        this.POSITION_2D=tmpVAR;
        
    }
    public void setSPEED_2D(float[] tmpVAR) {
        this.SPEED_2D=tmpVAR;
        
    }

}
