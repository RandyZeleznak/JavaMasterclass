package com.zsquared.innerclasseschallenge;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        Album album = new Album("Stressfest","Steve Morse Band");
        album.addSong("Stressfest",3.25);
        album.addSong("Rising Power",3.75);
        album.addSong("Eyes of a Child",2.87);
        album.addSong("Nightwalk",5.11);
        album.addSong("Brave New World", 2.55);
        album.addSong("4 minutes to Live",3.25);
        album.addSong("The Easy Way",6.10);
        album.addSong("Glad to Be",2.05);
        album.addSong("Delicate Balance",3.87);
        album.addSong("Live to Ride",2.13);
        albums.add(album);

        album = new Album("For those about to Rock","AC/DC");
        album.addSong("For those about to Rock",5.44);
        album.addSong("I put the finger on You",3.25);
        album.addSong("Let's go",4.15);
        album.addSong("Inject the venom",2.75);
        album.addSong("Snowballed",3.15);
        album.addSong("EVil Walks",3.24);
        album.addSong("C.O.D.",3.10);
        album.addSong("Breaking the Rules",4.13);
        album.addSong("Night of the Long Knives",2.87);
        album.addSong("Live to Ride",3.12);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Stressfest", playlist);
        albums.get(0).addToPlaylist("Glad To Be", playlist);
        albums.get(1).addToPlaylist("C.O.D.", playlist);
        albums.get(1).addToPlaylist("Let's go", playlist);
        albums.get(0).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(12, playlist);

        play(playlist);

    }


        private static void play(LinkedList<Song> playlist){
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean forward = true;

            ListIterator<Song> listIterator = playlist.listIterator();
            if(playlist.size() == 0){
                System.out.println(" No songs to play");
                return;
            } else {
                System.out.println("Now playing " +listIterator.next().toString());
            }
            printMenu();
            

            while(!quit) {
                int action = scanner.nextInt();
                scanner.nextLine();

                switch(action){
                    case 0:
                        System.out.println("Playlist completed");
                        quit=true;
                        break;
                    case 1:
                        if(!forward) {
                            if(listIterator.hasNext()) {
                                listIterator.next();
                            }
                            forward = true;
                        }
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else {
                            System.out.println("We have reached the end of the playlist");
                            forward = false;
                        }
                        break;
                    case 2:
                        if(forward) {
                            if(listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            forward = false;
                        }
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        } else {
                            System.out.println("We are at the start of the playlist");
                            forward = true;
                        }
                        break;
                    case 3:
                        if(forward) {
                            if(listIterator.hasPrevious()) {
                                System.out.println("Now replaying " + listIterator.previous().toString());
                                forward = false;
                            } else {
                                System.out.println("We are at the start of the list");
                            }
                        } else {
                            if(listIterator.hasNext()) {
                                System.out.println("Now replaying " + listIterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("We have reached the end of the list");
                            }
                        }
                        break;
                    case 4:
                        printList(playlist);
                        break;
                    case 5:
                        printMenu();
                        break;
                    case 6:
                        if(playlist.size() >0) {
                            listIterator.remove();
                            if(listIterator.hasNext()) {
                                System.out.println("Now playing " + listIterator.next());
                            } else if(listIterator.hasPrevious()) {
                                System.out.println("Now playing " + listIterator.previous());
                            }
                        }
                        break;
                }



            }

        }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }





}
