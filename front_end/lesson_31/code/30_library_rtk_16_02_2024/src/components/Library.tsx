import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { RootState } from "../redux/storeRTK";
import { delBook } from "../redux/library/librarySlice";

const Library = () => {
  const books = useSelector((state: RootState) => state.library.books);
  const dispatch = useDispatch();
  return (
    <div className="text-center w-50" style={{marginLeft: '25%'}}>
      <h1 className="mt-5">Books in our library:</h1>
      <ol className="list-group list-group-numbered">
        {books.map((e, i) => (
          <li
            key={i}
            className="list-group-item d-flex justify-content-between align-items-start"
          >
            <p className="ms-2 me-auto">
              {e.isbn}. "{e.title}" - {e.author}, {e.year}
            </p>
            <button className="badge bg-primary rounded-pill" onClick={() => dispatch(delBook(i))}>Delete Book</button>
          </li>
        ))}
      </ol>
    </div>
  );
};

export default Library;
