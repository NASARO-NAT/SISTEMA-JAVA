//EXECÍCIO ATIVIDADE DSI
        /** LOJA SPCAR
         * 
         * 
       NOME: LEIDIANE     ANO:2024
       VERSÃO : 1.0 

        */


// IMPORTANTO BIBLIOTECAS PARA PRINTAR NA TELA OS RESULTADOS :

import java.util.Scanner;

//PUBLICAR AS CLASSES

//modelo do carro alugado
public class Carro {

        public String modeloCarro;
        public int anoCarro;
        public int codigoCarro;
        public String corCarro; 


    


    // Construtor da classe Carro
    public Carro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    // Getter e Setter
    public String getModeloCarro() {
        return modeloCarro;
    }
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
}

//valor da diária para locação
public class Diaria_Locacao {
        
        public double valorDiaria;


        // Construtor
        public Diaria_Locacao(double valorDiaria) {
            this.valorDiaria = valorDiaria;
        }
    
        // Getter e Setter
        public double getValorDiaria() {
            return valorDiaria;
        }
    
        public void setValorDiaria(double valorDiaria) {
            this.valorDiaria = valorDiaria;
        }
    }
    
    

//quantidade de dias de locação
public class Dias_Locacao {
    
        public String quantidadeDias;

             // Construtor
    public Dias_Locacao(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    // Getter e Setter
    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
}
    

//quantidade de Km percorridos
public class Qtd_KM {

        public String quantidadeKM;

             // Construtor
            public Qtd_KM(int quantidadeKM) {
                this.quantidadeKM = quantidadeKM;
            }

            // Getter e Setter
            public int getQuantidadeKM() {
                return quantidadeKM;
            }

            public void setQuantidadeKM(int quantidadeKM) {
                this.quantidadeKM = quantidadeKM;
            }
}

   


// Classe Principal
public class SPCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Modelo do carro alugado: ");
        String modeloCarro = scanner.nextLine();

        System.out.print("Valor da diária para locação (R$): ");
        double valorDiaria = scanner.nextDouble();

        System.out.print("Quantidade de dias de locação: ");
        int quantidadeDias = scanner.nextInt();

        System.out.print("Quantidade de Km percorridos: ");
        int quantidadeKM = scanner.nextInt();

        // Criação dos objetos
        Carro carro = new Carro(modeloCarro);
        Diaria_Locacao diariaLocacao = new Diaria_Locacao(valorDiaria);
        Dias_Locacao diasLocacao = new Dias_Locacao(quantidadeDias);
        Qtd_KM qtdKM = new Qtd_KM(quantidadeKM);

        // Cálculo do preço total
        double valorTotalDiarias = diariaLocacao.getValorDiaria() * diasLocacao.getQuantidadeDias();
        double valorTotalKM = qtdKM.getQuantidadeKM() * 0.20;
        double valorTotalAPagar = valorTotalDiarias + valorTotalKM;

        // Exibição do resultado
        System.out.printf("Modelo do carro: %s\n", carro.getModeloCarro());
        System.out.printf("Valor total a pagar: R$ %.2f\n", valorTotalAPagar);

        scanner.close();
    }

