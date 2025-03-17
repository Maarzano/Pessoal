using AttRevisão10.Models;
Classe notificador = new Classe();
Observador observador = new Observador();

observador.Monitorar(notificador);

notificador.Valor = 10;
notificador.Valor = 20;
notificador.Valor = 30;