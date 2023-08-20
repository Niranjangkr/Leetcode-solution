// print 1-100 number any  no which is divisible by 7 print bizz and no. divisible by 5 print Buzz 
// print BizzBuzz on the same line 
let out = "";
for (let i = 0; i <= 100; i++){
    if(i % 7 == 0){
        out += "Bizz";
    }else if (i % 5 == 0){
        out += "Buzz";
    }
    console.log(i);
}

console.log(out);