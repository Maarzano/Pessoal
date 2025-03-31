Passos(10);


static void  Passos(int passos){
    if (passos < 0) return;
    Console.WriteLine($"{passos}, passos");
    Passos(passos - 1);

}