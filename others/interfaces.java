public class interfaces{
    public static void main(String args[])
    {
        Queen q= new Queen();
        q.moves();
        Rook r=new Rook();
        r.moves();
        pawn p=new pawn();
        p.moves();
    }
}
interface ChessPlayer{//interface initialization
    void moves();//gives the blueprint
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all dirn)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class pawn implements ChessPlayer{
    public void moves(){
        System.out.println("up(2 steps in first move and then 1)");
    }
}

class king implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,diagonal(in all dirn only 1 step)");
    }
}