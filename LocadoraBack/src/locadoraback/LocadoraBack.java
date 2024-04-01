package locadoraback;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
/*
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.text.ParseException;
import java.util.TimeZone;
*/
public class LocadoraBack {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        /*
        Cliente cli    = new Cliente();
        System.out.println("Informe o código do Cliente");
        cli.setCodCliente(sc.nextInt());

        cli.setNomCliente("Joao Francisco");
        cli.setEmail("joaof@gmail.com");
        cli.setFonecel("(47)98955-4556");
        
        // calcula novo salario
        System.out.println("Informe o salario atual");
        double salarioAtual = sc.nextDouble();
        System.out.println("Informe o % de ajuste");
        double percAjuste = sc.nextDouble();

        System.out.println("Novo salário = " + cli.recalculaSalario(salarioAtual, percAjuste));
        System.out.println(cli.toString());
        /*
        Veiculo ve1 = new Veiculo();
        ve1.setCodVeiculo(1);
        ve1.setMarcaVeiculo("Citroen");
        ve1.setModeloVeiculo("C3");
        ve1.setPlacaVeiculo("AKA0I04");
        ve1.setLocado(false);
        /*
        // define o formato da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        // define a data e converte para Date
        var dataFormatada = sdf.parse("23/10/2020");
        ve1.setDataFabricacao(dataFormatada);
        
        // formatacao de data para saída
        String dataSaida = sdf.format(ve1.getDataFabricacao());
        System.out.println("Data Saida : " + dataSaida);
        System.out.println(ve1.toString());    
    */
        System.out.println("Dados Caminhao");
        Caminhao  c1 = new Caminhao(0, 0, 0, 0, "Ford", "F350", "ABC1234", false, new Date());
        c1.setCodVeiculo(2);
        c1.setMarcaVeiculo("Ford");
        c1.setModeloVeiculo("F350");
        c1.setPlacaVeiculo("ABC1234");
        c1.setLocado(false);
        
        c1.setPotenciaHP(450);
        c1.setQtdEixos(3);
        c1.setTipoCaminhao('B');        
        c1.imprimirDadosVeiculo();
        
        System.out.println("--------------------------");
        System.out.println("Dados Automovel");        
        Automovel a2 = new Automovel();
        a2.setCodVeiculo(200);
        a2.setMarcaVeiculo("Audi");
        a2.setModeloVeiculo("TT");
        a2.setPlacaVeiculo("FIM4567");
        a2.setLocado(true);
        
        a2.setPotenciaHP(250);
        a2.setQtdPassageiros(5);
        a2.imprimirDadosVeiculo();
        
        System.out.print("Informe a quantidade de Litros: ");
        int qtdLitros = sc.nextInt();
        
        System.out.print("Informe o preco do combustível: ");
        float precoComb = sc.nextFloat();
        
        if(a2.abastecerVeiculo(qtdLitros, "Gasolina Adtivada", precoComb)){
            System.out.println("Abastecimento efetuado com sucesso!");
        } else {
            System.out.println("Falha no abastecimento. Verifique!!");
        }
    }
}