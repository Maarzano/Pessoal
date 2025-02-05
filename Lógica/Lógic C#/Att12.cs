
        Console.WriteLine("Digite um número");
        int num = int.Parse(Console.ReadLine());

        string resul = (num % 2 == 0) 
        ? (num >= 0 ? "par e positivo" : "par e negativo") 
        : (num >= 0 ? "ímpar e positivo" : "ímpar e negativo");

        Console.WriteLine(resul);