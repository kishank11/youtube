function optimalFreelancing(jobs) {
    const weekLength = 7;
    jobs.sort((a, b) => b.payment - a.payment);
    let maxProfit = 0;
    let timeline = new Array(weekLength).fill(0);
    for (let i = 0; i < jobs.length; i++) {
        const deadline = jobs[i].deadline;
        const payment = jobs[i].payment;


        for (let day = deadline - 1; day >= 0; day--) {
            if (timeline[day] === 0) {
                timeline[day] = payment;
                maxProfit += payment;
                break;
            }
        }
    }
    return maxProfit;
}

const jobs = [{ deadline: 2, payment: 1 },
{ deadline: 2, payment: 2 },
{ deadline: 2, payment: 2 }]


const res = optimalFreelancing(jobs)

console.log("Maximum Profit:, ", res);