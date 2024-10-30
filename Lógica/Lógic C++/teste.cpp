#include <iostream>
using namespace std;

int main() {
    string x;
    cout << "escreva SIM" << endl;
    cin >> x;
    
    if (x == "SIM") {
        cout << "voce escreveu: " << x;
    } else if ( x != "SIM ") {
        cout << "vc escreveu outra coisa a não ser SIM, voce escreveu: " << x;
    }

}