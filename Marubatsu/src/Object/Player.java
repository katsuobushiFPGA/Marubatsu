package Object;

public class Player {
	private boolean playerTurn=false;
	void start(){
		this.playerTurn=true;
	}
	void fieldSet(int[][] field,int n){
//		if()
		switch(n){
			case 1:field[0][0]=0;
				   break;
			default:break;
		}
	}
	void turnEnd(){
		this.playerTurn=false;
	}
}

