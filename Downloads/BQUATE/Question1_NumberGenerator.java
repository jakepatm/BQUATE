// Prints numbers 1 to 100, where % 3 = Multi, where % 5 = IT, where % 15 = Mulitipli
class numberGenerator 
{
    // Operating upon execution
    public static void main(String args[])
    {
        // Array that will print at the end of populating
        String[] printOut = new String[100];
        
        // Populates all values that are not multiples of 3, 5, or both
        for(int i = 1; i < 101; i++)
        {
            if(!(i % 5 == 0 || i % 3 == 0))
            {
                printOut[i--] = Integer.toString(i);
            }
        }
        
        // Populates all values where % 3 == 0
        for(int i = 3; i < 101; i+=3)
        {
            printOut[i--] = "Multi";
        }
        
        // Populates all values where % 5 == 0
        for(int i = 5; i < 101; i+=5)
        {
            printOut[i--] = "IT";
        }
        
        // Populates all values where % 15 == 0
        for(int i = 15; i < 101; i+=15)
        {
            printOut[i--] = "Multipli";
        }
        
        // Prints populated array
        for(int i = 0; i <= 99; i++)
        {
            System.out.println(printOut[i]);
        }
    }
}