import React from "react";
import Navigation from "./Navigation";

interface IProps {
  changePage: (newValue: string) => void 
}

const Header: React.FC<IProps> = ({ changePage }) => {
  return (
      <header>
        <Navigation changePage={changePage} />
        <h1 className="text-center">Luke SkyWalker</h1>
      </header>
  );
};

export default Header;
