/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chny.lexico;

/**
 *
 * @author Jose
 */
public class Flotantes {
    public boolean q0(String c, int pos)
    {
        if(pos < c.length())
        {
            switch(c.substring(pos, pos + 1))
            {
                case "0":
                    return q1(c, pos + 1);
                case "1":
                    return q1(c, pos + 1);
                case "2":
                    return q1(c, pos + 1);
                case "3":
                    return q1(c, pos + 1);
                case "4":
                    return q1(c, pos + 1);
                case "5":
                    return q1(c, pos + 1);
                case "6":
                    return q1(c, pos + 1);
                case "7":
                    return q1(c, pos + 1);
                case "8":
                    return q1(c, pos + 1);
                case "9":
                    return q1(c, pos + 1);
                default:
                    return false;
            }
        }
        return false;
    }
    
    private boolean q1(String c, int pos)
    {
                if(pos < c.length())
        {
            switch(c.substring(pos, pos + 1))
            {
                case "0":
                    return q1(c, pos + 1);
                case "1":
                    return q1(c, pos + 1);
                case "2":
                    return q1(c, pos + 1);
                case "3":
                    return q1(c, pos + 1);
                case "4":
                    return q1(c, pos + 1);
                case "5":
                    return q1(c, pos + 1);
                case "6":
                    return q1(c, pos + 1);
                case "7":
                    return q1(c, pos + 1);
                case "8":
                    return q1(c, pos + 1);
                case "9":
                    return q1(c, pos + 1);
                case ".":
                    return q2(c, pos + 1);
                default:
                    return false;
            }
        }
        return true;
    }
    
    private boolean q2(String c, int pos)
    {
                if(pos < c.length())
        {
            switch(c.substring(pos, pos + 1))
            {
                case "0":
                    return q1(c, pos + 1);
                case "1":
                    return q1(c, pos + 1);
                case "2":
                    return q1(c, pos + 1);
                case "3":
                    return q1(c, pos + 1);
                case "4":
                    return q1(c, pos + 1);
                case "5":
                    return q1(c, pos + 1);
                case "6":
                    return q1(c, pos + 1);
                case "7":
                    return q1(c, pos + 1);
                case "8":
                    return q1(c, pos + 1);
                case "9":
                    return q1(c, pos + 1);
                default:
                    return false;
            }
        }
        return false;
    }
}