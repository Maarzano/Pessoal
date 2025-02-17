namespace Att12.Models {
    public abstract class Smartphone {

        public string Numero { get; set;}
        public string Modelo { get; }
        public string IMEI { get; }
        public int Memoria { get; }
        public Smartphone(string numero, string modelo, string imei, int memoria){
            Numero = numero;
            Modelo = modelo;
            IMEI = imei;
            Memoria = memoria;
        }
         public void Ligar(){
            Console.WriteLine($"O celular de número {Numero} ligou");
         }
         public void ReceberLigacao(){
            Console.WriteLine($"O celular está recendo uma ligação");
         }
         public abstract void InstalarAplicativo(string nome);
        
    }
}