import React, { useState } from "react";

function Counter() {
  // React.useState(0)
  const [count, setCount] = useState(0);

  // console.log(count);
  // setCount(1); меняется значение локального состояния (count) с
  // помощью специального метода setCount()

  // let x = 0;
  // console.log(x--);
  // x--; // x = x - 1

  const increment = () => {
    // console.log(e);
    setCount(count + 1);
  };

  const setNewCount = (e) => {
    const input = e.target.previousElementSibling;
    if (!isNaN(+input.value)) {
      setCount(+input.value);
    }
    input.value = '';
  };

  return (
    <div>
      <h2>Counter: {count}</h2>
      <button onClick={() => setCount(count - 1)}>Decrement</button>
      <button onClick={() => setCount(0)}>Reset</button>
      <button onClick={increment}>Increment</button>

      <div>
        <input />
        <button onClick={setNewCount}>Click me!</button>
      </div>
    </div>
  );
}

export default Counter;
