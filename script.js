document.addEventListener("DOMContentLoaded", function () {
    const toggle = document.getElementById("mode-toggle");
    const year = document.getElementById("year");

    toggle.addEventListener("click", () => {
        document.body.classList.toggle("light-mode");
    });

    if (year) {
        year.textContent = new Date().getFullYear();
    }
});
