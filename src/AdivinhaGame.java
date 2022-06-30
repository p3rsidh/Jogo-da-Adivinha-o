import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdivinhaGame {
    public static void main(String[] args) {
        System.out.println("____________________________________");
        System.out.println("|Bem vind@ ao Jogo da adivinhação!!|");
        System.out.println("|        INSTRUÇÕES DO JOGO        |");
        System.out.println("| 1. Você deve adivinhar o numero  |");
        System.out.println("| escolhido pelo computador        |");
        System.out.println("| 2. Se você chegar perto, tem mais|");
        System.out.println("| uma chance, sua margem de erro é |");
        System.out.println("| um numero.                       |");
        System.out.println("| 3. Se você errar, pode jogar no- |");
        System.out.println("| vamente, mas o computador esco-  |");
        System.out.println("| lherá um novo numero.            |");
        System.out.println("------------------------------------");
        System.out.println();                                           //Os System.out em branco funcionam como linha em branco
        int iniciar,  numeroUser, dificuldade, pontos =0, troca;        //para deixar a tela mais confortavel de ler
        float numeroUser2;
        Scanner input = new Scanner(System.in);
        boolean jogar = true, continuar;
        Random rand = new Random();
        String nome = "";
        List <Integer> acertos = new ArrayList<>();
        List <Integer>erros = new ArrayList<>();
        List <Integer> acertos2 = new ArrayList<>();
        List <Integer>erros2 = new ArrayList<>();
        List <Float> acertos3 = new ArrayList<>();
        List <Float>erros3 = new ArrayList<>();


        while (jogar){
            System.out.println("Você deseja jogar Jogo da Adivinhação?");
            System.out.println("   Digite 1 para sim, 2 para não");
            iniciar = input.nextInt();
            System.out.println();


            if(iniciar == 1){
                System.out.println("Deseja adicionar/alterar o jogador? Digite 1 se sim, qualquer outro digito para não");
                troca = input.nextInt();
                System.out.println();
                if (troca == 1){
                    System.out.println("Qual o seu nome?");
                    nome = input.next();
                    System.out.println();
                    pontos = 0;
                    acertos.clear();
                    erros.clear();
                }
                int numero1 = rand.nextInt(10), numero2 = rand.nextInt(20);
                float numero3;
                numero3 = rand.nextInt(10);

                System.out.println("Qual nivel de dificuldade deseja jogar?");
                System.out.println("1 - Easy Peasy");
                System.out.println("2 - Procurando problema");
                System.out.println("3 - Enrascada Danada");
                dificuldade = input.nextInt();
                System.out.println();
                switch (dificuldade){
                    case 1:
                        System.out.println("O computador ja escolheu um numero");
                        continuar = true;
                        while (continuar){
                            System.out.println("Escolha um numero inteiro de 1 a 10");
                            numeroUser = input.nextInt();
                            System.out.println();

                            if (numeroUser == (numero1 - 1)){
                                System.out.println("Voce está perto...");
                                pontos = pontos + 5;
                                erros.add(numeroUser);
                            } else if (numeroUser == (numero1 + 1)){
                                System.out.println("Voce está perto...");
                                pontos = pontos + 5;
                                erros.add(numeroUser);
                            }else if(numeroUser == numero1){
                                System.out.println("Você acertou!!!");
                                pontos = pontos + 10;
                                continuar = false;
                                acertos.add(numeroUser);
                                System.out.println(nome +" fez  " +pontos +" pontos");
                                System.out.println("Os numeros incorretos inseridos no nivel 1: " +erros.toString());
                                System.out.println("Os numeros corretos inseridos no nivel 1: " +acertos.toString());
                                System.out.println();
                            } else {
                                System.out.println("Que pena, você errou...");
                                System.out.println("GAME OVER");
                                System.out.println(nome +" fez  " +pontos +" pontos");
                                erros.add(numeroUser);
                                System.out.println("Os numeros incorretos inseridos no nivel 1: "+erros.toString());
                                System.out.println("Os numeros corretos inseridos no nivel 1: " +acertos.toString());
                                System.out.println();
                                continuar = false;
                            }}
                        break;
                    case 2:
                        System.out.println("O computador ja escolheu um número");
                        continuar = true;
                        while (continuar){
                            System.out.println("Escolha um numero inteiro de 0 a 20");
                            numeroUser = input.nextInt();
                            if (numeroUser == (numero2 - 1)){
                                System.out.println("Voce está perto");
                                pontos = pontos + 5;
                                erros2.add(numeroUser);
                            } else if (numeroUser == (numero2 + 1)){
                                System.out.println("Voce está perto");
                                pontos = pontos + 5;
                                erros2.add(numeroUser);
                            }else if(numeroUser == numero2){
                                System.out.println("Você acertou!!!");
                                pontos = pontos + 10;
                                System.out.println(nome +"fez  " +pontos +" pontos");
                                continuar = false;
                                acertos2.add(numeroUser);
                                System.out.println("Os numeros incorretos inseridos no nivel 2: " +erros2.toString());
                                System.out.println("Os numeros corretos inseridos no nivel 2: " +acertos2.toString());
                                System.out.println();
                            } else {
                                System.out.println("Que pena, você errou...");
                                System.out.println("GAME OVER");
                                System.out.println(nome +"fez  " +pontos +" pontos");
                                erros2.add(numeroUser);
                                System.out.println("Os numeros incorretos inseridos: no nivel 2" +erros2.toString());
                                System.out.println("Os numeros corretos inseridos: no nivel 2" +acertos2.toString());
                                System.out.println();
                                continuar = false;
                            }}
                        break;
                    case 3:
                        System.out.println("O computador ja escolheu um numero");
                        continuar = true;
                        while (continuar){
                            System.out.println("Escolha um numero decimal de 0 a 20");
                            numeroUser2 = input.nextFloat();
                            if (numeroUser2 == (numero3 - 1)){
                                System.out.println("Você está perto");
                                pontos = pontos + 5;
                                erros3.add(numeroUser2);
                            } else if (numeroUser2 == (numero3 + 1)){
                                System.out.println("Você está perto");
                                pontos = pontos + 5;
                                erros3.add(numeroUser2);
                            }else if(numeroUser2 == numero3){
                                System.out.println("Você acertou!!!");
                                pontos = pontos + 10;
                                System.out.println(nome +" fez  " +pontos +" pontos");
                                continuar = false;
                                acertos3.add(numeroUser2);
                                System.out.println("Os numeros incorretos inseridos no nivel 3: " +erros3.toString());
                                System.out.println("Os numeros corretos inseridos no nivel 3: " +acertos3.toString());
                                System.out.println();
                            } else {
                                System.out.println("Que pena, você errou...");
                                System.out.println("GAME OVER");
                                System.out.println(nome +" fez  " +pontos +" pontos");
                                continuar = false;
                                erros3.add(numeroUser2);
                                System.out.println("Os numeros incorretos inseridos no nivel 3: " +erros3.toString());
                                System.out.println("Os numeros corretos inseridos no nivel 3: " +acertos3.toString());
                                System.out.println();
                            }}
                        break;

                }
            }else if (iniciar == 2){
                jogar = false;
            }else{
                System.out.println("Insira um valor valido");
            }
        }

    }





}