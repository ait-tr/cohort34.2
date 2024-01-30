function getFiveAfterSevenSeconds() {
  setTimeout(() => {
    return 5;
  }, 7000);
}

let res = getFiveAfterSevenSeconds();
console.log(res);

console.log("PROMISE");

const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    return reject("Error");
  }, 7000);
});

promise
  .then((value) => console.log(value))
  .catch((err) => console.log(err))
  .finally(console.log("Спасибо за использование Promises!"));

// TODO LIST App
const tasks = [];

const button = document.getElementById("addBtn");
const input = document.getElementById("taskInput");
const list = document.getElementById("taskList");

list.onclick = (e) => {
  console.log(e);
  if (e.target.tagName === "BUTTON") {
    e.target.parentElement.remove();
  }

  if (e.target.tagName === "INPUT") {
    const input = e.target.previousElementSibling;
    if (e.target.checked) {
      input.style.textDecoration = "line-through";
      // e.target.previousElementSibling.classList.add('line-through')
    } else {
      input.style.textDecoration = "none";
      // e.target.previousElementSibling.classList.add('none')
    }
  }
};

button.onclick = () => {
  const task = input.value.trim();
  if (task) {
    tasks.push(task);
    const li = document.createElement("li");
    // input с type='checkbox' имеет атрибут checked (true, если галочка есть и false, если нет)
    li.innerHTML = `
            <span>${tasks.length}) ${task}</span>
            <input type='checkbox'>
            <button>Delete</button>
        `;
    list.appendChild(li);
  }
  input.value = "";
};
