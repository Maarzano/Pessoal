import { Itemcontainer } from './styles.js'

export default function ItemRepo({repo, handleRemoveRepo}) {

    const handleRemove = () => {
        handleRemoveRepo(repo.id);
    }
  return (
    <Itemcontainer >
        <h3>{repo.name}</h3>
        <p>{repo.full_name}</p>
        <a className='remover' onClick={handleRemove}>Remover</a> <br />
        <a href={repo.html_url} target='_blank'>Ver repositório</a>
        <hr />
    </Itemcontainer>
  )
}
