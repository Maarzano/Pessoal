#include <iostream>
#include <vector>

using namespace std;

vector<int> BubbleSort(vector<int> Vetor){
    int troca = 1;
    while (troca == 1)
    {
        troca = 0;        
        for (int i = 0; i < Vetor.size() - 1; i++)
        {
            if (Vetor[i] > Vetor[i + 1])
            {
                troca = 1;
                int aux = Vetor[i];
                Vetor[i] = Vetor[i + 1];
                Vetor[i + 1] = aux;
            }
        }
    }
    return Vetor;
}

int main(){
    std::vector<int> vec;

    for (int i = 1; i <= 5; i++){
        cout << "Escreva o " << i << " numero: ";
        int numero;
        cin >> numero;
        vec.push_back(numero);
    }

    for(int recebendo : vec){
        cout << recebendo << ", ";
    }

    for(int num : vec){
        cout << num << " ";
    }
    
return 0;
}
