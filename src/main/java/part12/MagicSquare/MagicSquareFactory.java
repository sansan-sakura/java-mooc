
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int startPointColumn = size/2;
        square.placeValue(size/2,0 ,1);
        int column = size/2;
        int row = 0;

        // implement the creation of a magic square with the Siamese method algorithm here

        for(int i = 2; i <= size * size; i++){

            int point = square.readValue(column, row);

            if(point >= 0){
                int originalColumn = column;
                int originalRow = row;
                column = column + 1;
                row = row - 1;

                if(column >= size){

                    column = 0;
                }



                if(row < 0){
                    row =  size - 1;
                }

                point = square.readValue(column, row);

                if(point > 0){
                    column = originalColumn;
                    row = originalRow + 1;
                }
            }
            square.placeValue(column, row, i);



        }


        return square;
    }

}
