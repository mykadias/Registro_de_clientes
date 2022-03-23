package principal;

import entities.Cliente;
import helpers.InputHelper;
import repositories.ClienteRepository;

import javax.swing.*;

public class Program {
    public  static void main(String[]args) {
        Cliente cliente = new Cliente();

        try {
            cliente.setIdCliente(InputHelper.lerId("Infome o ID do Cliente: "));
            cliente.setNome(InputHelper.lerTexto("Informe o nome do Cliente: "));
            cliente.setCPF(InputHelper.lerTexto("Informe o CPF do Cliente: "));
            cliente.setEstadoCivil(InputHelper.lerEstadoCivil());
            cliente.setSexo(InputHelper.lerSexo());

            ClienteRepository clienteRepository = new ClienteRepository();
            ClienteRepository.exportarDados(cliente);

        JOptionPane.showConfirmDialog(null, "Dados gravados com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n"+ e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }

}
