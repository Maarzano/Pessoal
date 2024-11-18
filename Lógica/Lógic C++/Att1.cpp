// Menu de seleção de bebidas
#include <iostream>
using namespace std;

int main() {
    int opcao;
    cout << "escolha sua opção(colocando o número correspondente)" << endl;
    cout << "1 - Coca-Cola" << endl;
    cout << "2 - Fanta" << endl;
    cout << "3 - Sprite" << endl;
    cin >> opcao;
    switch (opcao) { 
        case 1:
        cout << "voce escolheu coca cola" << endl;
        break;
        case 2:
        cout << "voce escolheu fanta" << endl;
        break;
        case 3:
        cout << "voce escolheu sprite" << endl;
        break;
        default:
        cout << "opção inválida" << endl;
    }
    return 0;
}