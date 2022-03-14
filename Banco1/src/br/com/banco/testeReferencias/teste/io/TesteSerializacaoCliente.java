package br.com.banco.testeReferencias.teste.io;

import br.com.banco.modelos.Cliente;
import br.com.banco.modelos.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Cliente cliente = new Cliente();
        cliente.setNome("adriano gasques");
        cliente.setProfissao("est");
        cliente.setCpf("1234456657");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(222.3);
        cc.setTitular(cliente);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

    }
}