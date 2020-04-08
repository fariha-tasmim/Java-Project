package MainFrame;

import java.awt.image.BufferedImage;
import java.sql.Blob;
import javax.swing.ImageIcon;

public class HouseAd {

    String houseId,title,area,city,street,postcode,description,month,ownerName,contactNo,email,adType,customerType;
    private String password;
    double price;
    int noOfRooms, noOfBathrooms, noOfBelcony, floorNo;
    BufferedImage imageOne, imageTwo, imageThree;


    public void setPassword(String password){
	    this.password = password;
    }

    public String getPassword(){
        return password;
    }




}
