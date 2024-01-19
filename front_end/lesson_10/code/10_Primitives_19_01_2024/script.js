let x; // undefined
console.log(x);

x = 7.5; // number
console.log(typeof x);

x = 'bye'; // string
console.log(typeof x);

x = true; // boolean
console.log(typeof x);


// Конкатенация
let res = 'true' + 5; // 'true5'

// Работа с разными типами данных
res = true + 5; // true -> 1 ; false -> 0
console.log(res); // 6

// false = 0, NaN, '', undefined, null, false
x = 10; // Boolean(x)
x = !!x;
console.log(x);
console.log(!!'hello'); // true
console.log(!!0); // false

res = 5; // 
console.log(typeof res); // number

res += ''; // '5'    String(res)
console.log(typeof res); // string


res = Number('5a'); // NaN - Not A Number
console.log(res);
console.log(typeof res);

res = +'5'; // 5
console.log(res);
console.log(typeof res);

res = parseInt('545ab4frde');
console.log(res);
console.log(typeof res);

res = eval('10*10+5');
console.log(res);
console.log(typeof res);

/* 
    =        ->        присвоение значения
    ==       ->        нестрогое сравнение  (без учёта типов данных)
    ===      ->        строгое сравнение  (с учётом типов данных)
*/

x = '2' == 2   // true
console.log(x);

x = '2' === 2   // false
console.log(x);

x = 10;

res = x++ + ++x;

// HomeWork
// BASIC

res = sumDigits(1234) // 1 + 2 + 3 + 4 = 10

function sumDigits(x) {
    //TODO
}

res = luckyNumber(123871) // 1 + 2 + 3 == 8 + 7 + 1

function luckyNumber(x) {
    //TODO
}

// ADVANCED

function banana() {
    let a = 'a';
    let b = 'b';

    // TODO: 'b', 'a' -> 'banana'
}