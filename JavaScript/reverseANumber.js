// // take a number and then reverse it
// let num = 232445;

// let reverse = 0;
// while(num > 0){
//     let remainder = num % 10;
//     reverse = reverse * 10 + remainder;
//     num = Math.floor(num / 10);
// }

// console.log(reverse)

// let num = 232445;
// let numStr = num.toString(); // Convert number to string
// let reverseStr = '';

// for (let i = numStr.length - 1; i >= 0; i--) {
//     reverseStr += numStr[i];
// }

// let reverse = parseInt(reverseStr); // Convert the reversed string back to a number

// console.log(reverse);


let num = 232445;
let reverse = 0;

while (num > 0) {
    let lastDigit = num - Math.floor(num / 10) * 10;    
    reverse = reverse * 10 + lastDigit;
    num = Math.floor(num / 10);
}

console.log(reverse);
