package com.ysl.design.pattern.decorate.io;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class IOTest {
    public static void main(String[] args) throws Exception{
        DataInputStream in = new DataInputStream(new FileInputStream("test.txt"));
        String str;
        while ((str = in.readLine())!=null){
            System.out.println(str);
        }
        in.close();
    }
}
