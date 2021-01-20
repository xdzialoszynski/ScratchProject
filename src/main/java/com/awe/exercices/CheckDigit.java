package com.awe.exercices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckDigit {
    public static void main(String[] args) {
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(new File(args[0])));
            String line = null;
            int i = 0;
            int result = -1;
            line = in.readLine();
            int n = Integer.valueOf(line);


            result = line.chars().map(x->Character.getNumericValue(x)).reduce(0, (x,y)->x+y);
            while (String.valueOf(result).length()>1){
                line = String.valueOf(result);
                result = line.chars().map(x->Character.getNumericValue(x)).reduce(0, (x,y)->x+y);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
