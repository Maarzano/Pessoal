import { useState } from 'react'
import gitLogo from '../assets/github-logo.png'
import Input from '../Components/input'
import ItemRepo from '../Components/ItemRepo'
import { Container } from './styles'
import Button from '../Components/Button'
import { api } from '../Services/api'

function App() {

  const [currentRepo, setCurrentRepo] = useState('')
  const [repos, setRepos] = useState([]);

  const handleSearchRepo = async () => {
    const {data} = await api.get(`repos/${currentRepo}`)

    if(data.id){ //teste
      const isExist = repos.find(repo => repo.id === data.id);

      if(!isExist){
      setRepos(prev => [...prev, data]);
      setCurrentRepo('');
      return
      }
    }
    
  }

  const handleRemoveRepo = (id) => {
    setRepos(prev => prev.filter(repo => repo.id !== id));
  }

  return (
    <Container>
      <img src={gitLogo} width={72} height={72} />
      <Input value={currentRepo} onChange={(e) => setCurrentRepo(e.target.value)}/>
      <Button onClick={handleSearchRepo}/>
      {repos.map(repo => <ItemRepo repo={repo} handleRemoveRepo={handleRemoveRepo}/> )}
      
    </Container>
  )
}

export default App
