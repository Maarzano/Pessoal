import Button from "./components/Button/idex";
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
    </div>
  );
}

export default App;
