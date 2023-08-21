
const numbers = [64, 34, 25, 12, 22, 11, 90];

// Bubble Sort 

for (let round = 0; round < numbers.length - 1; round++){
    for (let i = 0; i < numbers.length - 1; i++){
        if(numbers[i] > numbers[i + 1] ){
            let temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }
    }
}
console.log(numbers)

// binary search
const target = 64;

let start = 0;
let end = numbers.length - 1;

function binarySearch(start, end){
    while(start <= end){
        let mid = start + (end - start) / 2;
        if(target === numbers[mid]){
            return mid;
        }else if(target > numbers[mid]){
            start = mid + 1;
        }else {
            end = mid - 1;
        }
    }
    return -1;
}


let ans = binarySearch(start, end);
console.log(ans)