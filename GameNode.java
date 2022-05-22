public class GameNode {
    //static int currentNumberOfPieces;
    int currentNumberOfPieces;
    int initialNumberOfPieces;
    int level;
    int minMaxValue;
    String strRepresentation = "";
    GameNode oneMoveChildren;
    GameNode twoMovesChildren;


    public GameNode(int currentNumberOfPeices){
        this.currentNumberOfPieces = currentNumberOfPeices;
        this.initialNumberOfPieces = currentNumberOfPieces;

        for (int i = 0; i<this.currentNumberOfPieces; i++){
            strRepresentation+="● ";
        }
    }

    public void setCurrentNumberOfPieces(int currentNumberOfPieces) {
        //GameNode.currentNumberOfPieces = currentNumberOfPieces;
    }

    public int getCurrentNumberOfPieces() {
        return currentNumberOfPieces;
    }

    public String toString(){

        return this.strRepresentation;
    }

    public boolean isWinning(){
        return currentNumberOfPieces<=0?true:false;
    }

    public boolean isTerminalNode(){
        return isWinning()?true:false;
    }


}
