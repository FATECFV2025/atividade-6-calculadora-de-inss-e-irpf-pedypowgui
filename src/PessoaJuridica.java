public class PessoaJuridica extends Contribuinte {
    //Cálculo do INSS sendo 30% do valor total do salário bruto
    @Override
    public double calcularINSS(){
        return getSalarioBruto() * (30.0/100.0);
    }

    //Cálculo do IRPF sendo 30% do valor total do salário bruto
    @Override
    public double calcularIRPF(){
        return getSalarioBruto() * (30.0/100.0);
    }

    @Override
    public double calcularSalarioLiquido(){
        return getSalarioBruto() - calcularINSS() - calcularIRPF();
    }
}
