
let textInput = "";
document.getElementById("btn-adicionar").addEventListener('click', () => {
    const input = document.getElementById("inputTODO");
    textInput = input.value;

    console.log(textInput);

    const item = document.createElement("li");
    const botaoDeletar = document.createElement("button");
    botaoDeletar.innerText = "deletar";
    botaoDeletar.addEventListener("click", () => {
        botaoDeletar.parentElement.remove();
    })
    item.className = "li-bonita";
    item.innerHTML = textInput;

    console.log(`o value é ${item.textContent}`);

    if (item.textContent != 0){
        document.getElementById("lista").appendChild(item).appendChild(botaoDeletar);
    }
});