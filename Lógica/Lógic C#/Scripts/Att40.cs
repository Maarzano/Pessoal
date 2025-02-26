try {
    Console.Write("Digite o nome de usuário: ");
    string nomeUsuario = Console.ReadLine();

    if (string.IsNullOrWhiteSpace(nomeUsuario)) {
        throw new ArgumentException("O nome de usuário não pode estar vazio.");
    }

    Console.Write("Digite a senha (mínimo 6 caracteres): ");
    string senha = Console.ReadLine();

    if (senha.Length < 6)
    {
        throw new ArgumentException("A senha deve ter pelo menos 6 caracteres.");
    }

    Console.WriteLine("Cadastro realizado com sucesso!");
} catch (ArgumentException ex) {
    Console.WriteLine($"Erro: {ex.Message}");
} catch (Exception ex) {
    Console.WriteLine($"Erro inesperado: {ex.Message}");
}