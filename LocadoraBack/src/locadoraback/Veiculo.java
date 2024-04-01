package locadoraback;

import java.util.Date;

public class Veiculo {
    private int     codVeiculo;
    private String  marcaVeiculo;
    private String  modeloVeiculo;
    private String  placaVeiculo;
    private boolean locado;
    private Date dataFabricacao;

    
    public Veiculo (int codVeiculo, String marcaVeiculo, String modeloVeiculo, String placaVeiculo, boolean locado, Date dataFabricacao){
            this.codVeiculo     = codVeiculo;
            this.marcaVeiculo   = marcaVeiculo;
            this.modeloVeiculo  = modeloVeiculo;
            this.placaVeiculo   = placaVeiculo;
            this.locado         = locado;
            this.dataFabricacao = dataFabricacao;
   }
    
    public boolean abastecerVeiculo (int qtdLitros, String tipoComb, float precoComb){
        return true;
    }    
        
    @Override
    public String toString() {
        return "Veiculo{" + "codVeiculo=" + codVeiculo + ", marcaVeiculo=" 
                + marcaVeiculo + ", modeloVeiculo=" + modeloVeiculo 
                + ", placaVeiculo=" + placaVeiculo + ", locado=" + locado 
                + ", Data Fabricacao=" + dataFabricacao + '}';
    }

    //    Area de Getters e Setters
    public int getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(int codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    
    
}
