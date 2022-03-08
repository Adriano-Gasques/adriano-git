package br.com.adriano.Streams.teste;

import java.io.*;

public class TesteEscrita {

    public static void main (String[] args) throws IOException {
         //fluxo de entrada com arquivos

        OutputStream fos = new FileOutputStream("iojava2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("adriano jasidhfuiashduifhasiudf");
        bw.newLine();
        bw.newLine();
        bw.write("lucas aufsdighisdhfiashuidfkas");

        bw.close();

    }
}
