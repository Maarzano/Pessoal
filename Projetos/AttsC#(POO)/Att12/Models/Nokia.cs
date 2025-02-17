namespace Att12.Models {
    public class Nokia : Smartphone{
        public Nokia (string numero, string modelo, string imei, int memoria) : base(numero, modelo, imei, memoria) { }

        public override void InstalarAplicativo(string nome) {
            Console.WriteLine($"O aplicativo {nome} foi instlado no Nokia");

        }
    }
}