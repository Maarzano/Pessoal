import Button from "./components/Button/idex";
import ButtonDel from "./components/ButtonDel/ButtonDel";
import Card from "./components/Card";
import ListCheckBox from "./components/ListCheckBox/ListCheckBox";
import Welcome, { InputTexto, ListaTarefas } from "./components/Welcome";
import { Contador } from "./components/Welcome";

function App() {
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

export default App;
