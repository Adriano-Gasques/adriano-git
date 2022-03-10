package br.com.adriano.Streams.teste;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

    public static void main (String[] args) throws Exception {

        Scanner scanner = new Scanner( new File("contas.csv"), "UTF-8");


        while(scanner.hasNextLine()) {

            String linha = scanner.nextLine();//ler linha
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);

            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            Double saldo = linhaScanner.nextDouble();


            String valorFormatado = String.format(new Locale("pt","br"),"%s - %04d-%04d, %20s:  %10.2f",tipoConta,agencia,numero,titular,saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();



            //String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));
            //System.out.println(valores[3]);

        }
        scanner.close();

    }
}
