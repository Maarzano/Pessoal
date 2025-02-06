// mini conversor de temperatura
Console.Write("Digite uma temperatura em Celcius: ");
double temperatura = double.Parse(Console.ReadLine());

Console.WriteLine("1. Fahrenheit");
Console.WriteLine("2. Kelvin");

switch (Console.ReadLine()[0]){
    case '1':
        Console.WriteLine(ConverterParaFahrenheit(temperatura));
    break;
    case '2':
        Console.WriteLine(ConverteParaKelvin(temperatura));
    break;
    default:
        Console.WriteLine("Opção inválida");
    break;
}

public static double ConverterParaFahrenheit(double temperatura){
    double result = (temperatura * 1.8 + 32);
    return result;

}

public static double ConverteParaKelvin(double temperatura){
    return temperatura + 273.15;
}