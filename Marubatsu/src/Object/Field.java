package Object;

public class Field {
	static int[][] field = new int[3][3];
	/*
	 *�R���X�g���N�^:������
	 */
	Field(){
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				Field.field[i][j] = 0;
			}
		}
	}
}
