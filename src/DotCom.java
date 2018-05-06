import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCeels;
    private String name;

    public void setLocationCells(ArrayList<String> loc)
    {
        locationCeels = loc;
    }

    void setName(String n)
    {
        name = n;
    }

    public String checkYourself (String userInput)
    {
        String result = "Мимо";
        int index = locationCeels.indexOf(userInput);
        if (index>=0)
        {
            locationCeels.remove(index);
            if (locationCeels.isEmpty())
            {
                result = "Потопил";
                System.out.println("Ой! вы попали" + name + ":(");
            }else
            {
                result = "Попал";
            }
        }
        return  result;
    }
}
