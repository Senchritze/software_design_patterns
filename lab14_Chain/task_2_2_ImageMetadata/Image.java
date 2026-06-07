public class Image {
    public enum Type {
        bmp,
        png,
        jpg
    }

    private Type type;
    private String camera;

    private String creationDate;
    private String creationTime;
    private String location;
    private String name;

    public Type getType() { return type; }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) { this.camera = camera; }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "type=" + type +
                ", camera='" + camera + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
