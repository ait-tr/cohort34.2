import React from 'react'
import { Link, Outlet } from 'react-router-dom'

const Layout = () => {
  return (
    <div>
        <Link to='/photos'>Photos</Link>

        <Outlet />
    </div>
  )
}

export default Layout