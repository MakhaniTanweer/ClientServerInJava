
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hikmat
 */
public class MyThread implements Runnable {

    
    private final JTextArea jText1;
    private final String    text;

    public MyThread(JTextArea jText1, String text) {
        this.jText1 = jText1;
        this.text = text;
    }
    
    
    @Override
    public void run() {
       jText1.setText(text); 
    }
    
}
