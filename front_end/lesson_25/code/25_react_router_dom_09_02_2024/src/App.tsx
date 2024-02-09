import React from 'react';
import './App.css';
import PhotoList from './components/PhotoList';
import { Route, Routes } from 'react-router-dom';
import Layout from './components/Layout';

function App() {
  return (
    <Routes>
      <Route path='/' element={<Layout />}>
        <Route path='/photos' element={<PhotoList />} />
      </Route> 
    </Routes>
    // <div className="App">
    //   <PhotoList />
    // </div>
  );
}

export default App;
