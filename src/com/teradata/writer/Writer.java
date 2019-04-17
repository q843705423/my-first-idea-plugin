package com.teradata.writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Writer {
    public void t(){
        InputStream is = this.getClass().getResourceAsStream("/template/html.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = "";
        while (true) {
            try {
                if ((s = br.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }
    }
}
