import React from 'react'
import { useNavigate } from 'react-router-dom'

interface IProps { 
  item: {
    title: string,
    route: string
  }
  changePage: (newValue: string) => void
}

const NavItem: React.FC<IProps> = ({ item, changePage }) => {
  const navigate = useNavigate();
  return (
    <li
      onClick={() => {
        navigate(item.route);
        changePage(item.title);
      }}
      className='nav-item btn btn-danger mx-1'
    >
      {item.title}
    </li>
    // <li onClick={() => changePage(item.title)} >
    //   <Link to={item.route} className='nav-item btn btn-danger mx-1'>{item.title}</Link>
    // </li>
  )
}

export default NavItem