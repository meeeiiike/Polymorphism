package ie.atu.productv4;
public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myItem = null;

        // BOOKS
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myItem = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myItem = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myItem = myBook;

            // SOFTWARE
        } else if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myItem = mySoftware;

            // MUSIC
        } else if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish You Were Here");
            myMusic.setPrice(9.99);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Group");
            myItem = myMusic;
        } else if (productCode.equalsIgnoreCase("Mike")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Pieces Of A Dream");
            myMusic.setPrice(99.99);
            myMusic.setArtist("Mike");
            myMusic.setLabel("New York Records");
            myItem = myMusic;

            // TV's
        } else if (productCode.equalsIgnoreCase("Samsung")) {
            Tv tv = new Tv();
            tv.setCode(productCode);
            tv.setDescription("4K 60hz");
            tv.setPrice(999.99);
            tv.setManufacturer("Samsung");
            tv.setScreenSize("50 Inch");
            myItem = tv;
        } else if (productCode.equalsIgnoreCase("Asus")) {
            Tv tv = new Tv();
            tv.setCode(productCode);
            tv.setDescription("1440p 120hz");
            tv.setPrice(199.99);
            tv.setManufacturer("Philips");
            tv.setScreenSize("24 Inch");
            myItem = tv;
        }
        return myItem;
    }
}

