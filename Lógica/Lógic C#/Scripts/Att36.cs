// mini calculadora
Console.WriteLine(Somar(1, 4));
Console.WriteLine(Subtrair(1, 4));
Console.WriteLine(Multiplicar(1, 4));
Console.WriteLine(Dividir(1, 4));

public static int Somar(params int[] numero){
    int soma = 0;
    foreach (int recebe in numero){
        soma += recebe;
    }
    return soma;
}

public static int Subtrair(params int[] numero){
    int calc = numero[0];
    for (int i = 1; i < numero.Length;i++){
        calc -= numero[i];
    }
    return calc;
}

public static int Multiplicar(params int[] numero){
    int calc = numero[0];
    for (int i = 1; i < numero.Length;i++){
        calc *= numero[i];
    }
    return calc;
}

public static double Dividir(params double[] numero){
    double calc = numero[0];
    for(int i = 1; i< numero.Length;i++){
        calc /= numero[i];
    }
    return calc;
}