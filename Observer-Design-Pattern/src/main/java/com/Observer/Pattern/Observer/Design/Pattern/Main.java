package com.Observer.Pattern.Observer.Design.Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        YoutubeChannel channel = new YoutubeChannel(); // create object of channel

        Subsriber vaibhav = new Subsriber("vaibhav"); // create object of subscriber
        Subsriber Ajay = new Subsriber("Ajay");

        channel.subscribe(vaibhav); // subscribe to channel
        channel.subscribe(Ajay); // subscribe to channel

        channel.notifyChanges("LLD"); // notify all subscribers when new video is uploaded
       channel.notifyChanges("ML");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // this is used to take input from user

   // we create subsriber using buffer Reader

        while (true){ // this is used to run the program until user exit
            System.out.println("Press 1 to pload Videos");
            System.out.println("Press 2 create new subscriber");
            System.out.println("Press 3 to exit");

            int c =Integer.parseInt(br.readLine());
            if(c == 1){
                // new video upload
                System.out.println("Enter the name of video");
                String videoName = br.readLine();
                channel.notifyChanges(videoName); // notify all subscribers when new video is uploaded


            } else if (c == 2) {
                 // create new subscriber
                System.out.println("Enter the name of subscriber");
                String name = br.readLine();
                Subsriber newSub = new Subsriber(name); // create object of subscriber
               channel.subscribe(newSub);



            } else if (c == 3) {
                // exit

                System.out.println("Thank you for using");
                break;



            }
            else {
                // exit wrong input
                System.out.println("Wrong input");
            }
        }

    }
}
