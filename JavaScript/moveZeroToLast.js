// from the list of numbers move zero to the end of the list

let list = [1, 0, 2, 0, 4, 6]

for(let i = 0; i < list.length; i++){
    if(list[i] === 0){
        list.splice(i, 1);
        list.push(0);
    }
}
console.log(list);