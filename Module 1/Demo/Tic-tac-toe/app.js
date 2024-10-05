const boardElement = document.getElementById('board');
let board = ['', '', '', '', '', '', '', '', ''];
let currentPlayer = 'X'; // Người chơi sẽ luôn là 'X'
let isGameOver = false;

const winningCombinations = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
];

boardElement.addEventListener('click', handleClick);

function handleClick(event) {
    const index = event.target.dataset.index;
    if (!isGameOver && board[index] === '') {
        board[index] = currentPlayer;
        event.target.textContent = currentPlayer;
        if (checkWin(currentPlayer)) {
            alert(currentPlayer + ' thắng!');
            isGameOver = true;
        } else if (board.every(cell => cell !== '')) {
            alert('Hòa!');
            isGameOver = true;
        } else {
            currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
            if (currentPlayer === 'O') {
                computerMove();
            }
        }
    }
}

function checkWin(player) {
    return winningCombinations.some(combination => {
        return combination.every(index => board[index] === player);
    });
}

function computerMove() {
    // Đơn giản là chọn ô trống đầu tiên
    for (let i = 0; i < board.length; i++) {
        if (board[i] === '') {
            board[i] = 'O';
            const cell = boardElement.querySelector(`.cell[data-index="${i}"]`);
            cell.textContent = 'O';
            if (checkWin('O')) {
                alert('O thắng!');
                isGameOver = true;
            } else if (board.every(cell => cell !== '')) {
                alert('Hòa!');
                isGameOver = true;
            }
            currentPlayer = 'X';
            break;
        }
    }
}