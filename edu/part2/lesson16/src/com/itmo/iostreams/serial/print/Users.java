package com.itmo.iostreams.serial.print;

import java.util.*;

/**
 * Created by GilEO on 02.12.2016.
 */
public class Users {

        private Set<String> onlineUsers = new TreeSet<>();

        public void addUser(String login) {
//            System.out.println( login +" connected" );

//            if (!this.onlineUsers.contains(login)) {
                this.onlineUsers.add(login);
//            } else {
//                int i = 1;
//                while(this.onlineUsers.contains(login)) {
//                    login = login + i;
//                    i++;
//                }
//                this.onlineUsers.add(login);
//            }
        }

        public void deleteUser(String login) {
            this.onlineUsers.remove(login);
        }

        public String getUsers() {
            return "Online users: " + this.onlineUsers.toString();
        }

}
