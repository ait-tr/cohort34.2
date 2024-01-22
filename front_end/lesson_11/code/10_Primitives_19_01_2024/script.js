let x; // undefined
console.log(x);

x = 7.5; // number
console.log(typeof x);

x = "bye"; // string
console.log(typeof x);

x = true; // boolean
console.log(typeof x);

// Конкатенация
let res = "true" + 5; // 'true5'

// Работа с разными типами данных
res = true + 5; // true -> 1 ; false -> 0
console.log(res); // 6

// false = 0, NaN, '', undefined, null, false
x = 10; // Boolean(x)
x = !!x;
console.log(x);
console.log(!!"hello"); // true
console.log(!!0); // false

res = 5; //
console.log(typeof res); // number

res += ""; // '5'    String(res)
console.log(typeof res); // string

res = Number("5a"); // NaN - Not A Number
console.log(res);
console.log(typeof res);

res = +"5"; // 5
console.log(res);
console.log(typeof res);

res = parseInt("545ab4frde");
console.log(res);
console.log(typeof res);

res = eval("10*10+5");
console.log(res);
console.log(typeof res);

/* 
    =        ->        присвоение значения
    ==       ->        нестрогое сравнение  (без учёта типов данных)
    ===      ->        строгое сравнение  (с учётом типов данных)
*/

x = "2" == 2; // true
console.log(x);

x = "2" === 2; // false
console.log(x);

x = 10;

res = x++ + ++x;

// HomeWork
// BASIC

res = sumDigits(1234); // 1 + 2 + 3 + 4 = 10

function sumDigits(x) {
  let sum = 0;
  // TODO
  // 1234      1234 % 10 = 4
  while (x) {
    // x != 0
    sum += x % 10; // sum = sum + (x % 10)
    x = (x - (x % 10)) / 10;
  }

  return sum;
}

res = luckyNumber(123321); // 1 + 2 + 3 == 8 + 7 + 1
console.log(res);

function luckyNumber(x) {
  //TODO
    let numberLength = (x + "").length;
    let halfLength = (numberLength / 2) - ((numberLength / 2) % 1);
    console.log(numberLength);
    console.log(halfLength);

    const secondHalf = x % (10**halfLength);
    const firstHalf = (x - secondHalf) / (10**halfLength);
    return sumDigits(firstHalf) == sumDigits(secondHalf);

//   if ((x + "").length === 6) {
//     const secondHalf = x % 1000;
//     const firstHalf = (x - secondHalf) / 1000;
//     return sumDigits(firstHalf) == sumDigits(secondHalf);
//   } else {
//     return 'Wrong number';
//   }
}

// ADVANCED

function banana() {
  let a = "a";
  let b = "b";

  console.log((b + a + +a + a).toLowerCase());

  // TODO: 'b', 'a' -> 'baNaNa'
  // TODO: 'b', 'a' -> 'banana'
}

banana();


function fourOrSeven(x) {
    // if (x === 4) {
    //     return 7;
    // } else {
    //     return 4;
    // }

    // return x === 4 ? 7 : 4

    // switch (x) {
    //     case 4:
    //         return 7;
    //     default:
    //         return 4;
    // }

    // return 11 - x;

    // return 28 / x;
}