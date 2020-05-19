package appfuncs.funcs;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesFunkes {
    public static List<String> ReadFromFile(String fileName){
        try {
            return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void WriteToFile(String fileName, List<String> goodsList){
        try(FileWriter writer = new FileWriter(fileName, false))
        {
            for (int i = 0; i < goodsList.size(); i++) {
                writer.write(goodsList.get(i) + "\n");
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void Sort(String sourceFileName, String resultFileName){
        List<String> goodsTypes = ReadFromFile(sourceFileName);
        goodsTypes.sort(String::compareTo);
        WriteToFile(resultFileName, goodsTypes);
        System.out.println("sorting completed successfully");
    }

}
