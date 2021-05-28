
package caixaeletronico;
import java.util.Scanner;
public class Caixaeletronico {

  public static void main(String[] args) {
       
       //chamar scanner//
         Scanner ler = new Scanner(System.in);
 
        //Variáveis//
        String CPF, senha = null, opção;
        int saldo = 1000, tentativas = 0, chances = 3;
        //tela de boas vindas ao usuário// 
        System.out.println("Bem vindo(a) ao banco!");
       
        //colher n° do cpf// 
        System.out.println("Digite seu CPF:");
        CPF = ler.nextLine();
        
        //verificar CPF//
       if ("123.456.789.00".equals(CPF)) {
           //colher senha//
           System.out.println("Digite sua senha");
           senha = ler.nextLine();
    } else {
           //cpf errado
           System.out.println("CPF incorreto, tente novamente");
       }
       //verificar senha
     if (senha.equals("01020304")) {
     //caso senha esteja correta mostrar menu
     //mostrar opcções do menu//
         System.out.println("Escolha sua operação:");
         System.out.println("1: Saldo"); //mostra saldo da conta//
         System.out.println("2: Depósito");//saldo + valor depositado//
         System.out.println("3: Saque");//saldo - valor sacado//
         System.out.println("4: Sair");//desloga e volta pra tela inicial//
       //scanner variável opção
       Scanner sc1=new Scanner(System.in);
     int escolha = sc1.nextInt();
        switch (escolha) {
            //------//
           case 1: System.out.println("Você escolheu consultar seu saldo");
               System.err.println("Seu saldo é:" +saldo);
               break;
           //----------//
           case 2: System.out.println("Você escolheu fazer um depósito, digite ovalor");
           int depósito = sc1.nextInt();
            saldo = saldo + depósito;
               System.err.println("o valor foi depositado");
               System.err.println("Seu saldo é:"+saldo);
              break;
          //-----------//
           case 3: System.out.println("Você escolheu fazer um saque, digite o valor a ser retirado");
           int saque=sc1.nextInt();//saque - saldo
           if (saldo >= saque) { //checar se saldo é maior ou igual a saque
           saldo = saldo - saque; //tirar valor sacado do saldo
               System.out.println("Retire seu dinheiro");
               System.out.println("Seu saldo é:" +saldo);
               break;
     } else {
               System.out.println("Saldo Insuficiente");
                }
           //---------//
           case 4: System.err.println("Sair");
            System.exit(0);
            }
        } else {
            do { 
              System.out.println("Senha Incorreta, Digite Novamente!");
                tentativas++;
                System.out.println("Tentativas: " + tentativas);
            } while (tentativas <= chances);
            System.out.println("Tentativas estouradas, acesso não permitido! ");
         }
     }
    }  