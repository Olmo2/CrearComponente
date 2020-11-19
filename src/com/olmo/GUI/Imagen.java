/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Dams2
 */
public class Imagen implements Serializable {

    private File ruta;
    private Float op;

    public Imagen(File ruta, Float op) {
        this.ruta = ruta;
        this.op = op;
    }

    public File getRuta() {
        return ruta;
    }

    public void setRuta(File ruta) {
        this.ruta = ruta;
    }

    public Float getOp() {
        return op;
    }

    public void setOp(Float op) {
        this.op = op;
    }
    
    
    
   
    
}
