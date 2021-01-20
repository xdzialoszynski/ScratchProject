package com.awe.exercices;

import org.junit.Test;

public class CheckDigitTest {
    @Test
    public void main() {
        final String filePath = "/home/dzialoszynski/toto";
        String param[] = new String[10];
        param[0] = filePath;
        CheckDigit.main(param);

    }

}