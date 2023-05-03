package org.example.Solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String DirectoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName){
        this.DirectoryName =directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println(DirectoryName+" directoryName");
        for (FileSystem fileSystem:fileSystemList) {
            fileSystem.ls();
        }
    }
}
