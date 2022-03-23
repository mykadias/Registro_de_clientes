package helpers;

import enums.EstadoCivil;
import enums.Sexo;

import javax.swing.*;

public class InputHelper {

    public static Integer lerId(String mensagem) {

        String id = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(id);
    }
    public static String lerTexto(String mensagem) {

        return JOptionPane.showInputDialog(mensagem);
    }
    public static Sexo lerSexo(){

        Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexo do Cliente:\n(1)Feminino\n(2)Masculino\n(3)Outros"));

        switch (opcao) {
            case 1:
                return Sexo.FEMININO;
            case 2:
                return Sexo.MASCULINO;
            case 3:
                return Sexo.OUTROS;
            default:
                return null;
        }
    }
    public static EstadoCivil lerEstadoCivil() {

        Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o estado civil do Cliente:\n(1)Solteiro\n(2)Casado\n(3)Divorciado\n(4)Viúvo"));

        switch (opcao) {
            case 1:
                return EstadoCivil.SOLTEIRO;
            case 2:
                return EstadoCivil.CASADO;
            case 3:
                return EstadoCivil.DIVORCIADO;
            case 4:
                return EstadoCivil.VIUVO;
            default:
                return null;
        }
    }

}
