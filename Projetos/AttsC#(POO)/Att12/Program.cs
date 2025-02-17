using Att12.Models;

namespace Att12 {
    class ProgramTest {
        static void Main(string[] args) {
            Smartphone nokia = new Nokia("123456789", "NokiaModel", "111111111111111", 64);
            nokia.Ligar();
            nokia.ReceberLigacao();
            nokia.InstalarAplicativo("WhatsApp");

            Smartphone iphone = new Iphone("987654321", "IphoneModel", "222222222222222", 128);
            iphone.Ligar();
            iphone.ReceberLigacao();
            iphone.InstalarAplicativo("Instagram");
        }
    }
}