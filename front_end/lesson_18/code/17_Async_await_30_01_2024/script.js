const usersBtn = document.getElementById("loadUsersBtn");
const postsBtn = document.getElementById("loadPostsBtn");
const userList = document.getElementById("userList");
const postList = document.getElementById("postList");
const details = document.getElementById("userDetails");

usersBtn.onclick = () => {
  fetch("https://jsonplaceholder.typicode.com/users")
    .then((response) => response.json())
    .then((users) => {
      userList.innerHTML = "";
      users.forEach((user) => {
        const li = document.createElement("li");
        li.textContent = user.name;
        li.style.cursor = "pointer";
        // () => displayUserDetails(user)       |||       displayUserDetails(user)      |||      displayUserDetails
        li.onclick = () => displayUserDetails(user);
        userList.appendChild(li);
      });
    })
    .catch((error) => {
      const li = document.createElement("li");
      li.textContent = error.message;
      userList.appendChild(li);
    })
    .finally(() => console.log("Hello from block finally"));
};

function displayUserDetails({
  name,
  email,
  phone,
  website,
  company: { name: companyName },
  address: { city, street, suite },
}) {
  details.innerHTML = `
      <h2>${name}</h2>
      <p><strong>Email: </strong>${email}</p>
      <p><strong>Phone: </strong>${phone.split(" ")[0]}</p>
      <p><strong>Website: </strong>${website}</p>
      <p><strong>Company: </strong>${companyName}</p>
      <p><strong>Address: </strong>${city}, ${street}, ${suite}</p>
    `;
}

postsBtn.onclick = () => {
  fetch("https://jsonplaceholder.typicode.com/posts")
    .then((res) => res.json())
    .then((posts) => {
      postList.innerHTML = "";
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

// console.log("1-770-736-8031 x56442".split(' ')[0]);
