// Question 1
for(var i = 0; i < 40; i++) {
    if (i % 2 == 1)
        console.log(i);
}

var j = 0;
while (j < 40) {
    if (j % 2 == 1)
        console.log(j);
    j++;
}

// Question 2
function printReverse(array) {
    for(var k = array.length - 1; k >= 0; k--)
        console.log(array[k]);
}

printReverse([1, 2, 3, 4]);
printReverse(["a", "b"]);

class Movie {
    constructor(title, rating, hasWatched) {
        this.title = title;
        this.rating = rating;
        this.hasWatched = hasWatched;
    }

    print() {
        console.log("You have " + (this.hasWatched ? "watched" : "not seen") + " \"" + this.title + "\" - " + this.rating + " stars");
    }
}

var movies = [new Movie("In Bruges", 5, true), new Movie("Frozen", 4.5, false), new Movie("Mad Max Fury Road", 5, true), new Movie("Les Miserables", 3.5, false)];
movies.forEach(movie => movie.print());