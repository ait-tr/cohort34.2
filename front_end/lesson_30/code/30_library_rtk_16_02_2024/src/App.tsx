import React from "react";
import "./App.css";
import Sandwich from "./components/Sandwich";
import Counter from "./components/Counter";
import CreateBook from "./components/CreateBook";
import Library from "./components/Library";

function App() {
  return (
    <>
      <Sandwich />
      <Counter />

      <CreateBook />
      <Library />
    </>
  );
}

export default App;
