import java.io.IOException;
import java.util.InputMismatchException;

public class CityPopulationRunner {
    /**
     * Main method - demonstrates how to use the analyzer
     */
    public static void main(String[] args) {
        CityPopulationAnalyzer analyzer = new CityPopulationAnalyzer();
        
        // The file path - adjust if needed
        String filename = "world-city-populations.txt";
        
        
        try {
            // Read and sort the data
            analyzer.readAndSortData(filename);
            
            // Display results
            analyzer.displayTopCities(20);
            
            System.out.println("\nTotal cities loaded: " + analyzer.getCount());

            // Largest and smallest
            System.out.println("Largest city: " + analyzer.getCityWithLargestPopulation());
            System.out.println("Largest population: " + analyzer.getLargestPopulation());
            System.out.println("Smallest city: " + analyzer.getCityWithSmallestPopulation());
            System.out.println("Smallest population: " + analyzer.getSmallestPopulation());

            // Average population
            System.out.println("Average population: " + analyzer.averagePopulationSize());

            // Binary search: contains city name
            String searchCity = "Tokyo";
            System.out.println("Contains '" + searchCity + "': " + analyzer.containsCityName(searchCity));

            // Find population of a city
            System.out.println("Population of " + searchCity + ": " + analyzer.findPopulationOfCity(searchCity));
                        

            // --- After everything looks solid above:
            // TODO: Purposefully break your code by changing the filename to something incorrect to see IOException
            // TODO: Purposefully change the data file itself by removing(save it!) a population number so that the 
            //       InputMismatchException occurs
            // TODO: What happens if the file is empty? Try it
            // TODO: What is there is only two lines one country one population? Try It
    
        } catch (IOException e) {
            System.err.println("IOException: The file '" + filename + "' was not found or could not be read.");
            System.err.println("Please make sure the file exists in the correct location.");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.err.println("InputMismatchException: The file contains invalid data types.");
            System.err.println("Please check that population values are numeric.");
            e.printStackTrace();
        }
    }
}
