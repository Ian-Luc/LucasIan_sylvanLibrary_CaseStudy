var vid;

function playVideo() {
    vid.play();
}
function stopVideo() {
    vid.pause();
}

document.addEventListener('DOMContentLoaded', () => {
    alert("This video is VERY LOUD and features flashing colors\nWatch with caution!!");
    vid = document.getElementById("ratmovie");
});