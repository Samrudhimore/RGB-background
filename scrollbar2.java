import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
 
 class ScrollbarDemo extends Frame implements AdjustmentListener
 {
      Label lbl,lbl1,lbl2;
      Scrollbar sc,sc1,sc2;
      Color c1;
       ScrollbarDemo()
      {

            setVisible(true);
            setLayout(null);
            setSize(1400,1200);
            setBackground(Color.BLACK);
            setForeground(Color.WHITE);
            
            
            lbl=new Label("Red");
            lbl.setBounds(120,120,120,30);
            add(lbl);

            sc = new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255);
            sc.setBounds(250,120,500,20);
            add(sc);
            sc.addAdjustmentListener(this);
            

            lbl1=new Label("Green");
            lbl1.setBounds(120,160,120,30);
            add(lbl1);

            sc1 = new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255);
            sc1.setBounds(250,160,500,20);
            add(sc1);
            sc1.addAdjustmentListener(this);


            lbl2=new Label("Blue");
            lbl2.setBounds(120,200,120,30);
            add(lbl2);

            sc2 = new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255);
            sc2.setBounds(250,200,500,20);
            add(sc2);
            sc2.addAdjustmentListener(this);
            
            
            Font f1=new Font("Times new Roman",Font.BOLD,12);
            setFont(f1);
            
           
            
        }
       
     public void adjustmentValueChanged(AdjustmentEvent e)
     {  

        int r = sc.getValue();  
        int g = sc1.getValue();
        int b = sc2.getValue();
        lbl.setText(""+r);
        lbl1.setText(""+g);
        lbl2.setText(""+b);
        
        c1 = new Color(r,g,b);
        setBackground(c1);
     }
}
 class scrollbar2
 {
 public static void main(String[] args) 
 {    

    new ScrollbarDemo();
   
   }
}

