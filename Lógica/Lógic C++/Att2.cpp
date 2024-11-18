// Senha para desbloqueio
#include <iostream>
using namespace std;

int main() {
const int senha = 210179116;
int tenta, cont = 0;
cout << "digite a senha para entrar (voce tem 5 chances): "  << endl;
    while(cont < 5) {
        cin >> tenta;
        cont++;
        if (senha == tenta){
        cout << "acesso concedido!" << endl;
        break;
        } else if (cont == 5) {
            cout << "voce errou a senha 5 vezes, saindo..." << endl;
        } else {
        cout<< "senha errada, tente novamente" << endl;
        }
    }
    return 0;
}