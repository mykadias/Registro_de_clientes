package repositories;

import entities.Cliente;

import java.io.File;
import java.io.PrintWriter;

public class ClienteRepository {

    public static void exportarDados(Cliente cliente) throws Exception {

        PrintWriter ArquivoGravarDados = new PrintWriter(new File("C:\\temp\\Client.txt"));

        ArquivoGravarDados.write("---------------REGISTRO DE CLIENTES---------------\n");
        ArquivoGravarDados.write("\nID do Cliente: "+ cliente.getIdCliente());
        ArquivoGravarDados.write("\nNome do Cliente: "+cliente.getNome());
        ArquivoGravarDados.write("\nCPF do Cliente: "+cliente.getCPF());
        ArquivoGravarDados.write("\nSexo do Cliente: "+cliente.getSexo());
        ArquivoGravarDados.write("\nEstado civil do Cliente: "+cliente.getEstadoCivil());

        ArquivoGravarDados.flush();
        ArquivoGravarDados.close();



    }
}
