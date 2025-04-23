import './style.css';

export default function Button(props) {
    const handleClick = () => {
        alert('Botão clicado!');
      };
  return (
    <button className='meu-botao' onClick={handleClick}>{props.children}</button>
  )}
