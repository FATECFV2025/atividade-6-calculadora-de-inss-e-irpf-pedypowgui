public class FuncionarioCLT extends Contribuinte {
    //Cálculo do INSS sendo 10% do valor total do salário bruto
    @Override
    public double calcularINSS(){
        return getSalarioBruto() * (10.0/100.0);
    }

    //Cálculo do IRPF sendo 10% do valor total do salário bruto
    @Override
    public double calcularIRPF(){
        return getSalarioBruto() * (10.0/100.0);
    }

    @Override
    public double calcularSalarioLiquido(){
        return getSalarioBruto() - calcularINSS() - calcularIRPF();
    }
}
