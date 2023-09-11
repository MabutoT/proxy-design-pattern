public class Proxy {
    public static void main(String[] args) {
        System.out.println("Proxy D Pattern!");

        // Creating and displaying images using the Proxy
        Image image1 = new ProxyImage("5 gig image.jpg");
        Image image2 = new ProxyImage("10 gig image.jpg");

        //The real images are loaded and displayed only when needed
        image1.display(); // RealImage object is created and displayed
        image1.display(); // RealImage object is already created, so it is directly displayed

        System.out.println("");

        image2.display();
    }
}