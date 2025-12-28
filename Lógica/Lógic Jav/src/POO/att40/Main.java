public class Main {
    public static void main(String[] args) {
        String texto = "JAVAAAAA";

        System.out.println("--- Iniciando Renderização ---");

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            String fonte = (i < 2) ? "Arial" : "Times New Roman";

            CaractereFlyweight flyweight = CaractereFactory.getCaractere(letra, fonte);

            flyweight.exibir(0, i);
        }

        System.out.println("------------------------------");
        System.out.println("Total de objetos físicos em memória: " + CaractereFactory.getTotalObjetosCriados());
        System.out.println("Total de caracteres lógicos renderizados: " + texto.length());   
    }
}
