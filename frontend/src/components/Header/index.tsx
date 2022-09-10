import logo from '../../assets/img/logo-header.svg'
import './style.css'
function Header() {
    return(
        
        <header>
        <div className='dsmeta-logo-container'>
            <img src={logo} alt='DS METAS'></img>
            <p>Desenvolvido por Cleber</p>
        </div>
        </header>
        
    )
}
export default Header