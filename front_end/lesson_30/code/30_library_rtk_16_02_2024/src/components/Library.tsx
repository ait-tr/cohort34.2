import React from 'react'
import { useSelector } from 'react-redux'
import { RootState } from '../redux/storeRTK'

const Library = () => {
    const books = useSelector((state: RootState) => state.library.books);
  return (
    <div>
        <h1>Books in our library:</h1>
        <ul>
            {books.map((e, i) => (
                <li key={i}>
                    <p>{e.isbn}. "{e.title}" - {e.author}, {e.year}</p>
                </li>
            ))}
        </ul>
    </div>
  )
}

export default Library