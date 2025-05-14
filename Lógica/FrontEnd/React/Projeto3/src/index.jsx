import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './Pages/App.jsx'
import Globalstyles from './styles.js'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Globalstyles/>
    <App />
  </StrictMode>,
)
