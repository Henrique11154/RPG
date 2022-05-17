public class Mago {
    
    String nome;
    int destreza;
    int agilidade;
    int inteligencia;
    int carisma;
    int resistencia;
    int vida;    
    int estamina;
    int sorte;
    int forca;
    int mana;

    int ataque(int valorDado){
        int valorAtaque = 0;
        if(valorDado < 2){
            System.out.println("O ataque falhou!!");
        }else{
            valorAtaque = this.inteligencia + valorDado; 
        }
        return valorAtaque;
    }

    void defender(int valorDoAtaque){
        if(valorDoAtaque <= this.resistencia){
            System.out.println("O ataque foi defendido!!");
        }else{
            int danoCausado = valorDoAtaque - this.resistencia;
            System.out.println("O dano causado foi "+danoCausado);
            
            /* this.vida = this.vida - dano causado*/
            this.vida -= danoCausado; 
        }
    }
}
