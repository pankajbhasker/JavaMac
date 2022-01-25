package com.google.bhasker.model;

public interface IPlayList {

  public void getPlayListInfo();
  public void getPlayListName();

  default void getSamePlaylistName() {
    System.out.println("Getting default same playlist name from IPlaylist");
  }
  public void getSamePlaylist();
}
