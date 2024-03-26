package locadoraback;

public class Cliente {

    private int codCliente;
    private String nomCliente;
    private String email;
    private String fonecel;

    public double recalculaSalario(double salarioAtual, double percAjuste) {
        double salarioNovo = 0;
        salarioNovo = salarioAtual * ((percAjuste / 100) + 1);
        return salarioNovo;
    }

    @Override
    public String toString() {
        return "Cliente.:" + this.codCliente + "\nNome: " + this.nomCliente
                + "\nemail: " + this.email + "\nFone : " + this.fonecel;
    }

    // area de getters e setters
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFonecel() {
        return fonecel;
    }

    public void setFonecel(String fonecel) {
        this.fonecel = fonecel;
    }
}
