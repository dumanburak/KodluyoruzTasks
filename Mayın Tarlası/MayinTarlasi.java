import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int row;
    int column;
    String[][] originalMap;
    String[][] showMap;


    public MayinTarlasi(int Row, int Column)
    {
        this.row = Row;
        this.column = Column;
        InitialMap();
    }

    public void InitialMap()
    {
        System.out.println("--------- May�n Tarlas� ---------");
        int minePiece = row * column / 4;
        //--------- G�sterilecek Map ---------
        showMap = new String[row][column];
        for(int i = 0;i < showMap.length;i++)
        {
            for(int j = 0; j < showMap[i].length; j++)
            {
                showMap[i][j] = "-";
            }
        }
        Random random = new Random();
        originalMap = new String[row][column];
        while(minePiece > 0)
        {
            int randomRow = random.nextInt(row);
            int randomColumn = random.nextInt(column);
            if(originalMap[randomRow][randomColumn] == null)
            {
                originalMap[randomRow][randomColumn] = "*";
                minePiece--;
            }
        }
        for(int i = 0;i < originalMap.length;i++)
        {
            for(int j = 0; j < originalMap[i].length; j++)
            {
                if(originalMap[i][j] == null) originalMap[i][j] = "-";
            }
        }

    }
    boolean checkRange(int x, int y)
    {
        // ------ Se�ilen konumda map aral���m�zda m� kontrol ediyoruz ---------
        return x < row && y < column;
    }
    boolean checkMine(int x, int y)
    {
        // ------ Se�ilen konumda may�n varsa geriye true d�nd�rerek yar��may� sonland�raca��z. ---------
        return originalMap[x][y].equals("*");
    }
    int checkPoint(int x, int y)
    {
        int result = 0;
        // ------ Se�ilen Konumun �st Kom�usu varm� kontrol ediyoruz. --------
        if(y - 1 >= 0)
        {
            // ------ Se�ilen Konumun Sol �st Kom�usunu Kontrol Ediyoruz. Kom�usunda may�n olup olmad���na bak�yoruz ----------
            if(x -1 >= 0)
            {
                if(originalMap[x-1][y-1].equals("*")) result++;
            }
            //------ Se�ilen Konumun �st Kom�usunu Kontrol Ediyoruz
            if(x < column)
            {
                if(originalMap[x][y-1].equals("*")) result++;
            }
            //------ Se�ilen Konumun Sa� �st Kom�usunu Kontrol Ediyoruz
            if(x + 1 < column)
            {
                if(originalMap[x+1][y-1].equals("*")) result++;
            }
        }
        if(y  < row)
        {
            // ------ Se�ilen Konumun Sol Kom�usunu Kontrol Ediyoruz. Kom�usunda may�n olup olmad���na bak�yoruz ----------
            if(x -1 >= 0)
            {
                if(originalMap[x-1][y].equals("*")) result++;
            }
            //------ Se�ilen Konumun Sa� Kom�usunu Kontrol Ediyoruz
            if(x + 1 < column)
            {
                if(originalMap[x+1][y].equals("*")) result++;
            }
        }
        // ------ Se�ilen Konumun Alt Kom�usu varm� kontrol ediyoruz. --------
        if(y + 1 < row )
        {
            // ------ Se�ilen Konumun Sol Alt Kom�usunu Kontrol Ediyoruz. Kom�usunda may�n olup olmad���na bak�yoruz ----------
            if(x -1 >= 0)
            {
                if(originalMap[x-1][y+1].equals("*")) result++;
            }
            //------ Se�ilen Konumun Alt Kom�usunu Kontrol Ediyoruz
            if(x < column)
            {
                if(originalMap[x][y+1].equals("*")) result++;
            }
            //------ Se�ilen Konumun Sa� Alt Kom�usunu Kontrol Ediyoruz
            if(x + 1 < column)
            {
                if(originalMap[x+1][y+1].equals("*")) result++;
            }
        }
        return result;
    }
    boolean checkWin()
    {
        for(int i = 0;i < originalMap.length;i++)
        {
            for(int j = 0; j < originalMap[i].length; j++)
            {
                if(!originalMap[i][j].equals("*"))
                {
                    if(originalMap[i][j].equals(showMap[i][j]))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void GameScreen()
    {
        System.out.println("=================================");
        for(int i = 0;i < showMap.length;i++)
        {
            for(int j = 0; j < showMap[i].length; j++)
            {
                System.out.print(showMap[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=================================");
    }
    public void run()
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            GameScreen();
            System.out.print("Sat�r Giriniz : ");
            int selectedRow = scan.nextInt();
            System.out.print("S�tun Giriniz : ");
            int selectedColumn = scan.nextInt();
            if(!checkRange(selectedRow-1, selectedColumn-1))
            {
                System.out.println("Ge�ersiz Koordinat!");
                continue;
            }
            if(checkMine(selectedRow-1,selectedColumn-1))
            {
                System.out.println("Game Over!");
                break;
            }
            showMap[selectedRow-1][selectedColumn-1] = String.valueOf(checkPoint(selectedRow-1, selectedColumn-1));
            if(checkWin())
            {
                System.out.println("Tebrikler Oyunu Kazand�n�z !!!");
                break;
            }

        }

    }
}