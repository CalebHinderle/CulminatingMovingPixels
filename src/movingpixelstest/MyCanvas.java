/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movingpixelstest;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author cahin7692
 */
class MyCanvas extends JPanel{
  int x1 = 100;
  public int y1 = 50;
  int x2 = 0;
  int y2 = 200;
  public int ovalTopToBot = 260;
  public int ovalLeftToRight = 140;
  
  public MyCanvas(int right, int down) {
    Timer timer = new Timer(10, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
          
//        if(x1>=0){
//            x1 -= 1;   
//        }
//        else{
//            x1 += right; 
//        }
//        
//        if(y1>=0){
//            y1 -= 1;
//        }
//        else{
//            y1 += down;
//        }
//        
//        repaint();
      }
      
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawOval(x1, y1, 20, 20);
    g.drawOval(100,50,ovalTopToBot,ovalLeftToRight);
  }
}

