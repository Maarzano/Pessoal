using ProjetoReal.Models;
Senha senha = null;

try{
    senha = new("A12345678*");
}catch (ArgumentException ex){
    Console.Write(ex.Message);
}

if (senha != null){
    Console.Write(senha.IsValidPassword());
}