let arr = ["one", "two", "Three", "eight", "tHree", "thrEE", "six"];

console.log("========== indexOf ==========");
let res = arr.indexOf("Three", 3); // -1 - элемент в массиве не найден

console.log(arr); // Исходный массив не изменился
console.log(res); // Индекс искомого элемента или -1, если такого элемента в массиве нет

console.log("========== includes ==========");
res = arr.includes("two"); // true - элемент в массиве найден

console.log(arr); // Исходный массив не изменился
console.log(res); // true, если искомый элемент в массиве есть и false, если нет

console.log("========== findIndex ==========");
res = arr.findIndex(predicateLength3); // Индекс элемента, подходящего по условию или -1, если такого элемента в массиве нет

function predicateLength3(element, index) {
  return element.length === 3 && index > 2;
}

console.log(arr); // Исходный массив не изменился
console.log(res); // 6

// res = arr.findIndex((element, index) => element.length === 3 && index > 2)
res = arr.findIndex((element, index) => {
  console.log("Hello from arrow function");
  return element.length === 3 && index > 2;
});

res = arr.findIndex(
  (element, index) => element.toLowerCase() === "three" && index > 2
);
console.log(res);

console.log(multiply(2, 5));

function multiply(a, b) {
  return a * b;
}

console.log(multiply(2, 5));

// multiplyArrow(2, 5); ReferenceError

const multiplyArrow = (a, b) => a * b;
// const multiplyArrow = (a, b) => {
//     return a * b
// };

console.log(multiplyArrow(8, 6));

const person = {
  firstName: "Peter",
  lastName: "Parker",
  age: 45,
  address: {
    country: "USA",
    city: "NY",
    house: {
      street: "Roosevelt",
      number: 111,
      liter: "a",
      apartment: 16,
    },
  },
  fullName: () => console.log(person.firstName + " " + person.lastName),
};

person.fullName();

res = Object.keys(person); // Массив ключей объекта
console.log(res);

res = Object.values(person); // Массив значений объекта
console.log(res);

res = Object.entries(person); // Массив, где каждым элементом является массив из двух элементов: ключ, значение
console.log(res);

// HOMEWORK

/* 
    Необходимо создать объект bankAccount (дебетовая карта), представляющий собой
    банковский счёт со следующими свойствами (ключами):

    1. accountNumber: '123456789';
    2. accountHolderName: 'Alice';
    3. balance: 0;
    4. deposit(sum) - для описания действия по добавлению суммы на счёт;
    5. withdraw(sum) - для описания действия по списанию суммы со счёта;
    6. checkBalance() - для проверки баланса.
*/

const bankAccount = {
  accountNumber: "123456789",
  accountHolderName: "Alice",
  balance: 1000,
  deposit: (sum) => {
    sum > 5 && sum < 100000
      ? (bankAccount.balance += sum)
      : console.log("Вводимая сумма некорректная");
  },
  withdraw: (sum) => {
    sum > 5 && sum <= bankAccount.balance
      ? (bankAccount.balance -= sum)
      : console.log("Вводимая сумма некорректная");
  },
  checkBalance: () => console.log(bankAccount.balance),
};

bankAccount.checkBalance();

// DEPOSIT

// bankAccount.deposit(500);
// bankAccount.checkBalance();

// bankAccount.deposit(700);
// bankAccount.checkBalance();

// bankAccount.deposit(-500);
// bankAccount.checkBalance();

// bankAccount.deposit(100500);
// bankAccount.checkBalance();

// // WITHDRAW

// bankAccount.withdraw(500);
// bankAccount.checkBalance();

// bankAccount.withdraw(700);
// bankAccount.checkBalance();

// bankAccount.withdraw(-500);
// bankAccount.checkBalance();

// bankAccount.withdraw(100500);
// bankAccount.checkBalance();

const balanceH1 = document.getElementById('balanceH1');
const withdrawBtn = document.getElementById('withdrawBtn');
const amountInput = document.getElementById('amountInput');
const depositBtn = document.getElementById('depositBtn');
const timeH2 = document.getElementById('timeH2');

withdrawBtn.onclick = () => {
    // isNaN(num) => num === NaN
    if (!isNaN(+amountInput.value)) {
        bankAccount.withdraw(+amountInput.value);
    }
    balanceH1.textContent = 'Balance: ' + bankAccount.balance;
    amountInput.value = '';
}

depositBtn.onclick = () => {
    // isNaN(num) => num === NaN
    if (!isNaN(+amountInput.value)) {
        bankAccount.deposit(+amountInput.value);
    }
    balanceH1.textContent = 'Balance: ' + bankAccount.balance;
    amountInput.value = '';
}

const date = new Date();

console.log(date.getTime() / 1000 / 60 / 60 / 24 / 365.25);

const time = () => {
    // '13:25:10'
    const actualDate = new Date();
    const hours = actualDate.getHours() < 10 ? '0' + actualDate.getHours() : actualDate.getHours();
    const minutes = actualDate.getMinutes() < 10 ? '0' + actualDate.getMinutes() : actualDate.getMinutes();
    const seconds = actualDate.getSeconds() < 10 ? '0' + actualDate.getSeconds() : actualDate.getSeconds();
    const actualTime = `${hours}:${minutes}:${seconds}`;
    timeH2.textContent = actualTime;
    console.log(actualTime);
}

setInterval(time, 1000);

// HOMEWORK

/* 
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