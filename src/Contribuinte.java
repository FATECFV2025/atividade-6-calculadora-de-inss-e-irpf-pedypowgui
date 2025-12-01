public class Contribuinte implements CalculadoraTributo{
    private String nome, cpf, tipoContribuinte;
    private double salarioBruto;

    //Método que exibe os dados do contribuinte
    public void exibirResumo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo de contribuinte: " + this.tipoContribuinte);
        System.out.println("CPF: " + getCPF());
        System.out.printf("Salário Bruto: R$%.2f", this.salarioBruto);
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setTipoContribuinte(String tipoContribuinte){
        this.tipoContribuinte = tipoContribuinte;
    }

    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public String getTipoContribuinte(){
        return this.tipoContribuinte;
    }

    public double getSalarioBruto(){
        return this.salarioBruto;
    }

    //Implementações dos métodos da interface
    public double calcularINSS(){
        return 0;
    }
    
    public double calcularIRPF(){
        return 0;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }
}
