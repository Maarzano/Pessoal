const button = document.getElementsByClassName("btn")[0];


button.addEventListener("click", async () => {
    const url = "https://api.nekosapi.com/v4/images/random?rating=safe&limit=1";

    fetch(url, {
        method: "GET",
    }).then(response => {
        if(!response.ok){
            throw new Error(`erro na requisição: ${response.status}`);
        }
        return response.json();
    }).then(data => {
        const imageUrl = data[0].url;
        const autor = (data[0].artist_name == null ? "usuário indisponível" : data[0].artist_name);
        

        document.getElementsByClassName("autor")[0].innerText = autor;
        document.getElementsByClassName("imagem")[0].src = imageUrl;

        console.log(imageUrl);
    }).catch(error => {
        console.error("Erro: ", error);
    });

});