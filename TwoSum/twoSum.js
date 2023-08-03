function twoSum(arr, target) {
    const seenNumbers = new Set();
    for (const num of arr) {
        const complement = target - num;
        if (seenNumbers.has(complement)) {

            return [complement, num]
        }
        seenNumbers.add(num);
    }

    return [];
}

const inputArray = [3, 5, -4, 8, 11, 1, -1, 6];
const targetValue = 10;
const result = twoSum(inputArray, targetValue);
console.log(result);