// Function to toggle between dark mode and light mode
function toggleDarkMode() {
    const body = document.body;
    body.classList.toggle("light-mode");

    // Update the button text based on the current mode
    const modeText = document.getElementById("mode-text");
    if (body.classList.contains("light-mode")) {
        modeText.textContent = "Switch to Dark Mode";  // Button text for light mode
    } else {
        modeText.textContent = "Switch to Light Mode";  // Button text for dark mode
    }
}

// Initialize functions when the page loads
document.addEventListener("DOMContentLoaded", function () {
    // Add event listener to the mode toggle button
    document.getElementById("mode-toggle").addEventListener("click", toggleDarkMode);
});
