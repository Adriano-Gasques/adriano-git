package br.com.adriano.Streams.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {

    public static void main (String[] args) throws IOException {

        PrintStream ps = new PrintStream("iojava3.txt");

        ps.println("adrianoa jasidhfuiashduifhasiudf");
        ps.println();
        ps.println("lucas aufsdighisdhfiashuidfkas");

        ps.close();

    }
}
