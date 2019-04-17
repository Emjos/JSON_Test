package com.company;


import java.io.*;


public class AddToFile {
    static int couunter = 1;
    String fileName = "List.txt";
    public void AddFile(Currency from, Currency to, double ammountIn, double ammountOut) {

        try (

                var fileWriter = new FileWriter(fileName, true);
                var writer = new BufferedWriter(fileWriter);
        ) {


            writer.write("Tranzakcja " + couunter++ + " wymiana:" + ammountOut + " " + from.getName() +
                    " na :" + ammountIn + " " + to.getName());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }

    public void cleanList() {

        try (

                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter);
        ) { writer.write("");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);

        }
    }
    public void loadList() {
        try(
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader);
        ){
            String nextLine = null;
            while ((nextLine=reader.readLine())!= null){
                System.out.println(nextLine);
                System.out.println("----------");
            }

        }catch (IOException e){}
    }
}