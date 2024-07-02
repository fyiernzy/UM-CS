// Q1a
document.querySelectorAll('li').forEach((li) => {
    console.log(li.textContent);
})

document.querySelector('a.special').addEventListener('mouseover', () => {
    alert("Book a tour");
})
