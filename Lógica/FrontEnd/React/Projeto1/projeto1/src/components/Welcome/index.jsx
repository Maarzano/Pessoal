import { useState } from "react";

export default function Welcome(props){
    return (
        <h1>Bem vindo {props.nome}!</h1>
    )}

export function Contador(){
    const [contador, setContador] = useState(0);

    return(
        <div>
            <p>{contador}</p>
            <button onClick={()=> {
                setContador(contador + 1)
            }}>+</button>
            <button onClick={() => {
                if (contador > 0 ) setContador(contador - 1)
            }}>-</button>
        </div>
    );
}

export function InputTexto(){
    const [texto, setTexto] = useState("");

    return(
        <div>
            <input type="text" onChange={(e) => setTexto(e.target.value)}/>
            <p>Você digitou: {texto}</p>
        </div>
    );
}

export function ListaTarefas(){
    const tarefas = ["Estudar react", "Tomar café", "Fazer exercícios"];

    return (
        <ul>
            {tarefas.map((tarefa, index) => (
                <li key={index}>{tarefa}</li>
            ))}
        </ul>
    )
}