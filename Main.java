import java.util.ArrayList;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("Images");
        
        for (File file : dir.listFiles()) {
            System.out.println(file);
            BufferedImage img = ImageIO.read(file);

            int clr;
            int r, g, b;

            for (int y = 0; y < img.getHeight(); y++) {
                for (int x = 0; x < img.getWidth(); x++) {
                    clr = img.getRGB(x, y);
                    r = (clr & 0x00ff0000) >> 16;
                    g = (clr & 0x0000ff00) >> 8;
                    b = clr & 0x000000ff;

                    System.out.println("Red Color value = " + r);
                    System.out.println("Green Color value = " + g);
                    System.out.println("Blue Color value = " + b);
                }
            }
        }
    }
}