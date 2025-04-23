function mudarTexto(){
    document.getElementById("mensagem").innerText = "texto mudado";
}

function addItem(){
    const novoItem = document.createElement("li");
    novoItem.innerText = "adicionado novo item";
    document.querySelector("#lista").appendChild(novoItem);
}

document.getElementById("BOTÃO3").addEventListener("click", mudarCorDIV);

function mudarCorDIV(){
    document.getElementById("DIV").style.backgroundColor = "black";
}
//
document.getElementById("btn4").addEventListener("click", () => {
    alert("botão clicado");
});

//

document.getElementById("nome").addEventListener("input", () =>{
    document.getElementById("span1").innerText = document.getElementById("nome").value;
});

//

const btn = document.getElementById("btn-hover");
const paragraph = document.getElementById("paragraph");

btn.addEventListener("mouseover", () => paragraph.innerText = "está com o mouse no botão");

btn.addEventListener("mouseout", () => paragraph.innerText = "");

//

const total = document.getElementById("total");
const btnClick = document.getElementById("btn-click");

let clicks = 0;

btnClick.addEventListener("click", () => total.innerText = ++clicks);

//

const botoes = document.querySelectorAll("ul button");

botoes.forEach(botao =>{
    botao.addEventListener("click", () => {
        const itemLista = botao.parentElement;
        itemLista.remove();
    });
});

document.getElementById("form").addEventListener("submit", (event) => {
    event.preventDefault();

    const nome = document.getElementById("inpt-nome").value.trim();
    const email = document.getElementById("inpt-email").value.trim();

    document.getElementById("erroNome").innerText = nome ? "" : "Nome obrigatório";
    document.getElementById("erroEmail").innerText = email ? "" : "Email obrigatório";
});