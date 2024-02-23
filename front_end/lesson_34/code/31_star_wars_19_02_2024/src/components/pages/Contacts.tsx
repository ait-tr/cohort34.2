import React, { useEffect, useState } from "react";

const Contacts = () => {
  const [planets, setPlanets] = useState([]);

  useEffect(() => {
    fetch("https://sw-info-api.herokuapp.com/v1/planets")
      .then((response) => response.json())
      .then((data) => {
        const namesOfPlanets = data.map((e: { name: string }) => e.name);
        setPlanets(namesOfPlanets);
      });
  }, []);

  return (
    <div>
      <form
        style={{ display: "flex", flexDirection: "column" }}
        onSubmit={(e) => e.preventDefault()}
      >
        <label>
          First Name
          <input type="text" placeholder="Your name..." />
        </label>
        <label>
          Planet
          <select required>
            <option value="">Choose your planet: </option>
            {planets.map((item, index) => (
              <option value={item} key={index}>
                {item}
              </option>
            ))}
            {/* <option value="">Выбрать свой вариант</option>
            <option value="1">Пример1</option>
            <option value="2">Пример2</option>
            <option value="3">Пример3</option> */}
          </select>
        </label>
        <label>
          Subject
          <textarea name="" id="" cols={30} rows={10}></textarea>
          <button type="submit">Submit</button>
        </label>
      </form>
    </div>
  );
};

export default Contacts;
