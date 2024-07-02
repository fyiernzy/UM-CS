const express = require('express')
const path = require('path');
const app = express();

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));
app.use(express.static(path.join(__dirname, 'public')));

app.listen(3000, () => {
    console.log("Listen on port 3000");
});

app.get('/transaction/:month', (req, res) => {
    const transactions = [
        { date: "2020-01-01", type: "income", amount: 1000 },
        { date: "2020-01-11", type: "income", amount: 1000 },
        { date: "2020-12-27", type: "income", amount: 1000 },
        { date: "2021-03-17", type: "income", amount: 1000 },
        { date: "2022-04-05", type: "income", amount: 1000 },
    ];

    res.render('transaction', { transactions: transactions });
});