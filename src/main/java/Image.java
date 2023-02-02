import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Image {
    private String fileName;
    private double height;
    private double width;
    private ArrayList<String> fileNames = new ArrayList<>();

    public Image(String fileName, double height, double width){
        this.fileName = fileName;
        this.height = height;
        this.width = width;
    }

    public boolean isKnownFileType(){
        if (fileName.contains(".gif")
        || fileName.contains(".jpg")
        || fileName.contains("jpeg")
        || fileName.contains(".png")
        || fileName.contains(".webp")
        || fileName.contains(".bmp")){
            return true;
        }
        return false;
    }

    public boolean isPortrait(){
        if (height > width){
            return true;
        }
        return false;
    }

    public boolean isLandScape(){
        if (height < width){
            return true;
        }
        return false;
    }

    public void sortArrayList(){
        fileNames.add("Apple");
        fileNames.add("Mango");
        fileNames.add("Banana");
        Collections.sort(fileNames);
        System.out.println(fileNames);
    }

    public static void main(String[] args) {
        Image image = new Image("bbb.gif", 21, 20);
        System.out.println(image.isKnownFileType());
        System.out.println(image.isPortrait());
        System.out.println(image.isLandScape());
        image.sortArrayList();
    }

}
