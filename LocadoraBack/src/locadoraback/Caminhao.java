package locadoraback;

public class Caminhao extends Veiculo {

    private int qtdEixos;
    private int potenciaHP;
    private char tipoCaminhao; // B = Baú  C =  Caçamba

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
        System.out.println("Qtd.Eixos.......: " + this.getQtdEixos());
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }

    public char getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(char tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    
}
