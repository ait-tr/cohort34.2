let arr = [1, 2, 3, 'four', 'five'];
console.log(arr);
console.log(typeof arr);

// Метод push() меняет исходный массив, добавляя элементы в конец массива
// Возвращает новую длину массива
console.log('========= PUSH =========');
let res = arr.push(6, 7, 8);

console.log(arr); // [1, 2, 3, 'four', 'five', 6, 7, 8]
console.log(res); // 8


// Метод pop() меняет исходный массив, удаляя элемент из конца массива
// Возвращает удалённый элемент
console.log('========= POP =========');
res = arr.pop();

console.log(arr); // [1, 2, 3, 'four', 'five', 6, 7]
console.log(res); // 8

// Метод shift() меняет исходный массив, удаляя элемент из начала массива
// Возвращает удалённый элемент
console.log('========= SHIFT =========');
res = arr.shift();

console.log(arr); // [2, 3, 'four', 'five', 6, 7]
console.log(res); // 1


// Метод unshift() меняет исходный массив, добавляя элементы в начало массива
// Возвращает новую длину массива
console.log('========= UNSHIFT =========');
res = arr.unshift(0, 1);

console.log(arr); // [0, 1, 2, 3, 'four', 'five', 6, 7]
console.log(res); // 8


console.log('========= CONCAT =========');
let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6];
res = arr1.concat(arr2);
console.log(arr1);
console.log(arr2);
console.log(res);

// Поверхностное копирование
let arrCopy = arr1;
console.log(arr1);
console.log(arrCopy);

arr1[0] = 1000;
console.log(arr1);
console.log(arrCopy);

// Глубокое копирование
let arrTrueCopy = [...arr1];
console.log(arrTrueCopy);
console.log(arr1);

arr1[0] = 1;
console.log(arrTrueCopy);
console.log(arr1);

