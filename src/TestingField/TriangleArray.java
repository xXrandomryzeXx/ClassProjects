package TestingField;

public class TriangleArray {
    public static void main(String[] args) {
        String[][]  triangle= {
                {"#"},
                {"#","#"},
                {"#","#","#"},
                {"#","#","#","#"}
        };
        for(int y = 0; y < triangle.length; y++){
            for(int x = 0; x < triangle[y].length; x++){
                System.out.print(triangle[y][x]+" ");
            }
            System.out.println();
        }
    }
}
