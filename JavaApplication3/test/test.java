/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercise1.getPic;
import exercise1.sumPic;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bbalt
 */
public class test {
    
    public test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void createInstances() {
        getPic test = new getPic();
        Thread t1 = new sumPic("thread1", "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        t1.start();
        int s1 = test.getSum();
        
        Thread t2 = new sumPic("thread2", "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        t2.start();
        int s2 = test.getSum();
        
        Thread t3 = new sumPic("thread3", "https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png"); 
        t3.start();
        int s3 = test.getSum();
        
        
        
        
    }
    
}
