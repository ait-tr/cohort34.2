// HOMEWORK

/* 
    const items = [];
    Необходимо создать объект stock, который будет представлять склад нашей продукции

    1. totalCost: 0 // Итоговая стоимость всех товаров
    2. addItem() // функция для добавления товара на склад
    3. removeItem() // функция для удаления товара на склад
    4. updateTotalCost() // обновление значения totalCost

    item = {
        name: 'Snickers',
        price: 5,
        quantity: 100
    }
*/

const stock = {
  items: [], // массив с товарами
  totalCost: 0,
  addItem(item) {
    const existingItem = this.items.find((e) => e.name === item.name);

    if (existingItem) {
      existingItem.quantity += item.quantity;
    } else {
      this.items.push(item);
    }
  },
  removeItem(itemName, count) {
    const index = this.items.findIndex((e) => e.name === itemName);
    if (index !== -1 && count <= this.items[index].quantity) {
      count === this.items[index].quantity
        ? this.items.splice(index, 1)
        : (this.items[index].quantity -= count);
    }
  },
  updateTotalCost() {
    // let updatedCost = 0;
    // for (const item of this.items) {
    //   updatedCost += item.price * item.quantity;
    // }
    // this.totalCost = updatedCost;
    this.totalCost = this.items.reduce(
      (acc, item) => acc + item.quantity * item.price,
      0
    );
    console.log(this.totalCost);
  },
};

stock.updateTotalCost();

const productName = document.getElementById("productName");
const productPrice = document.getElementById("productPrice");
const productQuantity = document.getElementById("productQuantity");
const add = document.getElementById("add");
const stats = document.getElementById("stats");
const productList = document.getElementById("productList");
const statsList = document.getElementById("statsList");

add.onclick = () => {
  const name = productName.value.trim();
  const price = +productPrice.value.trim();
  const quantity = +productQuantity.value.trim();

  if (name && price && quantity) {
    stock.addItem({ name, price, quantity })
  }

  productList.innerHTML = '';
  stock.items.forEach(e => {
    const li = document.createElement('li');
    li.textContent = `
      Product name: ${e.name},
      Product price: ${e.price},
      Product quantity: ${e.quantity}
    `;
    productList.appendChild(li);
  })
}

// item = {
//   name: 'Snickers',
//   price: 5,
//   quantity: 100
// }

// HOMEWORK

/* 
  1. Кол-во позиций;
  2. Итоговая стоимость всех продуктов;
  3. Итоговое кол-во всех продуктов;
  4. Макс. цена;
  5. Средняя цена;
  6. Мин. цена.
*/