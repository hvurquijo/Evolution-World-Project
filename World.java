//import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;
public class World {
    private int SIZE=1001;
    private float MUTATION_RATE = 0.01f; //theoretically it can go all the way to +infinity, but it's impractical 
    private byte NUMBER_OF_SEASONS = 8;
    private byte CURRENT_SEASON = 1;
    private BufferedImage BACKGROUND_IMAGE = null;
    private float[] DRAG_VELOCITY = {0,0};

    public void setImageFromFile(String FILE_NAME) {
        try {
            BACKGROUND_IMAGE = ImageIO.read(new File(FILE_NAME));
        } catch (IOException e) {
        }
    }
    public void setImageFromURL(String FILE_URL) {
        try {
            BACKGROUND_IMAGE = ImageIO.read(new File(FILE_URL));
        } catch (IOException e) {
        }
    }
    public BufferedImage getBackgroundImage(){
        return this.BACKGROUND_IMAGE;
    }
    public int getSIZE() {
        return this.SIZE;
    }
    public float getMUTATION_RATE() {
        return this.MUTATION_RATE;
    }
    public byte getNUMBER_OF_SEASONS() {
        return this.NUMBER_OF_SEASONS;
    }
    public byte getCURRENT_SEASON() {
        return this.CURRENT_SEASON;
    }
    public float[] getDRAG_VELOCITY(){
        return this.DRAG_VELOCITY;
    }

    public void setSIZE(int tmpVAR) {
        this.SIZE = tmpVAR;        
    }
    public void setMUTATION_RATE(float tmpVAR) {
        this.MUTATION_RATE = tmpVAR;
    }
    public void setNUMBER_OF_SEASONS(byte tmpVAR) {
        this.NUMBER_OF_SEASONS = tmpVAR;
    }
    public void setCURRENT_SEASON(byte tmpVAR) {
        this.CURRENT_SEASON = tmpVAR;
    }
    public void setDRAG_VELOCITY(float[] tmpVAR){
        this.DRAG_VELOCITY = tmpVAR;
    }
}

