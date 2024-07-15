package compositePattern;

public class Main {
    public static void main(String[] args) {
        FileSystem file=new File("Main.java");
        Directory dir=new Directory("pattern");
        dir.add(file);
        Directory dir2=new Directory("src");
        dir2.add(dir);
        dir2.ls();

    }
}
