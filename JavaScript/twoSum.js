// two sum 
// nums = [2,7,11,15], target = 9

let nums = [2,7,11,15];
let target = 26;
let out = [];

for(let i = 0; i < nums.length; i++){
    for(let j = 0; j < nums.length; j++){
        if(i === j){
            break;
        }else if(nums[i] + nums[j] == target){
            out[0] = i;
            out[1] = j;
        }
    }
}

console.log(out);