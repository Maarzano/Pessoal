import Button from "../components/Button/idex";
import ButtonDel from "../components/ButtonDel/ButtonDel";
import ListCheckBox from "../components/ListCheckBox/ListCheckBox";
import Welcome, { Contador, InputTexto, ListaTarefas } from "../components/Welcome";

const Testing = () => {
    return (
        <div className="App">
            <Welcome nome="arthur"/>
            <Button>Entrar</Button>
            <Contador/>
            <InputTexto/>
            <ListaTarefas/>
            <ButtonDel/>
            <ListCheckBox/>
        </div>
    );
}

export default Testing;