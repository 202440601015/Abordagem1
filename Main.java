import Exeptions.*;

public class Main {
    public static void main(String[] args) {
        
        try{

        Picture PictureWorker = new Picture();
        Archive Doc1 = new Archive("/home/jao/Pictures/73.jpg");

        Doc1.setMetaData(PictureWorker.pickMetaData(Doc1));
        Doc1.setType(PictureWorker.pickType(Doc1));

        System.out.println(Doc1.getMetaData());


        PictureWorker.changeMetaData(Doc1, "comment", "Sexo1");
        
    } catch (IllegalPathException e){
        System.err.println( e.getMessage());
    } catch (IllegalTagException e){
        System.err.println( e.getMessage());
    }


        /* 
        Doc1.setMetaData(PictureWorker.pickMetaData(Doc1));
        Doc1.setType(PictureWorker.pickType(Doc1));

        PictureWorker.changeMetaData(Doc1, "comment", "Sexo1");

        System.out.println(Doc1.getMetaData());

        PictureWorker.changeMetaData(Doc1, "comment", "Sexo2");

        System.out.println(Doc1.getMetaData());

        PictureWorker.undoChanges(Doc1);
        
        System.out.println(Doc1.getMetaData());

        PictureWorker.redoChanges(Doc1);

        //Doc1.setMetaData(PictureWorker.pickMetaData(Doc1));
        System.out.println(Doc1.getMetaData());
   */     
    }
}
