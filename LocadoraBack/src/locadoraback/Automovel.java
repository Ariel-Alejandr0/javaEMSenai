package locadoraback;

import java.util.Date;

public class Automovel extends Veiculo {

    private int potenciaHP;
    private int qtdPassageiros;

    public Automovel (int potenciaHP, int qtdPassageiros, String marcaVeiculo, 
                       String modeloVeiculo, String placaVeiculo, boolean locado, 
                       Date dataFabricacao){
        
        super(potenciaHP, marcaVeiculo, modeloVeiculo, placaVeiculo, locado, dataFabricacao);
        this.qtdPassageiros = qtdPassageiros;
    }
    
    @Override
    public boolean abastecerVeiculo (int qtdLitros, String tipoComb, float precoComb){
        float vlrAbastecimento = 0;
        vlrAbastecimento = (precoComb * qtdLitros);
        if(vlrAbastecimento > 0){
            System.out.println("Abastecidos " + qtdLitros + " de " + tipoComb + " ao preco de " + precoComb
            + " saindo um preco total de R$" + vlrAbastecimento);
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimirDadosVeiculo() {
        System.out.println("Codigo..........: " + this.getCodVeiculo());
        System.out.println("Marca...........: " + this.getMarcaVeiculo());
        System.out.println("Modelo..........: " + this.getModeloVeiculo());
        var locado = 'N';

        if (this.isLocado()) {
            locado = 'S';
        }
        System.out.println("Locado?(S/N)....: " + locado);
        System.out.println("Potencia .......: " + this.getPotenciaHP() + "HP");
        System.out.println("Qtd.Passageiros.: " + this.getQtdPassageiros());

    }

    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
}
