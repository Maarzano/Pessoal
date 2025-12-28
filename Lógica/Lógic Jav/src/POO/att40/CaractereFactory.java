import java.util.HashMap;
import java.util.Map;

class CaractereFactory {
    private static final Map<String, CaractereFlyweight> cache = new HashMap<>();
    private static int contadorDeObjetos = 0;

    public static CaractereFlyweight getCaractere(char glifo, String fonte) {
        String chave = glifo + ":" + fonte;

        if (!cache.containsKey(chave)) {
            cache.put(chave, new CaractereFlyweight(glifo, fonte));
            contadorDeObjetos++;
            System.out.println(">> [SISTEMA] Criando novo objeto físico para: " + chave);
        }
        return cache.get(chave);
    }

    public static int getTotalObjetosCriados() {
        return contadorDeObjetos;
    }
}