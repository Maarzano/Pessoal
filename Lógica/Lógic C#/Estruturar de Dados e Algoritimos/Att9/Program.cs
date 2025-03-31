using System.Numerics;

Console.WriteLine(Fatorial(21));


ulong Fatorial(ulong num){
    if (num == 0 || num == 1) return 1;

    return num * Fatorial(num - 1);
}