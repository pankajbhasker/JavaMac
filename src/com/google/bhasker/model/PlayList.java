package com.google.bhasker.model;

public class PlayList implements Comparable<PlayList>{

  int playListId;
  int playListVideo;
  String playListName;

  public PlayList() {
  }

  public PlayList(int playListId, int playListVideo, String playListName) {
    this.playListId = playListId;
    this.playListVideo = playListVideo;
    this.playListName = playListName;
  }

  public int getPlayListId() {
    return playListId;
  }

  public void setPlayListId(int playListId) {
    this.playListId = playListId;
  }

  public int getPlayListVideo() {
    return playListVideo;
  }

  public void setPlayListVideo(int playListVideo) {
    this.playListVideo = playListVideo;
  }

  public String getPlayListName() {
    return playListName;
  }

  public void setPlayListName(String playListName) {
    this.playListName = playListName;
  }

  @Override
  public String toString() {
    return "PlayList{" +
        "playListId=" + playListId +
        ", playListVideo=" + playListVideo +
        ", playListName=" + playListName +
        '}';
  }

  @Override
  public int compareTo(PlayList o) {
    return 0;
  }
}
