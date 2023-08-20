// take a number and then reverse it
let num = 232445;

let reverse = 0;
while(num > 0){
    let remainder = num % 10;
    reverse = reverse * 10 + remainder;
    num = Math.floor(num / 10);
}

console.log(reverse)