/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.GUI;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;



/**
 *
 * @author Dams2
 */
public class JPanel extends javax.swing.JPanel implements Serializable{
    
    private Imagen img;

    
    public JPanel() {
        
        
    }

    public Imagen getImg() {
        return img;
    }

    public void setImg(Imagen img) {
        this.img = img;
    }

   

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if(img!=null && img.getRuta().exists()){
        ImageIcon imagen = new ImageIcon(img.getRuta().getAbsolutePath());
        Graphics2D g2d  = (Graphics2D)g;
        g2d.setComposite(AlphaComposite .getInstance(AlphaComposite.SRC_OVER,img.getOp()));
        g.drawImage(imagen.getImage(),0,0,null);
      g2d.setComposite(AlphaComposite .getInstance(AlphaComposite.SRC_OVER,1));
        }
        
        
    }

   
    
    
    
}
