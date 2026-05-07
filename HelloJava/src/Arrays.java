public class Arrays {
    public static void main(String[] args) {
        
        System.out.println("Integer arrays");
        int array [] = {71,82,93,40,55,86,79,83,91,10};
        
        for(int i=0; i<array.length; i++){
                System.out.println("Index number:" + i + "  Value:" + array[i]);
        }

        System.out.println("\nString arrays");
        String names []= {"ali", "sana", "zara", "alice", "bob"};

        for(int j=0; j<names.length; j++){
            System.out.println("Index number:" + j + "  Value:" + names[j]);
        }

        System.out.println("\nUsing for-each loop");
        for(String name: names){
            System.out.println(name);
        }

        //Multi dimensional arrays
        System.out.println("\nMulti dimensional arrays");
        int multiArray [][] = {{81,20,63}, {48,15,6}, {87,89,94}};
        System.out.println("Value at [0][2]:" + multiArray[0][2]);
        System.out.println("Value at [1][1]:" + multiArray[1][1]);

        System.out.println("\nUsing nested for loop");
        for(int row=0; row<multiArray.length; row++){
            for(int col=0; col<multiArray[row].length; col++){
                System.out.println("Value at [" + row + "][" + col + "]:" + multiArray[row][col]);
            }
        }

        System.out.println("\nSorting array");
        for(int i=0; i<multiArray.length; i++){
            for(int j=0; j<multiArray[i].length-1; j++){
                for(int k=0; k<multiArray[i].length-j-1; k++){
                    if(multiArray[i][k] > multiArray[i][k+1]){
                        //swapping logic
                        int temp = multiArray[i][k];
                        multiArray[i][k] = multiArray[i][k+1];
                        multiArray[i][k+1] = temp;
                    } 
                }
            }
        }

        System.out.println("\nArray after sorting:");
        for(int row=0; row < multiArray.length; row++){
            for(int col=0; col < multiArray[row].length; col++){
                System.out.print(multiArray[row][col] + " ");
            }
            System.out.println();
        }
            }
}
