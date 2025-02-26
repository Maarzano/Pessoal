Console.Write("Ecreva um número: ");
int num = int.Parse(Console.ReadLine());

Console.WriteLine($"\nA soma dos números digitados é: {SomarDigitos(num)}\n");

static int SomarDigitos(int num){
    int somaNum = 0;
    while(num > 0){
        somaNum += num % 10;
        num /= 10;
    }
    return somaNum;
}