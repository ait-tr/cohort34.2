import React, { useEffect, useState } from "react";
import { month } from "../../utils/constants";

interface IHero {
  id: number;
  edited: string;
  name: string;
  created: string;
  gender: string;
  skin_color: string;
  hair_color: string;
  height: string;
  eye_color: string;
  mass: string;
  homeworld: number;
  birth_year: string;
  image: string;
}

const AboutMe = () => {
  const [isLoading, setIsLoading] = useState(true);
  const [hero, setHero] = useState<undefined | IHero>();

  useEffect(() => {
    const heroFromLocalStorage = JSON.parse(localStorage.getItem("Luke")!);
    if (heroFromLocalStorage && (Date.now() - heroFromLocalStorage.time < month)) {
      setIsLoading(false);
      setHero(heroFromLocalStorage);
    } else {
      fetch("https://sw-info-api.herokuapp.com/v1/peoples/1")
        .then((response) => response.json())
        .then((data) => {
          setHero(data);
          setIsLoading(false);
          const info = {
            payload: data,
            time: Date.now()
          }
          localStorage.setItem("Luke", JSON.stringify(info));
        });
    }
  }, []);

  return isLoading ? (
    <div className="spinner-border text-primary" role="status">
      <span className="visually-hidden">Loading...</span>
    </div>
  ) : (
    <>
      {hero && (
        <div>
          <img
            src={`https://sw-info-api.herokuapp.com/${hero.image}`}
            alt={hero.name}
          />
          <p>Birth year: {hero.birth_year}</p>
          <p>Eye color: {hero.eye_color}</p>
          <p>Gender: {hero.gender}</p>
          <p>Hair color: {hero.hair_color}</p>
          <p>Mass: {hero.mass}</p>
          <p>Skin color: {hero.skin_color}</p>
        </div>
      )}
    </>
  );
};

export default AboutMe;
