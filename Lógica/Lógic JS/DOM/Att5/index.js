const button = document.getElementsByClassName("btn")[0];


button.addEventListener("click", async () => {
    const url = "https://api.thecatapi.com/v1/images/search";

    button.disabled = true;
    button.innerText = "Buscando...";

    fetch(url, {
        method: "GET",
    }).then(response => {
        if(!response.ok){
            throw new Error(`erro na requisição: ${response.status}`);
        }
        return response.json();
    }).then(data => {
        const imageUrl = data[0].url;
        
        document.getElementsByClassName("imagem")[0].src = imageUrl;

    }).catch(error => {
        console.error("Erro: ", error);
    }).then(() =>{
        button.disabled = false;
        button.innerText = "Buscar imagem";
    });

});