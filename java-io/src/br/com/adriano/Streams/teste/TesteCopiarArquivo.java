package br.com.adriano.Streams.teste;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main (String[] args) throws IOException {
         //fluxo de entrada com arquivos

        FileInputStream fis = new FileInputStream("iojava.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("iojava2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        String linha = br.readLine();

        while(linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();
    }
}
