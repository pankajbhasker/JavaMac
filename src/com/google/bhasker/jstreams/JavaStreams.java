package com.google.bhasker.jstreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams extends IOException {
  public static void main(String args[]) throws IOException {

    // Integer Stream
    // 1. ForEach
    System.out.println("1 Integer stream with forEach");
    IntStream.range(0, 10).forEach(System.out::println);
    // 2. count
    long count   = IntStream.range(0, 10).count();
    System.out.println("Range count from 0 to 10 : "+count);

    // 3. toArray
    int[] intArray = IntStream.range(0, 15).toArray();
    System.out.println("Converted stream to Array 0 to 15 : "+ Arrays.toString(intArray));

    // 4. Average
    OptionalDouble average = IntStream.range(0, 10).average();
    System.out.println("Range average from 0 to 10 : "+ average.getAsDouble());

    // 5. skip
    System.out.println("5. Integer stream with skip and forEach : ");
    IntStream.range(0, 10)
        .skip(6)
        .forEach(x -> System.out.println(x));
        //.forEach(System.out::println);



    // 6. sum
    System.out.println("6. Integer stream  range sum : " + IntStream.range(0, 5)
        .sum());
    /**
     *     int sumOfIntStreamRange =   IntStream.range(0, 5).sum();
     *     System.out.println("6. Integer stream  range sum " + sumOfIntStreamRange);
     */

    // 7.  Stream "of" function
    //Stream.of(1,2,3,4,5)
    // Stream.of("Pankaj", "Nunu", "Love", "Married");
    System.out.println("7 : finding first value in Stream:  " + Stream.of("English","Hindi", "GS","SSC", "Math").findFirst().get());
    System.out.println("7 : finding first value in Stream:  " + Stream.of("Geography","History","Civics","Economics","English","Hindi", "GS","SSC", "Math").sorted().findFirst().get());


    //8. Stream Filter
    Set<String> filteredSet = Stream.of("Pankaj", "Nunu", "Love", "Neha","Married").filter(a -> a.equals("Nunu")).collect(Collectors.toSet());
    System.out.println("8 : Finding filtered set: "+ filteredSet);
    System.out.println("Not equals Neha : ");
    Stream.of("Pankaj", "Nunu", "Love", "Married").filter(a -> !a.equals("Neha")).forEach(a-> System.out.println(a));

    System.out.println("Start with N : ");
    Stream.of("Pankaj", "Nunu", "Neha","Love", "Married").filter(a -> a.startsWith("N")).forEach(a-> System.out.println(a));

    // Converting String Array to Stream
    String[] arrayOfString ={"Ram","Shyam","Amar","Akbar","Arcus","Marcus"};
    String s = Arrays.stream(arrayOfString).sorted().findFirst().get();
    System.out.println("Converted String Array to Stream , sort and find first : "+ s);

    // Printing only those not start with A
    List<String> strNotA = Arrays.stream(arrayOfString).sorted().filter(a ->  !a.startsWith("A")).collect(
        Collectors.toList());
    System.out.println("Converted String Array to Stream , sort and filter name not start with A : "+ strNotA);

    // Map function of stream
    System.out.println("Converted String Array to Stream , sort and filter name not start with A  and map to lowercase : ");
    Arrays.stream(arrayOfString).sorted().filter(a ->  !a.startsWith("A")).map(String::toLowerCase).forEach( a-> System.out.println(a));


    // 9. Stream read row from file row and  sort , filter which lines greater than 10

    Stream<String> rows = Files.lines(Paths.get("src/com/google/bhasker/tempFile.txt"));
    System.out.println(" Printing rows of file : ");
    rows.forEach(System.out::println);
    rows.close();

    Stream<String> filterRows = Files.lines(Paths.get("src/com/google/bhasker/tempFile.txt"));
    System.out.println("Printing filtered rows of file : ");
    filterRows.filter(a -> a.length() < 15).forEach(System.out::println);

    List<String> listRows =
        Files.lines(Paths.get("src/com/google/bhasker/tempFile.txt"))
        .map(x -> x + " Hanuman")
            .map(String:: toLowerCase)
        .filter(a-> a.contains("ram"))

        .collect(Collectors.toList());
    System.out.println("Printing List of rows in file : " + listRows);

  }

  public void streamMap() throws IOException {
    Stream<String> stream = Files.lines(Paths.get("src/com/google/bhasker/datafiles/Student.txt")).collect(
        Collectors.toList()).stream();
  }
}
