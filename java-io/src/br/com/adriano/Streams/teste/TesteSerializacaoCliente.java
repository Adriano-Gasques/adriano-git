package br.com.adriano.Streams.teste;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

      /*
        Cliente cliente = new Cliente();
        cliente.setNome("adriano gasques");
        cliente.setProfissao("est");
        cliente.setCpf("1234456657");


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();
*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome() +" "+ cliente.getCpf());

    }
}