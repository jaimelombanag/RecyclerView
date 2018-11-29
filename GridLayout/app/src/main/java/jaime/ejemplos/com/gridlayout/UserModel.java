package jaime.ejemplos.com.gridlayout;

import java.util.Date;

public class UserModel implements ItemInterface{
    public String name;
    public String phone;
    public Date jDate;


    public UserModel(String name, String phone, Date jDate) {
        this.name = name;
        this.phone = phone;
        this.jDate = jDate;
    }

    @Override
    public boolean isSection() {
        return false;
    }
}