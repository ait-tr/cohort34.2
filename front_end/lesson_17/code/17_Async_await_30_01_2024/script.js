const usersBtn = document.getElementById("loadUsersBtn");
const postsBtn = document.getElementById("loadPostsBtn");
const userList = document.getElementById("userList");
const postList = document.getElementById("postList");

usersBtn.onclick = () => {
  fetch("https://jsonplaceholder.typicode.com/users")
    .then((response) => response.json())
    .then((users) => {
      users.forEach((user) => {
        const li = document.createElement("li");
        li.textContent = user.name;
        userList.appendChild(li);
      });
    })
    .catch((error) => {
      const li = document.createElement("li");
      li.textContent = error.message;
      userList.appendChild(li);
    });
};

postsBtn.onclick = () => {
  fetch("https://jsonplaceholder.typicode.com/posts")
    .then((res) => res.json())
    .then((posts) => {
      posts.forEach((post) => {
        const li = document.createElement("li");
        li.innerHTML = `
            <h3>${post.title}</h3>
            <p>${post.body}</p>
        `;
        postList.appendChild(li);
      });
    });
};

// HOMEWORK

/*
    При нажатии на конкретного пользователя из списка должна отображаться
    детальная информация о пользователе:

    1. Email;
    2. Phone (только сам номер, без кода города);
    3. Website;
    4. Company;
    5. Address (улица и дом).
*/ 