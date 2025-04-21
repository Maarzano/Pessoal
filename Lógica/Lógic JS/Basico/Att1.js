let array = ["arthur", "patricia", "michelline", "joao", "henrique"];

console.log(`primeiro elemento: ${array[0]}, último: ${array[4]}, tamanho do array: ${array.length}`);

console.log("=====TROCA=====");

array[2] = "mariana";
console.log(array[2]);

array.push("alexa");
array.unshift("roberto");

console.log(`primeiro elemento: ${array[0]}, último: ${array[array.length -1]}, tamanho do array: ${array.length}`);

//função para pegar apenas número par:

function par(array){
    return array.filter( x => x % 2 === 0)
}

let array2 = [1, 2, 3, 4, 5, 6, 7, 8, -9, 10];

console.log(par(array2));

for(element of array2){
    console.log(element);
}
