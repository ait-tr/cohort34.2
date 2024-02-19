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
    dispatch(addBook({ title, author, year }));
    setTitle("");
    setAuthor("");
    setYear("");
  };

  return (
    <div className="text-center">
      <h1>Create Book:</h1>

      <form
        onSubmit={handleSubmit}
        className="d-flex flex-column w-50"
        style={{ margin: "0 auto" }}
      >
        {/* <label>
          Title:
          <input
            id="title"
            type="text"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            placeholder="Enter title..."
          />
        </label> */}

        <label>Title:</label>
        <input
          id="title"
          type="text"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
          placeholder="Enter title..."
          className="form-control mb-3"
        />

        <label htmlFor="author">Author:</label>
        <input
          id="author"
          type="text"
          value={author}
          onChange={(e) => setAuthor(e.target.value)}
          placeholder="Enter author..."
          className="form-control mb-3"
        />

        <label htmlFor="year">Year:</label>
        <input
          id="year"
          type="text"
          value={year}
          onChange={(e) => setYear(e.target.value)}
          placeholder="Enter year..."
          className="form-control mb-3"
        />

        <button
          type="submit"
          className="btn btn-success"
          style={{ width: "fit-content", margin: '0 auto' }}
        >
          Add Book
        </button>
      </form>
    </div>
  );
};

export default CreateBook;
