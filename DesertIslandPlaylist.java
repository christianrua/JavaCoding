/*
You’re heading to a desert island, cut off from the world, for the next six months. Luckily, you can bring a playlist of your 
favorite music ♪♪

Also, this is a chance to put your hard-earned Java skills to the test. Your mission, should you choose to accept it: 

Build Playlist.java with the best possible playlist of music using a Java ArrayList. Choose wisely.

*/

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
  	ArrayList<String> desertIslandPlaylist =new ArrayList<String>();
    desertIslandPlaylist.add("Song1");
    desertIslandPlaylist.add("Song2");
    desertIslandPlaylist.add("Song3");
    desertIslandPlaylist.add("Song4");
    desertIslandPlaylist.add("Song5");
    desertIslandPlaylist.add("Song6");
    
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    
    desertIslandPlaylist.remove("Song6");
    System.out.println(desertIslandPlaylist.size());
    
    int a=desertIslandPlaylist.indexOf("Song1");
    int b=desertIslandPlaylist.indexOf("Song4"); 
    String aux="Song1"; 
    desertIslandPlaylist.set(a,desertIslandPlaylist.get(b));
    desertIslandPlaylist.set(b,aux);
		System.out.println(desertIslandPlaylist);
    
  }
  
}
