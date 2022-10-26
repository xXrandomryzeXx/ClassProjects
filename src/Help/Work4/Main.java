/* Current file: Main.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Help.Work4;

class Picture{
    String name = "", author = "";
    int price=0, ID=0;
    String dateOfCreation = ""; //yyyy::mm::dd
    Picture(String name, String author, int price, int ID, String dateOfCreation){
        setName(name);
        setAuthor(author);
        setPrice(price);
        setID(ID);
        setDateOfCreation(dateOfCreation);
    }

    public void displayInfo(){
        System.out.println("Picture name: " + getName() + "\n" + "Author: " + getAuthor() + "\n" + "Price: " + getPrice());
        System.out.println("ID: " + getID() + "\n" + "Date of creation: " + getDateOfCreation() + "\n");
    }

    public void setName(String txt){
        name = txt;
    }
    public void setAuthor(String txt){
        author = txt;
    }
    public void setPrice(int value){
        price = value;
    }
    public void setID(int value){
        ID = value;
    }
    public void setDateOfCreation(String date){
        dateOfCreation = date;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public int getID(){
        return ID;
    }
    public String getDateOfCreation(){
        return dateOfCreation;
    }

}

class Pictures{
    Picture[] pics = new Picture[10];

    public void addPicture(Picture pic){
        boolean hasDouble = false;
        for (Picture picture : pics) {
            if (picture == pic) {
                hasDouble = true;
                System.out.println("Picture already exists in the array");
            }
        }

        for(int i = 0; i < pics.length && !hasDouble; i++){
            if(pics[i] == null){
                pics[i] = pic;
                break;
            }
        }

    }

    public void displayPicture(String authorName){
        boolean printAll = authorName.length() == 0;
        for(Picture picture : pics){
            if(picture!=null){
                if(printAll || authorName.equals(picture.getAuthor())){
                    picture.displayInfo();
                }
            }

        }
    }

    public void displayMostExpensivePicture(){
        int highest = 0;
        for(Picture picture : pics){
            if(picture!=null) {
                if (picture.getPrice() > highest) {
                    highest = picture.getPrice();
                }
            }
        }

        for(Picture picture : pics){
            if(picture!=null) {
                if (picture.getPrice() == highest) {
                    picture.displayInfo();
                }
            }
        }
    }

    public double getAverageCost(String authorName){
        boolean getAll = authorName.length() == 0;
        int all = 0;
        int num = 0;

        for(Picture picture : pics){
            if(picture!=null) {
                if (getAll || picture.getAuthor().equals(authorName)) {
                    all += picture.getPrice();
                    num += 1;
                }
            }
        }
        return (double)all / num;
    }

}

public class Main {
    public static void main(String[] args){
        Picture gHills = new Picture("GreenHills", "Microsoft", 4500000, 0, "1998::07:15");
        System.out.println("gHills:");
        gHills.displayInfo();

        Picture bHills = new Picture("BlueHills", "Microsoft", 2500000, 1, "1998::08:14");
        Picture rHills = new Picture("RedHills", "Microsoft", 7500000, 2, "1998::10:27");
        Picture yHills = new Picture("YellowHills", "Microsoft", 1500000, 3, "1999::01:08");
        Picture chillSummer = new Picture("ChillSummer", "J.K", 500000, 4, "2006::08:14");
        Picture warmIce = new Picture("WarmIce", "L.M", 760000, 5, "2019::10:27");
        Picture soSoWeather = new Picture("SoSoWeather", "J.K", 930000, 6, "2004::01:08");
        Picture whiteSpot = new Picture("WhiteSpot", "L.M", 1000, 7, "2021::06::01");

        Pictures pictures = new Pictures();
        pictures.addPicture(gHills);
        pictures.addPicture(bHills);
        pictures.addPicture(rHills);
        pictures.addPicture(yHills);
        pictures.addPicture(chillSummer);
        pictures.addPicture(warmIce);
        pictures.addPicture(soSoWeather);
        pictures.addPicture(whiteSpot);

        System.out.println("\nPictures by Microsoft:");
        pictures.displayPicture("Microsoft");
        System.out.println("Pictures by Microsoft average cost: " + pictures.getAverageCost("Microsoft"));

        System.out.println("\nPictures by J.K:");
        pictures.displayPicture("J.K");
        System.out.println("Pictures by J.K average cost: " + pictures.getAverageCost("J.K"));

        System.out.println("\n Most expensive picture/s: ");
        pictures.displayMostExpensivePicture();

        System.out.println("\n All pictures");
        pictures.displayPicture("");

    }
}
