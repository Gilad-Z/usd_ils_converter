package CoinCalc.LogsWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LogsWriter implements Logger {
    private static LogsWriter instance = null;


    private LogsWriter(){}


    public static  LogsWriter getInstance(){
        if (instance == null){
            instance = new LogsWriter();
        }
        return instance;
    }

    @Override
    public void writeToFile(String content)throws IOException{
        File file = new File("c:\\QA Course\\result.txt");
        file.createNewFile();
        String filePath ="c:\\QA Course\\result.txt";
        Files.writeString(Path.of(filePath), content+"\n", StandardOpenOption.APPEND);
    }
 }
