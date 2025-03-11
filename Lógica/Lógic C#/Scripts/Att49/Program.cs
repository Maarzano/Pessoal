using System;

class Notificador{
    public delegate void NotificacaoHandler(string mensagem);
    
    public event NotificacaoHandler EventoNotificado;

    public void Notificar(string mensagem) {
        EventoNotificado?.Invoke(mensagem);
    }
}

class Program {
    static void Main() {
        Notificador n = new Notificador();

        n.EventoNotificado += (msg) => Console.WriteLine($"Ouvir 1: {msg}");
        n.EventoNotificado += (msg) => Console.WriteLine($"Ouvir 2: {msg}");

        n.Notificar("Alerta!");

        Console.WriteLine("\nRemovendo um ouvinte...\n");
        n.EventoNotificado -= (msg) => Console.WriteLine($"Ouvir 2: {msg}");

        n.Notificar("Novo Alerta!");

        void Ouvinte3(string msg) => Console.WriteLine($"Ouvir 3: {msg}");
        n.EventoNotificado += Ouvinte3;

        n.Notificar("Terceiro alerta!");
        n.EventoNotificado -= Ouvinte3; 
        n.Notificar("Último alerta!");
    }
}
