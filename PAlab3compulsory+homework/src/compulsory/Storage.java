package compulsory;

public interface Storage {
    int getStorageCapacity();
    //schimbam storage-ul din gb in alte unitati de masura
    default int returnStorageInMega(int value){
        return value / 1024;
    }

    default int returnStorageInKilo(int value){
        return value / 1024 / 1024;
    }

    default int returnStorageInByte(int value){
        return value / 1024 / 1024 / 1024;
    }
}
