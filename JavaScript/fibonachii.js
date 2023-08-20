// user inputs -> 5 
// 0 1 1 2 3 5 8

let iterations = 12;
let num1 = 0;
let num2 = 1;
let num3 = num1 + num2;
let out = [num1, num2];
for(let i = 0; i < iterations; i++){
    let num3 = num1 + num2;
    out.push(num3);
    num1 = num2;
    num2 = num3;
}

console.log(out);