package com.google.bhasker;

import com.google.bhasker.model.IMyPlayList;
import com.google.bhasker.model.IPlayList;

public class DefaultInterfaceMethod implements IMyPlayList, IPlayList {

  public static void main (String args[]) {


    DefaultInterfaceMethod obj =new DefaultInterfaceMethod();
    obj.getMyPlaylistName();
    obj.getMyPlayListInfo();
    obj.getMyNewDefaultPlaylistName();
    IMyPlayList.getMyNewStaticPlaylistName();
    // Calling overridden default method implementation
    // obj.getMyNewStaticPlaylistName();  cant override static method

    // Calling IPlayList Interface
    System.out.println("IPlayList Interface call");

    obj.getPlayListInfo();
    obj.getPlayListName();

    obj.getSamePlaylistName();

    obj.getSamePlaylist();

  }

  @Override
  public void getMyPlayListInfo() {
   System.out.println("getting My playlist info");
  }

  @Override
  public void getMyPlaylistName() {
    System.out.println("getting My playlist name");

  }

  @Override
  public void getMyNewDefaultPlaylistName() {
    System.out.println("overriding the default method to get the My custom  playlist info");
  }

  @Override
  public void getPlayListInfo() {
    System.out.println("Getting playlist info");
  }

  @Override
  public void getPlayListName() {
    System.out.println("Getting playlist Name");
  }

  @Override
  public void getSamePlaylistName() {
    IMyPlayList.super.getSamePlaylistName();
    IPlayList.super.getSamePlaylistName();
  }

  @Override
  public void getSamePlaylist() {
    System.out.println("Getting playlist ");
  }

}
