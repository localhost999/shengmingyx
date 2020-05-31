package jiedui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jiedui.xibaozt;
import jiedui.suanfa;
import jiedui.show;
import jiedui.window;
import jiedui.main;



public class main extends Thread {
	static main start;
    static xibaozt cs;
    static suanfa jud;
    static show ld;
    static window wind;
    
    static int s=1;
    
    //存放细胞状态
    static boolean[][] state_one;
    static JPanel[][] jPanel;
    //初始化GUI界面
    public main(int row,int col)
    {
    	if(row<=0||col<=0) {
    		s=0;
    	}
    	else {
        state_one = new boolean[row][col];
        wind = new window(row,col);
        jPanel = wind.jPanel;
    	}
    }


    public int gets() {
    	return s;
    }








	public static void main(String[] args)
    {
 
            start = new main(30,30);
            cs = new xibaozt(state_one);
            jud = new suanfa(state_one, jPanel);
            ld = new show(state_one, jPanel);
    }
}





