import java.util.Scanner;

public class TestClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (0 to exit): ");
        int nOfElements = sc.nextInt();
        if (nOfElements==0){
            System.exit(-1);
        }
        GameTree nimTree = new GameTree(nOfElements);
        nimTree.generateNextMoves(nimTree.root);
        System.out.println("> Created tree with "+nOfElements+" elements: "+nimTree.root);
        System.out.println("Choose the CPU strategy 1.Perfect || 2.Random");
        int strategyChoice = sc.nextInt();
        if (strategyChoice==1)
            System.out.println("CPU strategy is: Perfect strategy (deterministic with minimax, remove 2 if no move is optimal)");
        else
            System.out.println("CPU strategy is: Random strategy (Taking random move 1 or 2)");
        boolean isPerfectStrategy = strategyChoice==1?true:false;
        System.out.print("_______________________________\nDo you want to go first? (true/false)");
        boolean playerGoesFirst = sc.nextBoolean();
        if (playerGoesFirst){
            System.out.println("> Player is first");
            nimTree.assignMinMaxValues(true);
            nimTree.playerTurn(nimTree.root, isPerfectStrategy);
        }else {
            System.out.println("> Computer is first");
            nimTree.assignMinMaxValues(false);
            if (isPerfectStrategy)
                nimTree.CPUTurn(nimTree.root, isPerfectStrategy);
            else
                nimTree.CPUTurnRandom(nimTree.root, isPerfectStrategy);
        }




    }
}
