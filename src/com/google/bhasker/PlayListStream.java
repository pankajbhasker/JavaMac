package com.google.bhasker;

import com.google.bhasker.model.PlayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayListStream {

  public static void main(String args[]) {



    List<Integer> listOfDob = new ArrayList<>();
    listOfDob.add(1985);
    listOfDob.add(1991);
    listOfDob.add(1987);
    listOfDob.add(1986);
    listOfDob.add(1989);
    listOfDob.add(1988);
    listOfDob.add(1993);
    listOfDob.add(1992);

    List<String> listOfPlayListString = new ArrayList<String>();
    listOfPlayListString.add("Budgie");
    listOfPlayListString.add("Bhakti Song");
    listOfPlayListString.add("India New");
    listOfPlayListString.add("Pop Songs ");
    listOfPlayListString.add("Ticktok Video");
    listOfPlayListString.add("Food Mania");
    listOfPlayListString.add("Dance Mania");
    listOfPlayListString.add("Learn Mania");
    listOfPlayListString.add("Photo Mania");
    listOfPlayListString.add("Ram");
    listOfPlayListString.add("Kanha");
    listOfPlayListString.add("Nannan");

    System.out.println("Stream Sorted start");
    Set<String> sortedListPlaylist = listOfPlayListString.stream().sorted().collect(Collectors.toSet());
    System.out.println("Stream String Sorted : "+ sortedListPlaylist);

    Set<Integer> sortedIntListPlaylist = listOfDob.stream().sorted().collect(Collectors.toSet());
    System.out.println("Stream String Sorted : "+ sortedIntListPlaylist);

    // Comparator

    Set<PlayList> sortedPlayList = getPlayListInfo().stream().sorted((a1, a2) -> a1.compareTo(a2)).collect(
        Collectors.toSet());
    System.out.println("Stream playList Sorted : "+ sortedPlayList);

    //Sorting by playlistName
    Set<PlayList> sortedPlayListByName = getPlayListInfo().stream().sorted((a1, a2) -> a1
        .getPlayListName().compareTo(a1.getPlayListName())).collect(
        Collectors.toSet());
    System.out.println("Stream playList Sorted by Name : "+ sortedPlayList );

    // Getting min dob
    Integer minDob =  listOfDob.stream().min((l1, l2) -> l1.compareTo(l2)).get();
    System.out.println("Stream playList min dob is : "+ minDob );

    // Getting max dob
    Integer maxDob =  listOfDob.stream().max((l1, l2) -> l1.compareTo(l2)).get();
    System.out.println("Stream playList max dob is : "+ maxDob );

    // Getting  min from playlist Object
    PlayList minNameObject =  getPlayListInfo().stream().min((l1, l2) -> l1.getPlayListName().compareTo(l2.getPlayListName())).get();
    System.out.println("Stream playList min Name is : "+ minNameObject.getPlayListName() );

    // Getting  max from playlist Object
    PlayList maxNameObject =  getPlayListInfo().stream().max((l1, l2) -> l1.getPlayListName().compareTo(l2.getPlayListName())).get();
    System.out.println("Stream playList max Name is : "+ maxNameObject.getPlayListName() );

    // Using stream forEach
    listOfPlayListString.stream().forEach(s ->  System.out.println(s));

    System.out.println("Stream forEach example for object " );
    getPlayListInfo().stream().forEach(s -> System.out.println(s.getPlayListName()));
    getPlayListInfo().stream().forEach(System.out::println);


    System.out.println("Stream toArray method example " );
    Object[] dobArray =   listOfDob.stream().toArray();
    System.out.println("Stream toArray method return dob Array  " + Arrays.toString(dobArray));


    System.out.println("Stream toArray method example typecasting " );
    Integer[] dobIntArray =   listOfDob.stream().toArray(Integer[] :: new);
    System.out.println("Stream toArray method return dob Array String " + dobIntArray);

    // Using stream count method
    long streamCount = listOfPlayListString.stream().count();
    System.out.println("Stream count example  "+ streamCount );

    // filter with count example
    listOfDob.stream().filter(a -> a > 1986).count();
    System.out.println("Stream count with filter example  "+ listOfDob.stream().filter(a -> a > 1988).count() );

    // Comparing hashcode of rawdata and stream

    int rawDataHashCode = listOfDob.hashCode();
    int streamHashCode = listOfDob.stream().hashCode();
    System.out.println("HashCode for rawData : " +rawDataHashCode+ " and stream HashCode  "+ streamHashCode );



  }

  public static List<PlayList> getPlayListInfo(){
    List<PlayList> listOfPlayList = new ArrayList<>();

    listOfPlayList.add(new PlayList(1, 1987,"Rock"));
    listOfPlayList.add(new PlayList(2, 1992,"Theme"));
    listOfPlayList.add(new PlayList(3, 1991,"Trance"));
    listOfPlayList.add(new PlayList(6, 1991,"Acostic"));
    listOfPlayList.add(new PlayList(8, 1996,"Abacus"));
    listOfPlayList.add(new PlayList(4, 1986,"Rack"));
    listOfPlayList.add(new PlayList(5, 1993,"Mythological"));
    listOfPlayList.add(new PlayList(7, 1994,"HipHop"));
    return listOfPlayList;
  }

}
