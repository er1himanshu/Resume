function toggleDarkMode() {
    const body = document.body;
    body.classList.toggle("light-mode");

    const modeText = document.getElementById("mode-text");
    if (body.classList.contains("light-mode")) {
        modeText.textContent = "Switch to Dark Mode";
    } else {
        modeText.textContent = "Switch to Light Mode";
    }
}

document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("mode-toggle").addEventListener("click", toggleDarkMode);
});
