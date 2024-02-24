package family.identity.app;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public String getNameFromAge(Integer age) {
        String name;
        if (age < 18) name="coco";
        else if ( age < 30 && age > 20 ) name="smartie";
        else if (age <60 && age >= 55 ) name="dad";
        else if (age < 55 && age > 50 ) name="mom";
        else name="we do not have this family member";
        return name;
    }
    public AppObject getFavDishes(){
        return new AppObject("Ramen");
    }
}














