Console.Write("Escreva um número: ");
int num = int.Parse(Console.ReadLine());

Console.Write("Escreva outro número: ");
int num2 = int.Parse(Console.ReadLine());

Console.WriteLine("O que deseja fazer com eles?\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
int op = int.Parse(Console.ReadLine());

Console.Write($"O resultado é: {Calcular(num, num2, op)}\n");











private static int Calcular(int num1, int num2, int op){

    if (op == 1){
        return num1 + num2;
    } else if (op == 2){
        return num1 - num2;
    } else if (op == 3){
        return num1 * num2;
    } else if (op == 4){
        return num1 / num2;
    } else {
        return 0;
    }
}