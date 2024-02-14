import React, { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { RootState } from "../redux/store";

const Counter = () => {
  const counter = useSelector((state: RootState) => state.counter.value);
  const [value, setValue] = useState(counter); 

  const dispatch = useDispatch();

  const handleMinus = () => {
    dispatch({type: 'counter/minus'});
  }

  const handleReset = () => {
    dispatch({type: 'counter/reset'});
  }

  const handlePlus = () => {
    dispatch({type: 'counter/plus'});
  }

  const handleChange = () => {
    dispatch({type: 'counter/change', payload: isNaN(value) ? counter : value});
  }

  return (
    <div>
      <h2>Counter: {counter}</h2>
      <button onClick={handleMinus}>Decrement</button>
      <button onClick={handleReset}>Reset</button>
      <button onClick={handlePlus}>Increment</button>

      <div>
        <input
          type="text" 
          onChange={e => setValue(+e.target.value)}
        />
        <button onClick={handleChange}>Click me!</button>
      </div>
    </div>
  );
}

export default Counter;