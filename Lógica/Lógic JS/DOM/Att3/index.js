// iniciar a contagem no h1
// parar a contagem
let segundos = 0;
let intervalId = null;
const timer = document.getElementById("timer");
const botaoIniciar = document.getElementById("iniciar");
const botaoParar = document.getElementById("pausar");
const botaoZerar = document.getElementById("zerar");

function formatTime(seconds) {
    const hrs = String(Math.floor(seconds / 3600)).padStart(2, '0');
    const mins = String(Math.floor((seconds % 3600) / 60)).padStart(2, '0');
    const secs = String(seconds % 60).padStart(2, '0');
    return `${hrs}:${mins}:${secs}`;
}

botaoIniciar.addEventListener("click", () => {
    if (intervalId !== null) return;
    intervalId = setInterval(() => {
        segundos++;
        timer.textContent = formatTime(segundos);
    }, 1000);
});

botaoParar.addEventListener("click", () => {
    clearInterval(intervalId);
    intervalId = null;
});

botaoZerar.addEventListener("click", () => {
    clearInterval(intervalId);
    intervalId = null;
    segundos = 0;
    timer.innerText = "00:00:00";
});