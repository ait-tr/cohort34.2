import React, { FormEvent, useState } from "react";
import { useDispatch } from "react-redux";
import { addBook } from "../redux/library/librarySlice";

const CreateBook = () => {
  const [title, setTitle] = useState("");
  const [author, setAuthor] = useState("");
  const [year, setYear] = useState("");

  const dispatch = useDispatch();

  const handleSubmit = (e: FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    // TODO
    dispatch(addBook({ title, author, year }))
    setTitle('');
    setAuthor('');
    setYear('');
  };

  return (
    <div>
      <h1>Create Book:</h1>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
        />
        <input
          type="text"
          value={author}
          onChange={(e) => setAuthor(e.target.value)}
        />
        <input
          type="text"
          value={year}
          onChange={(e) => setYear(e.target.value)}
        />

        <button type="submit">Add Book</button>
      </form>
    </div>
  );
};

export default CreateBook;
