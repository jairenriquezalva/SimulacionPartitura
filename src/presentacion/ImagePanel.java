/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author jair
 */
public class ImagePanel extends JPanel {
        private static final long serialVersionUID = 1L;
        private String imagePath;
        private int imageOffsetx;
        private int imageOffsety;
        private int imageHeight;
        private int imageWidth;
        private int imgRotation;
    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }
       
        
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getImageOffsetx() {
        return imageOffsetx;
    }

    public void setImageOffsetx(int imageOffsetx) {
        this.imageOffsetx = imageOffsetx;
    }

    public int getImageOffsety() {
        return imageOffsety;
    }

    public void setImageOffsety(int imageOffsety) {
        this.imageOffsety = imageOffsety;
    }
    
        

        @Override
    public void paintComponent(Graphics g)
    {
        
        if (imagePath != null || imagePath != "")
        {
            
            try {
                ImageIcon image = new ImageIcon(getClass().getResource(imagePath));                
                if(imageHeight == 0 || imageWidth == 0){
                    Dimension dimension = getSize();                
                    g.drawImage(image.getImage(),imageOffsetx,imageOffsety,dimension.width,dimension.height,null);                
                }else{
                    g.drawImage(image.getImage(),imageOffsetx,imageOffsety,imageWidth,imageHeight,null);            
                }
            }catch(Exception e ){
                System.out.println("error al cargar la imagen en el panel "+this.getName());
            }                        
        }
        setOpaque(false);
        super.paintComponent(g);
    }
}
