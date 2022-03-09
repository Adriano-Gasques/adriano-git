package br.com.adriano.Streams.teste;

import java.io.*;

public class TesteEscritaFileWrite {

    public static void main (String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("iojava2.txt");
//       Writer osw = new OutputStreamWriter(fos);
//       BufferedWriter bw = new BufferedWriter(osw);

//        FileWriter fw = new FileWriter("iojava2.txt");
//        BufferedWriter bw = new BufferedWriter(fw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("iojava2.txt"));

        bw.write("adrianoa jasidhfuiashduifhasiudf");
        bw.write("\n");
        bw.write("lucas aufsdighisdhfiashuidfkas");

        bw.close();

    }
}
