namespace Att9.Models{
    public class Reserva{
        public List<Pessoa> Hospedes { get; set;}
        public Suite Suite {get; set;}
        public int DiasReservados {get; set;}
        public bool Desconto10 => DiasReservados > 10;

        public Reserva(List<Pessoa> hospedes, Suite suite, int diasReservados){
            Hospedes = new List<Pessoa>();
            DiasReservados = diasReservados;
            Suite = suite;
            if (suite.Capacidade >= hospedes.Count){
                Hospedes = hospedes;
            } else {
                throw new ArgumentException($"Capacidade da Suite baixa para {hospedes.Count} hospedes");
            }
        }
        public int ObterQuantidadeHospedes(){
            return Hospedes.Count;
        }
        public decimal CalcularValorDiaria(){
            decimal total = DiasReservados * Suite.ValorDiaria;
            return Desconto10 ? total * 0.9m : total;
        }
        public void ExibirDetalheDaReserva(){
            Console.WriteLine("===== DETALHES DA RESERVA =====");
                        Console.WriteLine($"Quantidade de Hóspedes: {ObterQuantidadeHospedes()}");
                        Console.WriteLine($"Tipo da Suíte: {Suite.TipoSuite}");
                        Console.WriteLine($"Dias Reservados: {DiasReservados}");
                        Console.WriteLine($"Valor Total: R$ {CalcularValorDiaria():F2}");
        }



        
    }
}