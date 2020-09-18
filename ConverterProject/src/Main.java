public class Main {

  public static void main(String[] args) {

    try {
      Converter converter = new Converter();

      converter.kelvinToCelcius();
      converter.poundsToKilograms();
      converter.milesToKilometers();

    } catch (Exception e) {
      System.out.println("Error @: " + e);
    }

  }

}
