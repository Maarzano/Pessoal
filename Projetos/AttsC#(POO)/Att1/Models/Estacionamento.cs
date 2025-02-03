namespace ClasseEstacionamento.Models {
    public class Estacionamento {

        private List<String> veiculos = [];
        private decimal precoInicial = 0;
        private decimal precohora = 0;

        public Estacionamento(decimal precoInicial, decimal precohora){

            this.precoInicial = precoInicial;
            this.precohora = precohora;

        }
        
        public void CadastrarVeciculo(){

            Console.WriteLine("Digite a placa do veículo:");
            string placa = (Console.ReadLine() ?? string.Empty).ToUpper();

            if (!placa.Any()) {
                Console.WriteLine("Placa inválida!");
                return;
            } else if (veiculos.Contains(placa)) {
                Console.WriteLine("Veículo já cadastrado!");
            } else {
                veiculos.Add(placa);
                Console.WriteLine("Veículo cadastrado com sucesso!");
            }

        }

        public void RemoverVeiculo(){

            Console.Write("Digite a placa do veículo: ");
            string placa = (Console.ReadLine() ?? string.Empty).ToUpper();

            if (!placa.Any()) {
                Console.WriteLine("Placa inválida!");
                return;
            }

            if(veiculos.Contains(placa)){
                Console.WriteLine("Quantas horas o veículo ficou estacionado?");
                int tempo = Int32.Parse(Console.ReadLine() ?? "0");

                veiculos.Remove(placa);
                Console.WriteLine("Veículo removido com sucesso!");
                
                Console.WriteLine($"O veículo de placa {placa} ficou estacionado por {tempo}" +
                                   $" horas e o valor a ser pago é de R$ {precoInicial + (tempo * precohora)}");
            } else {
                Console.WriteLine("Veículo não encontrado! Verifique a lista de veículos cadastrados.");
            }

        }

        public void ListarVeiculos(){

            if(!veiculos.Any()){
                Console.WriteLine("Nenhum Veículos cadastrado!");
            } else {
                Console.WriteLine("Veículos cadastrados: ");
                foreach (var veiculo in veiculos){
                    Console.WriteLine(veiculo);
                }
            }

        }
    }
}