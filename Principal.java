import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro();
        Mago m = new Mago();
        Arqueiro a = new Arqueiro();

        /* OBJETO GUERREIRO*/
        g.nome = "Vladimir PUTIN";
        g.forca = 80;
        g.agilidade = 30;
        g.carisma = 0;
        g.destreza = 50;
        g.inteligencia = -3;
        g.estamina = 90;
        g.resistencia = 80;
        g.sorte = 10;
        g.vida = 90;
        g.mana = 63;

        /* OBJETO MAGO*/
        m.nome = "Agostinho Carrara";
        m.mana = 100;
        m.vida = 60;
        m.destreza = 90;
        m.resistencia = 50;
        m.sorte = 85;
        m.inteligencia = 60;
        m.estamina = 45;

        /*OBJETO ARQUEIRO*/
        a.nome = "Jhonson e Jhonson a family company";
        a.destreza = 95;
        a.resistencia = 30;
        a.estamina = 45;
        a.sorte = 5;
        a.vida = 75;
        a.inteligencia = 60;
        
        /* int valorAtaque = g.ataque(6);*/

        Random dado = new Random();

        int round = 1;

        while (g.vida > 0 && a.vida > 0){
            System.out.println("\nRound: " + round);
            System.out.println("Oponente 1: " +g.nome);
            System.out.println("Oponente 2: "+a.nome+"\n");

            /* Turno do Mago*/
            int valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: "+valorDado);
            int valorAtaque = a.ataque(valorDado);
            g.defender(valorAtaque);

            /* Turno do Guerreiro*/
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: "+valorDado);
            valorAtaque = g.ataque(valorDado);
            a.defender(valorAtaque);
            /* round = round +1*/ 
            round++;

            if (a.vida <= 0){
                a.vida = 0;
                System.out.println("\nO "+g.nome+" ganhou");
            }else if (g.vida <= 0){
                g.vida = 0;
                System.out.println("\nO "+a.nome+" ganhou");
            }

        }
    }
}
