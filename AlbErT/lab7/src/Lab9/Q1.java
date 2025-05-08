package Lab9;

import java.io.*;
public class Q1{
    public static void main(String[] args)throws Exception {
        String str = "Java is Object oriented programming";
        byte []bytedata = str.getBytes();
        FileOutputStream fout = new FileOutputStream("text.txt");
        fout.write(bytedata);
        fout.close();
        System.out.println("File write successful.");
        
        char [] vowel = {'a','e','i','o','u'};
        FileInputStream fin = new FileInputStream("text.txt");
        int ch, count = 0;
        while((ch=fin.read())!= -1){
            System.out.print((char)ch);
            char lowerch = Character.toLowerCase((char)ch);
            for(int i=0;i<vowel.length;i++){
                if(lowerch == vowel[i]){
                    count++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Total number of vowels: "+count);
        fin.close();
    }
}