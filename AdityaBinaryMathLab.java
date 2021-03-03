/*
 *
 *   Author: Aditya Chotai
 *   E-mail: avc6129@psu.edu
 *   Course: CMPSC221
 *   Assignment: Programming Assignment 2
 *   Due date: 3/3/2021
 *   File: AdityaBinaryMathLab.java
 *   Purpose: My Java application that implements a binary math tutor
 *   Compiler/IDE: Java SE Development Kit (OpenJDK) 11.0.2/VS Code 1.52.1
 *   Operating system: MS Windows 10 Home
 *   Reference(s): Java 11 API - Oracle Documentation
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class AdityaBinaryMathLab {
    public static void main(String[] args) 
    {
        ArrayList<ProblemAndAnswer> lst = new ArrayList<>();
        //Addition problems 
        lst.add(new ProblemAndAnswer("10101010 + 11001100","0101110110"));
        lst.add(new ProblemAndAnswer("101000 + 011110","01000110"));
        lst.add(new ProblemAndAnswer("11101000 + 0100110","0100001110"));
        lst.add(new ProblemAndAnswer("1001110 + 0101010","01111000"));
        lst.add(new ProblemAndAnswer("1011001010 + 0110011010","010001100100"));

        //Subtraction problems 
        lst.add(new ProblemAndAnswer("11001100 – 10101010","0100010"));
        lst.add(new ProblemAndAnswer("101000 - 011110","001010"));
        lst.add(new ProblemAndAnswer("11101000 - 0100110","011000010"));
        lst.add(new ProblemAndAnswer("1001110 – 0101010","0100100"));
        lst.add(new ProblemAndAnswer("1011001010 – 0110011010","0100110000"));

        //Multiplication problems 
        lst.add(new ProblemAndAnswer("11001100 × 10101010","01000011101111000"));
        lst.add(new ProblemAndAnswer("101000 × 011110","010010110000"));
        lst.add(new ProblemAndAnswer("11101000 × 0100110","010001001110000"));
        lst.add(new ProblemAndAnswer("1001110 × 0101010","0110011001100"));
        lst.add(new ProblemAndAnswer("1011001010 × 0110011010","01000111011110000100"));
        
        while(!lst.isEmpty())
        {
            int num=lst.size();
            int rand=(int)(Math.random()*num);
            ProblemAndAnswer t = lst.get(rand);
            lst.remove(rand);
            String res;
            try
            {
                res = JOptionPane.showInputDialog(null,"Answer " + t.getProblem()+" = ?","My Binary Math Lab",JOptionPane.QUESTION_MESSAGE);
                if(res.equals("cancel"))
                    JOptionPane.showMessageDialog(null,"May be you'll like the next problem better!","My Binary Math Lab",JOptionPane.INFORMATION_MESSAGE);
                else if(t.checkAnswer(res))
                    JOptionPane.showMessageDialog(null,"Congrats, Your are Correct!","My Binary Math Lab",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"Sorry, but No, the answer is incorrect. :-(","My Binary Math Lab",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"May be you'll like the next problem better!","My Binary Math Lab",JOptionPane.INFORMATION_MESSAGE);
            }
            String[] choices = { "Yes", "No" };
            String input = (String) JOptionPane.showInputDialog(null, "Do You want to continue practicing (YES/NO)?", "My Binary Math Lab",
            JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]); // Initial choice
            if(input.equals("No"))
                break;
        }
    }
}
