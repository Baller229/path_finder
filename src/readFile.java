import java.io.*;
import java.util.*;

public class readFile {

    private Scanner x;
    private String[] field = new String[100];
    private String[] size = new String[100];
    private char[][] myArray = new char[100][100];
    private HashMap<Character, Integer> Xfield = new HashMap<Character, Integer>();
    public void openFile()
    {
        try {
            x = new Scanner(new File("pathTest.txt"));
        }
        catch (Exception e) {
            System.out.println("Could not find file!");
        }
    }

    public void readFile()
    {
       int rows = 5;
       int columns = 6;
       myArray = new char[rows][columns];
        while(x.hasNextLine()) {
            for (int i=0; i<myArray.length; i++) {
                char[] line = x.nextLine().toCharArray();
                for (int j=0; j<line.length; j++) {
                    myArray[i][j] = Character.valueOf(line[j]);
                }
            }
        }
//        for (int i=0; i<5; i++) {
//            for (int j = 0; j < 6; j++) {
//                if(myArray[i][j] == '#')
//                {
//                    System.out.print(myArray[i][j]);
//                    System.out.print(i);
//                    System.out.print(j);
//
//                }
//
//            }
        System.out.println(calculateStartDestination());
//        }
//            System.out.println(myArray[1][1]);
        //.trim().split("")
        //        int i = 0;
//        while (x.hasNext())
//        {
//            field[i] = x.next();
//            i++;
//        }
//        arrPaste();
    }

    public int[][] calculateStartDestination()
    {
         int[][] startPoint = new int[5][6];
        for (int i=0; i<5; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if(myArray[i][j] == 'S')
                {

                }

            }
        }
        return startPoint;
    }


    public void closeFile()
    {
        x.close();
    }



    public void arrPaste()
    {
        int arrLen = initLength(field);
        int XmapIndex = 0;

        for (int i = 0; i <= arrLen; i++)
        {
            for (int j = 0; j <= arrLen; j++)
            {
                if(!(field[i] == null))
                {
                    Xfield.put(field[i].charAt(j), XmapIndex);
                }

            }
        }
    }

    //Array index counter without null
    int initLength(Object[] myArray) {
        int count = 0;
        for (Object obj : myArray) {
            if ( obj != null ) count++;
        }
        return count;
}
}
