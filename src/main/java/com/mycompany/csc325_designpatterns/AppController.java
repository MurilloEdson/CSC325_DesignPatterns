package com.mycompany.csc325_designpatterns;

/**
 *
 * @author MurilloEdson
 */
public class AppController {
    private static AppController instance;
    
    private AppController(){
        System.out.println("Instance created");
    }
    
    public static AppController getInstance(){
        if( instance == null){
            
            synchronized(AppController.class){
                if( instance == null)
                    instance = new AppController();
            }
     
        }
        return instance;
    }
}
