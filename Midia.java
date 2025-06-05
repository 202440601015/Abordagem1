import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;

import Exeptions.IllegalPathException;

public abstract class Midia extends Worker {
    public Midia (){
        super.tools.add("ffmpeg");
    }

    public void changeType(Archive archive) throws IllegalPathException{

        String output = "";     

        try {
            ProcessBuilder command = new ProcessBuilder(
                    tools.get(1),
                    "-FileTypeExtension",
                    "-s4",
                    archive.getPath());

            command.redirectErrorStream(true);
            Process exif = command.start();
            Process sla = exif.onExit().get();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(exif.getInputStream()));

            String text;
            while ((text = reader.readLine()) != null) {
                output += text + "\n";
            }

            if (sla.exitValue() != 0) {
                throw new IllegalPathException("Path error: "+ output);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
        } catch (ExecutionException e) {
        }

        if(archive.getPath().endsWith(output)){
            
        }

    }

    public void concatenate(Archive archive1, Archive archive2){

    }

    public void resize(Archive archive, String size){

    }




}
