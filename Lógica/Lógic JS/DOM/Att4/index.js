const inputNome = document.getElementById("nome");
const inputEmail = document.getElementById("email");
const inputSenha = document.getElementById("senha");

const erroNome = document.getElementsByClassName("erro")[0];
const erroEmail = document.getElementsByClassName("erro")[1];
const erroSenha = document.getElementsByClassName("erro")[2];

const btn = document.getElementsByClassName("btn")[0];


btn.addEventListener("click", (e) => {
    e.preventDefault();
const textNome = inputNome.value.trim();
const textEmail = inputEmail.value.trim();
const textSenha = inputSenha.value.trim();

erroNome.innerText = "";
erroEmail.innerText = "";
erroSenha.innerText = "";
let validForm = true;

    if (temNumero(textNome)){
        erroNome.innerText = "o nome não pode ter número";
        validForm = false;
    }
    
    if (!validEmail(textEmail)){
        erroEmail.innerText = "o email não é válido"
        validForm = false;
    }

    if (textSenha.length < 6){
        erroSenha.innerText = "a senha é curta demais";
        validForm = false;
    }

    if (validForm){
        alert(`enviou o formulário ${textNome}`);
        inputNome.value = "";
        inputEmail.value = "";
        inputSenha.value = "";
    }


});


function temNumero(string){
    return /\d/.test(string);
}

function validEmail(string){
    return /^[a-z0-9.]+@[a-z0-9]+\.[a-z]+(\.[a-z]+)?$/i.test(string);
}
