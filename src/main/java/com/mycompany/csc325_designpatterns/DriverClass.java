package com.mycompany.csc325_designpatterns;

/**
 *
 * @author MurilloEdson
 */
public class DriverClass {
    
    public static void main(String[] args) {
        TV myTV = new TVSetFactory().getInstance("4K");
        
        myTV.specs();
    }
}

