Console.Write("Escreva um número: ");
int num = int.Parse(Console.ReadLine());

int numeroinvertido = InverterNumero(num);

Console.WriteLine($"\nO número digitado ao contrário é: {numeroinvertido}\n");

static int InverterNumero(int num){
    int numeroinvertido = 0;
    while(num > 0){
        numeroinvertido = numeroinvertido * 10 + num % 10;
        num /= 10;
    }
    return numeroinvertido;
}