Console.WriteLine("Escolha entre uma dessas");
Console.WriteLine("Cachorro, Gato, Passaro, Peixe, Tartaruga");
string animal = Console.ReadLine();

Console.WriteLine($"Escolha o nome para {animal}");
string nome = Console.ReadLine();

Console.WriteLine($"Vai ser fêmea ou macho?");
string sexo = Console.ReadLine();

Console.WriteLine($"Qual a idade do {animal}?");
int idade = int.Parse(Console.ReadLine());

Console.WriteLine($"Qual o peso do {animal}?");
double peso = double.Parse(Console.ReadLine());

Console.WriteLine($"Qual a raça do {animal}?");
string raca = Console.ReadLine();

Console.WriteLine($"Qual a cor do {animal}?");
string cor = Console.ReadLine();

Console.WriteLine($"Qual o nome do dono?");
string dono = Console.ReadLine();

Console.WriteLine($"O {animal} se chama {nome} e é um(a) {animal} {sexo} de {idade} anos, pesando {peso}kg, da raça {raca}, de cor {cor} e o dono é {dono}.");