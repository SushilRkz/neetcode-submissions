class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rowSet = new ArrayList<>();
        List<Set<Character>> colSet = new ArrayList<>();
        List<Set<Character>> squareSet = new ArrayList<>();
        for (int i=0;i<9;i++) {
            rowSet.add(new HashSet<>());
            colSet.add(new HashSet<>());
            squareSet.add(new HashSet<>());
        }
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                char boardChar = board[i][j];
                if (boardChar!='.') {
                    if (!rowSet.get(i).contains(boardChar)) {
                        rowSet.get(i).add(boardChar);
                    } else {
                        System.out.println("Present in row");
                        return false;
                    }
                    if (!colSet.get(j).contains(boardChar)) {
                        
                        colSet.get(j).add(boardChar);
                    } else {
                        System.out.println("Present in col");
                        return false;
                    }
                    int k = ((i)/3)*3+((j)/3);
                    if (!squareSet.get(k).contains(boardChar)) {
                        
                        squareSet.get(k).add(boardChar);
                    } else {
                        // System.out.println("Present in square");
                        // System.out.println("i="+i+"|j="+j+"|k="+k);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
