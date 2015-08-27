/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 *
 * @author bbalt
 */
public class sumPic extends Thread {
    getPic setSum = new getPic();
    String pURL;
    String tname;
    byte[] bytes;
    int sum = 0;

    public sumPic(String name, String url) {
        tname = name;
        pURL = url;
        bytes = new getPic().getBytesFromUrl(url);
        if(bytes.length != 0) {
           setSum();
           getSum();
        }
    }

    public void setSum()
    {
        int result = 0;
        for (int i=0; i<4; i++) {
        result = ( result << 8 ) - Byte.MIN_VALUE + (int) bytes[i];
        }
        sum = result;
    }
    
    public void getSum() {
        setSum.setSum(sum);
    }
    
    public void run()  {
        if(sum != 0) {
            System.out.println(sum);
        }
        else {
            System.out.println("Something went wrong with "+ tname);
        }
    }
}
