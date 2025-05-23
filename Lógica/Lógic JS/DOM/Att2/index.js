document.addEventListener("DOMContentLoaded", carregarTarefas);

document.getElementById("btn-adicionar").addEventListener("click", () => {
    const input = document.getElementById("inputTODO");
    const textInput = input.value.trim();
    if (!textInput) return;

    adicionarTarefa(textInput, "pendentes");
    input.value = "";
});

function carregarTarefas() {
    const dados = JSON.parse(localStorage.getItem("tarefas")) || { pendentes: [], concluidas: [] };

    dados.pendentes.forEach(tarefa => adicionarTarefa(tarefa, "pendentes", false));
    dados.concluidas.forEach(tarefa => adicionarTarefa(tarefa, "concluidas", false));
}

function salvarNoLocalStorage(tarefa, lista) {
    const dados = JSON.parse(localStorage.getItem("tarefas")) || { pendentes: [], concluidas: [] };

    if (lista === "pendentes") {
        dados.pendentes.push(tarefa);
    } else {
        dados.concluidas.push(tarefa);
    }

    localStorage.setItem("tarefas", JSON.stringify(dados));
}

function removerDoLocalStorage(tarefa, lista) {
    const dados = JSON.parse(localStorage.getItem("tarefas")) || { pendentes: [], concluidas: [] };
    dados[lista] = dados[lista].filter(t => t !== tarefa);
    localStorage.setItem("tarefas", JSON.stringify(dados));
}

function adicionarTarefa(texto, lista, salvar = true) {
    const item = document.createElement("li");
    item.className = "li-bonita";
    item.textContent = texto;

    const botaoDeletar = document.createElement("button");
    botaoDeletar.innerText = "Deletar";
    botaoDeletar.addEventListener("click", () => {
        item.remove();
        removerDoLocalStorage(texto, lista);
    });

    item.appendChild(botaoDeletar);

    if (lista === "pendentes") {
        const botaoDone = document.createElement("button");
        botaoDone.innerText = "Concluir";
        botaoDone.addEventListener("click", () => {
            item.remove();
            removerDoLocalStorage(texto, "pendentes");
            adicionarTarefa(texto, "concluidas");
        });
        item.appendChild(botaoDone);
        document.getElementById("lista").appendChild(item);
    } else {
        document.getElementById("tarefas-feitas").appendChild(item);
    }

    if (salvar) salvarNoLocalStorage(texto, lista);
}
