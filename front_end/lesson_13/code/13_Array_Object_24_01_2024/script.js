let arr = ['one', 'two', 'Three', 'eight', 'tHree', 'thrEE', 'six'];

console.log('========== indexOf ==========');
let res = arr.indexOf('Three', 3); // -1 - элемент в массиве не найден

console.log(arr); // Исходный массив не изменился
console.log(res); // Индекс искомого элемента или -1, если такого элемента в массиве нет

console.log('========== includes ==========');
res = arr.includes('two'); // true - элемент в массиве найден

console.log(arr); // Исходный массив не изменился
console.log(res); // true, если искомый элемент в массиве есть и false, если нет

console.log('========== findIndex ==========');
res = arr.findIndex(predicateLength3); // Индекс элемента, подходящего по условию или -1, если такого элемента в массиве нет

function predicateLength3(element, index) {
    return element.length === 3 && index > 2
}

console.log(arr); // Исходный массив не изменился
console.log(res); // 6

// res = arr.findIndex((element, index) => element.length === 3 && index > 2)
res = arr.findIndex((element, index) => {
    console.log('Hello from arrow function');
    return element.length === 3 && index > 2;
})

res = arr.findIndex((element, index) => element.toLowerCase() === 'three' && index > 2);
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
    firstName: 'Peter',
    lastName: 'Parker',
    age: 45,
    address: {
        country: 'USA',
        city: 'NY',
        house: {
            street: 'Roosevelt',
            number: 111,
            liter: 'a',
            apartment: 16 
        }
    },
    fullName: () => console.log(person.firstName + ' ' + person.lastName)
}

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