public class TokenPass {

    private int[] board;
    private int currentPlayer;

    /** Creates the board array to be of size playerCount and fills it with
     * random integer values from 1 to 10, inclusive. Initializes currentPlayer to a
     * random integer value in the range between 0 and playerCount-1, inclusive.
     * @param playerCount the number of players
     */
    public TokenPass(int playerCount) {
        this.board= new int[playerCount]; //creates array of desired size. Will contain the tokens
        for(int i=0;i<board.length;i++) {
            board[i]=(int)(Math.random()*10+1); //sets each array to a random number

        }
        currentPlayer=(int)(Math.random()*playerCount-1); //chooses the starting player

    }

    /** Distributes the tokens from the current player's position one at a time to each player in
     * the game. Distribution begins with the next position and continues until all the tokens
     * have been distributed. If there are still tokens to distribute when the player at the
     * highest position is reached, the next token will be distributed to the player at position 0.
     * Precondition: the current player has at least one token.
     * Postcondition: the current player has not changed.
     */
    public void distributeCurrentPlayerTokens() {

        int currentPlayerToken=board[currentPlayer]; /*sets distributing tokens to randomly generated
        number in the array*/
        board[currentPlayer]=0; //sets the tokens at that index to zero.
        int nextPlayer=currentPlayer; //sets the next player to start at the current player

        while (currentPlayerToken>0) { //Is there a better way to do this especially finding the player number
            nextPlayer=(nextPlayer+1)%board.length; //chooses the player
            board[nextPlayer]++; //adds token
            currentPlayerToken--; //subtracts token from tokentotal initial

            /* Logic Behind nextPlayer
            if we start 6 and do (6+1)%7(this is board length)=0
            then we do next (0+1)%7=1
            and so on.
             */
        }
    }

    public int getCurrentPlayer() { //gets the current player
        return currentPlayer;
    }

    public int[] getBoard() { //gets board array(all the tokens)
        return board;
    }

    public void setBoard(int[] board) { //method to set the board
        this.board = board;
    }

    public void setCurrentPlayer(int currentPlayer) { /*method to make the test work
     sets the current player*/
        this.currentPlayer = currentPlayer;
    }
}
