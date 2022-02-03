public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) {

        if(jpg == ImageTypes.JPG) {
            return new JpgReader();
        }
        if (jpg == ImageTypes.BMP) {
            return new BmpReader();
        }
        if(jpg == ImageTypes.PNG){
            return new PngReader();
        }
        throw new IllegalArgumentException("Unknown image type");
    }
}