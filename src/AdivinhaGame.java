import java.util.Random;
import java.util.Scanner;

public class AdivinhaGame {
    public static void main(String[] args) {
        System.out.println("Bem vind@ ao Jogo da adivinhação!!");
        System.out.println("        INSTRUÇÕES DO JOGO        ");
        System.out.println(" 1. Você deve adivinhar o numero  ");
        System.out.println(" escolhido pelo computador        ");
        System.out.println(" 2. Se você chegar perto, tem mais");
        System.out.println(" uma chance, sua margem de erro é ");
        System.out.println(" um numero.");
        System.out.println(" 3. Se você errar, pode jogar no- ");
        System.out.println(" vamente, mas o computador esco-  ");
        System.out.println(" lherá um novo numero             ");

        int iniciar,  numeroUser, dificuldade, pontos =0, troca;
        float numeroUser2;
        Scanner input = new Scanner(System.in);
        boolean jogar = true, continuar = true;
        Random rand = new Random();
        String nome = "";

        while (jogar == true){
            System.out.println("Você deseja jogar Jogo da Adivinhação?");
            System.out.println("Digite 1 para sim, 2 para não");
            iniciar = input.nextInt();

            if(iniciar == 1){
                System.out.println("Deseja alterar o jogador? Digite 1 se sim, qualquer outro digito para não");
                troca = input.nextInt();
                if (troca == 1){
                    System.out.println("Qual o seu nome?");
                    nome = input.next();
                    pontos = 0;
                }
                int numero1 = rand.nextInt(10), numero2 = rand.nextInt(20);
                float numero3 = rand.nextFloat(20);

                System.out.println("Qual nivel de dificuldade deseja jogar?");
                System.out.println("1 - Easy Peasy");
                System.out.println("2 - Procurando problema");
                System.out.println("3 - Enrascada Danada");
                dificuldade = input.nextInt();
                switch (dificuldade){
                    case 1:
                        System.out.println("O computador ja escolheu um numero");
                        continuar = true;
                        while (continuar == true){
                        System.out.println("Escolha um numero inteiro de 1 a 10");
                        numeroUser = input.nextInt();

                        if (numeroUser == (numero1 - 1)){
                            System.out.println("Voce está perto...");
                            pontos = pontos + 5;
                        } else if (numeroUser == (numero1 + 1)){
                            System.out.println("Voce está perto...");
                            pontos = pontos + 5;
                        }else if(numeroUser == numero1){
                            System.out.println("Você acertou!!!");
                            pontos = pontos + 10;
                            System.out.println(nome +" fez  " +pontos +" pontos");
                            continuar = false;
                        } else {
                            System.out.println("Que pena, você errou...");
                            System.out.println("GAME OVER");
                            System.out.println(nome +" fez  " +pontos +" pontos");
                            continuar = false;
                        }}
                        break;
                    case 2:
                        System.out.println("O computador ja escolheu um número");
                        continuar = true;
                        while (continuar == true){
                        System.out.println("Escolha um numero inteiro de 0 a 20");
                        numeroUser = input.nextInt();
                        if (numeroUser == (numero2 - 1)){
                            System.out.println("Voce está perto");
                            pontos = pontos + 5;
                        } else if (numeroUser == (numero2 + 1)){
                            System.out.println("Voce está perto");
                            pontos = pontos + 5;
                        }else if(numeroUser == numero2){
                            System.out.println("Você acertou!!!");
                            pontos = pontos + 10;
                            System.out.println(nome +"fez  " +pontos +" pontos");
                            continuar = false;
                        } else {
                            System.out.println("Que pena, você errou...");
                            System.out.println("GAME OVER");
                            System.out.println(nome +"fez  " +pontos +" pontos");
                            continuar = false;
                        }}
                        break;
                    case 3:
                        System.out.println("O computador ja escolheu um numero");
                        continuar = true;
                        while (continuar == true){
                        System.out.println("Escolha um numero decimal de 0 a 20");
                        numeroUser2 = input.nextFloat();
                        if (numeroUser2 == (numero3 - 1)){
                            System.out.println("Você está perto");
                            pontos = pontos + 5;
                        } else if (numeroUser2 == (numero3 + 1)){
                            System.out.println("Você está perto");
                            pontos = pontos + 5;
                        }else if(numeroUser2 == numero3){
                            System.out.println("Você acertou!!!");
                            pontos = pontos + 10;
                            System.out.println(nome +" fez  " +pontos +" pontos");
                            continuar = false;
                        } else {
                            System.out.println("Que pena, você errou...");
                            System.out.println("GAME OVER");
                            System.out.println(nome +" fez  " +pontos +" pontos");
                            continuar = false;
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
