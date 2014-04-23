package Object;

public class Judge {
	private static boolean player1=false;
	private static boolean player2=false;

	void playerTurnSet(int n){
		if(n==1){
			player1=true;
			player2=false;
		}
		if(n==2){
			player1=false;
			player2=true;
		}
	}
	 int playerTurnGet(){
		 if(player1==true && player2==false){
			 return 1;
		 }
		 if(player1==false && player2==true){
			 return 2;
		 }
		 return 0;
	}
	/*
	 * 0:引き分け
	 * 1:1番目の引数が勝ち
	 * 2:2番目の引数が勝ち
	 */
	int WnLeJudge(Player p1,Player p2){
		return 0;
	}

	/*
	 * そろっているかのサーチ
	 *
	 */
	boolean BingoSearch(int[][] field){
		return false;
	}

	void Print(int[][] a){
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
