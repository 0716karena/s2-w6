import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;

/**
 * CityPopulationAnalyzer
 * 
 * This program reads city names and population data from a file and stores them
 * in sorted arrays. The data is sorted as it's read in, preparing it for
 * efficient searching using binary search.
 * 
 * YOUR TASK:
 * Complete the methods marked with TODO comments
 */
public class CityPopulationAnalyzer {

    private String[] cityNames; // Array to store city names
    private double[] populations; // Array to store populations
    private int count; // Track how many cities we've read
    private static final int INITIAL_CAPACITY = 150; // Start with capacity for ~150 cities

    /**
     * Constructor - initializes the arrays
     */
    public CityPopulationAnalyzer() {
        cityNames=new String[INITIAL_CAPACITY];
        populations = new double[INITIAL_CAPACITY];
        count=0;
        // TODO: Initialize cityNames array with INITIAL_CAPACITY
        // TODO: Initialize populations array with INITIAL_CAPACITY
        // TODO: Set count to 0
    }

    /**
     * Reads city data from a file and inserts it into sorted arrays
     * 
     * File format:
     * City Name
     * Population (as number)
     * City Name
     * Population (as number)
     * ... (alternating pattern)
     * 
     * @param filename the path to the data file
     * @throws IOException, InputMismatchException if the file cannot be found or
     *                      read
     */
    public void readAndSortData(String filename)throws IOException, InputMismatchException{

        // TODO: Create a File object with the filename
        // TODO: Create a Scanner to read from the file

        // TODO: Read pairs of city name and population
        // HINT: Use a while loop with scanner.hasNextLine()
        // HINT: Read city name first, then check if there's a population line
        // HINT: Parse the population as a double (use Double.parseDouble())
        // HINT: Call insertSorted() for each city/population pair
        // HINT: If array is full, call resizeArrays()
        // TODO: Close the scanner
        Scanner s = new Scanner(new File(filename));
        while (s.hasNextLine()) {
            String city = s.nextLine();
            double pop = -1;
            if (s.hasNextLine()) {
                pop = Double.parseDouble(s.nextLine());
            }
        }
        s.close();

        System.out.println("Successfully read " + count + " cities from " + filename);
    }

    /**
     * Inserts a city and its population into the arrays in sorted order
     * (sorted by population, highest to lowest)
     * 
     * @param cityName   the name of the city
     * @param population the population of the city
     */
    private void insertSorted(String cityName, double population) {
        // TODO: Find the correct position for insertion
        // HINT: Start at 0 and go to count - why count?
        // HINT: Loop through existing elements to find where this population should go
        // HINT: We want highest populations first, so insert before any smaller
        // population

        // TODO: Shift elements to the right to make room
        // HINT: Start from 0 and move to correct position
        // HINT: Move both cityNames and populations arrays

        // TODO: Insert the new city and population at the correct position

        // TODO: Increment count
    }

    /**
     * Doubles the size of the arrays when they get full
     */
    private void resizeArrays() {
                    double[]temp=new double[populations.length*2];
        if(count*0.8>=populations.length ){
            for(int i=0;i<count;i++){
                temp[i]=populations[i];
            }
        }populations=temp;
                            String[]bah=new String[cityNames.length*2];

        if(count*0.8>=cityNames.length){
            for(int i=0;i<count;i++){
                bah[i]=cityNames[i];
            }
        }
        // TODO: Create new arrays twice the current size

        // TODO: Copy all existing data to the new arrays
        // HINT: Use a loop from 0 to count

        // TODO: Update the instance variables to point to the new arrays

        System.out.println("Arrays resized to capacity: " + cityNames.length);
    }

    /**
     * Displays the top N cities by population
     */
    public void displayTopCities(int n) {
        System.out.println("\n=== Top " + n + " Cities by Population ===");
        // TODO go for it
    }

    /**
     * Returns the number of cities loaded
     */
    public int getCount() {
        // TODO
        return -1;
    }

    /**
     * Returns the largest population (arrays are sorted high to low)
     */
    public double getLargestPopulation() {
        // TODO
        return -1;
    }

    /**
     * Returns the city name with the largest population
     */
    public String getCityWithLargestPopulation() {
        // TODO
        return "";
    }

    /**
     * Returns the smallest population (arrays are sorted high to low)
     */
    public double getSmallestPopulation() {
        // TODO
        return -1;
    }

    /**
     * Returns the city name with the smallest population
     */
    public String getCityWithSmallestPopulation() {
        // TODO
        return "";
    }

    /**
     * Returns the population for a given city name
     * 
     * @param cityName the city to find
     * @return the population if found, or -1 if not found
     */
    public double findPopulationOfCity(String cityName) {
        // TODO
        return -1;
    }

    /**
     * Returns true if the city name exists in the array
     * Must use binary search
     * 
     * @param cityName the city to search for
     * @return true if found, false otherwise
     */
    public boolean containsCityName(String cityName) {
        // TODO
        return false;
    }

    /**
     * Returns the average population of all cities
     * 
     * @return average population, or 0 if no cities
     */
    public double averagePopulationSize() {
        // TODO
        return 0;
    }

}
