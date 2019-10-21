/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class JavaApplication1 {

        /**
         * 給兩個class數值
         */
        public static void main(String[] args) {
        add op1=new add(1.7,3.5);
        dec op2=new dec(4.4);

result R=new result();

System.out.println("op1亂數1"+R.finalresult(op1));
System.out.println("op2亂數2"+R.finalresult(op2));

        }//產生結果
        
}
