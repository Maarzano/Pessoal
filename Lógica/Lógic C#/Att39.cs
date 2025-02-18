try {
Console.Write("Digite o 1° número inteiro: ");
int num1 = int.Parse(Console.ReadLine());

Console.Write("Digite o 2° número inteiro: ");
int num2 = int.Parse(Console.ReadLine());


Console.WriteLine($"{num1} / {num2} = {num1 / num2}");

} catch (DivideByZeroException e){
    Console.WriteLine("impossível dividir por 0");
} catch (FormatException e){
    Console.WriteLine("formato errado...");
}