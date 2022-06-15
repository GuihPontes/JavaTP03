
public class main {

    /**
     * @author Guilherme Pontes, Luiz Leal
     * Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
     * exercício anterior.
     */
    public  static void main(String[] args) {

        Hora umaHora = new Hora(13 , 0 ,0);
        System.out.println("Uma hora da Tarde");
        System.out.println(umaHora.getHora1());
        System.out.println(umaHora.getHora2());
        System.out.println(umaHora.getSegundos());

        Hora duasHoras = new Hora();

        System.out.println("Duas hora da Tarde");
        System.out.println(duasHoras.getHora1());
        System.out.println(duasHoras.getHora2());
        System.out.println(duasHoras.getSegundos());








    }
}
