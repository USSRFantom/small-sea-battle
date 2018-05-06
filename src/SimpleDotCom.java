public class SimpleDotCom {
    int[] locationCells;
    int numofHits = 0;

    public void setLocationCells (int[] locs)
    {
        locationCells = locs;
    }
    public String checkYourdelf (String stringGuess)
    {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell)
            {
                result = "Попал";
                numofHits++;
                break;
            }
        }
        if (numofHits == locationCells.length)
        {
            result = "Потопил";

        }
        System.out.println(result);
        return result;
    }
}
