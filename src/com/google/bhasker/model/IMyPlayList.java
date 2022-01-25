package com.google.bhasker.model;

public interface IMyPlayList {

  public void getMyPlayListInfo();
  public void getMyPlaylistName();

  // only difference between default and static is we need to create instance to call the default
  // whereas static can be call using interface name itself
  default void getMyNewDefaultPlaylistName() {
    System.out.println("getting default My new playlist name");
  }

   static void getMyNewStaticPlaylistName() {
    System.out.println("getting static My new playlist name");
  }

  default void getSamePlaylistName() {
    System.out.println("Getting default same playlist name from IMyPlaylist");
  }

  public void getSamePlaylist();
}
