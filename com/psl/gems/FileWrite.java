package com.psl.gems;

import java.io.*;
import java.util.*;

import com.psl.gems.Cards.Card;

public class FileWrite {

    public static void writeHTMLOutput(List<Player> players) {

        try {
            //Write mode if the file exists then open the file and write in it 
            //or create the file with the given name
            FileWriter writer = new FileWriter("cardgame.html");
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html lang=\"en\">\n");
            writer.write("<head>\n");
            writer.write("<title>Document</title>\n");
            writer.write("</head>\n");
            writer.write("<body>\n");
            writer.write("<section>\n");
            for (Player p : players) {
                writer.write("<div id=\"" + p.getName() + "\">\n");
                for (Card card : p.getPlayerCard()) {
                    writer.write("<div data-card=\"" + card + "\" />\n");
                }
                writer.write("</div>\n");
            }
            writer.write("</div>\n");
            writer.write("</section>\n");
            writer.write("</body>\n");
            writer.write("</html>");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
