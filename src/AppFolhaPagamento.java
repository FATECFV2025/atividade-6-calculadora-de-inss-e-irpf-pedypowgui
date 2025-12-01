import java.util.Scanner;

public class AppFolhaPagamento {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome, cpf;
        double salarioBruto;
        int tipoContribuinte;
        
        //Entrada de dados do contribuinte
        System.out.println("=== APLICATIVO - FOLHA DE PAGAMENTO ===");
        System.out.printf("Nome: ");
        nome = ler.nextLine();
        System.out.printf("CPF: ");
        cpf = ler.nextLine();
        System.out.printf("Salario bruto: ");
        salarioBruto = ler.nextDouble();
        System.out.println("Tipo de contribuinte\n[1] - Funcionário CLT\n[2] - Estagiário\n[3] - Prestador de serviço(PJ)");
        tipoContribuinte = ler.nextInt();
        ler.close();

        //Instanciamento dinâmico do objeto com base na seleção do usuário
        Contribuinte contribuinte = new Contribuinte();

        if(tipoContribuinte == 1){
            contribuinte = new FuncionarioCLT();
            contribuinte.setTipoContribuinte("Funcionário CLT");
        } else if(tipoContribuinte == 2){
            contribuinte = new Estagiario();
            contribuinte.setTipoContribuinte("Estagiário");
        } else if(tipoContribuinte == 3){
            contribuinte = new PessoaJuridica();
            contribuinte.setTipoContribuinte("Prestador de serviços(PJ)");
        }

        //Atribuição dos valores da entrada do usuário
        contribuinte.setNome(nome);
        contribuinte.setCPF(cpf);
        contribuinte.setSalarioBruto(salarioBruto);

        //Chamada dos métodos para demonstração do polimorfismo
        System.out.println("\n=== INFORMAÇÕES DO CONTRIBUINTE - GERAL ===");
        contribuinte.exibirResumo();
        System.out.println("\n\n=== INFORMAÇÕES DO CONTRIBUINTE - SALÁRIO ===");
        System.out.printf("Valor do INSS: R$%.2f", contribuinte.calcularINSS());
        System.out.printf("\nValor do IRPF: R$%.2f", contribuinte.calcularIRPF());
        System.out.printf("\nSalário líquido: R$%.2f", contribuinte.calcularSalarioLiquido());
    }    
}
