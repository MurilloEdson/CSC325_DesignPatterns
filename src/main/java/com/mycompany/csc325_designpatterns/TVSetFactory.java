package com.mycompany.csc325_designpatterns;

/**
 *
 * @author MurilloEdson
 */
public class TVSetFactory {
    
    public TV getInstance(String str){
        
        switch (str){
            case "4K":
            case "8K":
            case "16K":
            case "LED": return new LedTV();
            case "LCD": return new LCDTV();
            case "PLASMA": return new PlasmaTV();
            default: return new CRTTV();
            
        }
    }
}
