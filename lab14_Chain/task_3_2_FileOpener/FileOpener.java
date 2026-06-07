public interface FileOpener {
    void setNext(FileOpener next);

    void open(String fileName);
}
