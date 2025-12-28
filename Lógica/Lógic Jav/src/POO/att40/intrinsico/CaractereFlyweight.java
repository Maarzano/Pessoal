class CaractereFlyweight {
    private final char glifo;
    private final String fonte;

    public CaractereFlyweight(char glifo, String fonte) {
        this.glifo = glifo;
        this.fonte = fonte;
    }

    // Recebe o estado extrínseco (posição) por parâmetro
    public void exibir(int linha, int coluna) {
        System.out
                .println("Caractere '" +
                 glifo + "' [Fonte: " + 
                 fonte + "] na posição (" + linha + "," + coluna + ")");
    }
}