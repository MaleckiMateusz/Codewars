
public class Chess {

	public static void main(String[] args) {
		System.out.println(knight("a8", "h1"));

	}

	public static int knight(String start, String  finish) {
		
		int startpoziomo = start.charAt(0)-'a';
		int startpionowo = start.charAt(1)-'1';	
		int finishpoziomo = finish.charAt(0)-'a';
		int finishpionowo = finish.charAt(1)-'1';	
		int result = craeteboard(startpoziomo, startpionowo, finishpoziomo, finishpionowo);

        return result;
    }

	private static int craeteboard(int startpoziomo, int startpionowo, int finishpoziomo, int finishpionowo) {
		int[][] board = new int[8][8];
		drowNum(startpoziomo, startpionowo, 1, board);
		
		for(int num = 1; num < 7; num++)
			for(int i=0; i<8; i++) 
				for(int j=0; j<8; j++)
					if(board[i][j] == num)
						drowNum(i, j, num+1, board);
		
		board[startpoziomo][startpionowo] = 0;
		
		return board[finishpoziomo][finishpionowo];
	}

	private static void drowNum(int startpoziomo, int startpionowo, int numMove, int[][] board) {
		if(startpoziomo - 2 >= 0 && startpionowo - 1 >= 0)
		if(board[startpoziomo - 2][startpionowo - 1] == 0)
		board[startpoziomo - 2][startpionowo - 1] = numMove; //1
		
		if(startpoziomo - 1 >= 0 && startpionowo - 2 >= 0)
		if(board[startpoziomo - 1][startpionowo - 2] == 0)
		board[startpoziomo - 1][startpionowo - 2] = numMove; //2
		
		if(startpoziomo + 1 <= 7 && startpionowo - 2 >= 0)
		if(board[startpoziomo + 1][startpionowo - 2] == 0)
		board[startpoziomo + 1][startpionowo - 2] = numMove; //3
		
		if(startpoziomo - 2 >= 0 && startpionowo + 1 <= 7)
		if(board[startpoziomo - 2][startpionowo + 1] == 0)
		board[startpoziomo - 2][startpionowo + 1] = numMove; //4
		
		if(startpoziomo + 2 <= 7 && startpionowo - 1 >= 0)
		if(board[startpoziomo + 2][startpionowo - 1] == 0)
		board[startpoziomo + 2][startpionowo - 1] = numMove; //5
		
		if(startpoziomo - 1 >= 0 && startpionowo + 2 <= 7)
		if(board[startpoziomo - 1][startpionowo + 2] == 0)
		board[startpoziomo - 1][startpionowo + 2] = numMove; //6
		
		if(startpoziomo + 2 <= 7 && startpionowo + 1 <= 7)
		if(board[startpoziomo + 2][startpionowo + 1] == 0)
		board[startpoziomo + 2][startpionowo + 1] = numMove; //7
		
		if(startpoziomo + 1 <= 7 && startpionowo + 2 <= 7)
		if(board[startpoziomo + 1][startpionowo + 2] == 0) 
		board[startpoziomo + 1][startpionowo + 2] = numMove; //8
	}
}
