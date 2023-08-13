function sortedSquareArray(arr) {
    const squareArray = [];
    for (let i = 0; i < arr.length; i++) {
        squareArray.push(arr[i] * arr[i])
    }
    squareArray.sort((a, b) => a - b);
    return squareArray;

}

const input = [1, 2, 3, 4, 5, 6, 7, 8, 9]
const res = sortedSquareArray(input)
console.log(res);

