import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Converter {

  private final double KELVIN = 273.15;
  private final double POUNT_TO_KILOGRAM = 0.453592;
  private final double MILE_TO_KILOMETER = 1.60934;
  private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /*
   * Convert kelvin to Celcius
   */
  public void kelvinToCelcius() throws Exception {

    System.out.println("Enter Amount (kelvin to celcius)");
    double userInput = Double.parseDouble(br.readLine());
    double celciusValue = userInput - KELVIN;

    System.out.println(celciusValue + "\n"); 
  }

  /*
   * Convert Pounds to Kilograms
   */
  public void poundsToKilograms() throws Exception {

    System.out.println("Enter Amount (pound to kilograms)");
    double userInput = Double.parseDouble(br.readLine());
    double kilogramValue = userInput * POUNT_TO_KILOGRAM;

    System.out.println(kilogramValue + "\n");
  }

  /*
   * Convert Miles to Kilometers
   */
  public void milesToKilometers() throws Exception {

    System.out.println("Enter Amount (miles to Kilometers)");
    double userInput = Double.parseDouble(br.readLine());
    double KilometerValue = userInput * MILE_TO_KILOMETER;

    System.out.println(KilometerValue);
  }

}