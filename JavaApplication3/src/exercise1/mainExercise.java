/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author bbalt
 */
public class mainExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread one = new sumPic("thread 1", "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        one.start();
    }
    
    
    
}
