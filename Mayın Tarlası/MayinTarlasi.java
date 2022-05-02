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
        System.out.println("--------- Mayýn Tarlasý ---------");
        int minePiece = row * column / 4;
        //--------- Gösterilecek Map ---------
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
        // ------ Seçilen konumda map aralýðýmýzda mý kontrol ediyoruz ---------
        return x < row && y < column;
    }
    boolean checkMine(int x, int y)
    {
        // ------ Seçilen konumda mayýn varsa geriye true döndürerek yarýþmayý sonlandýracaðýz. ---------
        return originalMap[x][y].equals("*");
    }
    int checkPoint(int x, int y)
    {
        int result = 0;
        // ------ Seçilen Konumun Üst Komþusu varmý kontrol ediyoruz. --------
        if(y - 1 >= 0)
        {
            // ------ Seçilen Konumun Sol Üst Komþusunu Kontrol Ediyoruz. Komþusunda mayýn olup olmadýðýna bakýyoruz ----------
            if(x -1 >= 0)
            {
                if(originalMap[x-1][y-1].equals("*")) result++;
            }
            //------ Seçilen Konumun Üst Komþusunu Kontrol Ediyoruz
            if(x < column)
            {
                if(originalMap[x][y-1].equals("*")) result++;
            }
            //------ Seçilen Konumun Sað Üst Komþusunu Kontrol Ediyoruz
            if(x + 1 < column)
            {
                if(originalMap[x+1][y-1].equals("*")) result++;
            }
        }
        if(y  < row)
        {
            // ------ Seçilen Konumun Sol Komþusunu Kontrol Ediyoruz. Komþusunda mayýn olup olmadýðýna bakýyoruz ----------
            if(x -1 >= 0)
            {
                if(originalMap[x-1][y].equals("*")) result++;
            }
            //------ Seçilen Konumun Sað Komþusunu Kontrol Ediyoruz
            if(x + 1 < column)
            {
                if(originalMap[x+1][y].equals("*")) result++;
            }
        }
        // ------ Seçilen Konumun Alt Komþusu varmý kontrol ediyoruz. --------
        if(y + 1 < row )
        {
            // ------ Seçilen Konumun Sol Alt Komþusunu Kontrol Ediyoruz. Komþusunda mayýn olup olmadýðýna bakýyoruz ----------
            if(x -1 >= 0)
            {
                if(originalMap[x-1][y+1].equals("*")) result++;
            }
            //------ Seçilen Konumun Alt Komþusunu Kontrol Ediyoruz
            if(x < column)
            {
                if(originalMap[x][y+1].equals("*")) result++;
            }
            //------ Seçilen Konumun Sað Alt Komþusunu Kontrol Ediyoruz
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
            System.out.print("Satýr Giriniz : ");
            int selectedRow = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            int selectedColumn = scan.nextInt();
            if(!checkRange(selectedRow-1, selectedColumn-1))
            {
                System.out.println("Geçersiz Koordinat!");
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
                System.out.println("Tebrikler Oyunu Kazandýnýz !!!");
                break;
            }

        }

    }
}